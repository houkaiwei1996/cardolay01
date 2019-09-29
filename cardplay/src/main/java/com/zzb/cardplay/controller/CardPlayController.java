package com.zzb.cardplay.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zzb.cardplay.common.CodeMsg;
import com.zzb.cardplay.common.Constant;
import com.zzb.cardplay.common.Response;
import com.zzb.cardplay.dao.PlayCardsInfoDao;
import com.zzb.cardplay.dao.PlayerInfoDao;
import com.zzb.cardplay.dao.RobotPlayerInfoDao;
import com.zzb.cardplay.pojo.*;
import com.zzb.cardplay.redis.RedisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import util.DateUtils;
import util.IpUtil;
import util.ScoketClient;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class CardPlayController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    PlayerInfoDao playerInfoDao;

    @Autowired
    PlayCardsInfoDao playCardsInfoDao;

    @Autowired
    RobotPlayerInfoDao robotPlayerInfoDao;

    @Autowired
    RedisService redisService;

    private static final Logger logger = LoggerFactory.getLogger(CardPlayController.class);
    //接受请求的时间
    private static long receipttime = 0;
    //结束时间（隔一段时间没有请求响应过来）
    private static long finishtime = 0;

    @ResponseBody
    @RequestMapping("/postCardPlayInfo")
//    @Transactional
    public Response postCardPlayInfo(@RequestBody PostCardPlayInfo postCardPlayInfo, HttpServletRequest request)  {
            //通过IPutil拿到当前IP
            String ip = IpUtil.getIpAddr(request);
            //当前牌局的玩家编号
            String chairId = postCardPlayInfo.getChair_id();
            //地主的编号
            String lastChairId = postCardPlayInfo.getLast_play_id();
            //将对象转换为JSON数据
            String postCardPlayInfoStr = JSON.toJSONString(postCardPlayInfo);
            String ownUid = "";
            logger.debug("收到postCardPlayInfo请求:"+postCardPlayInfoStr);
            System.out.println("收到postCardPlayInfo请求:"+postCardPlayInfoStr);
            //拿到牌
            if(postCardPlayInfo.getAction().equals(Constant.SEND_CARD)){
                logger.info("######################################################拿到牌，牌局开始#####################################################");
                System.out.println("玩家已拿到牌，牌局开始");
                //获取出牌信息(是个list集合，包含当前玩家的信息)
                List<PlayerInfo> playerInfoList = postCardPlayInfo.getPlayer();
                for (int i = 0; i < playerInfoList.size(); i++) {
                    PlayerInfo playerInfo = playerInfoList.get(i);
                    if(chairId.equals(playerInfo.getChairid())){
                        ownUid = playerInfo.getUid();
                    }
                }
            for (int i = 0; i < playerInfoList.size(); i++) {
                PlayerInfo playerInfo = playerInfoList.get(i);
                String playerUid =  playerInfo.getUid();
                String playerUuid =  playerInfo.getUuid();
                //就是因为playerInfo表里没有对应的数据，查询出来为空，所以要把遍历出来的数据存储到playerInfo表中。
                if(playerInfoDao.findFirstByUid(playerUid)==null&&playerUuid.equals("")){
                    playerInfoDao.save(playerInfoList.get(i));
                }
                if(chairId.equals(playerInfo.getChairid())){
                    RobotPlayerInfo robotPlayerInfo = robotPlayerInfoDao.findFirstByUid(playerUid);
                    if(robotPlayerInfo!=null){
                        robotPlayerInfo.setLast_conn_ip(ip);
                        robotPlayerInfo.setLevel(playerInfo.getLevel());
                        robotPlayerInfo.setNick_name(playerInfo.getNick_name());
                        robotPlayerInfo.setScore(playerInfo.getScore());
                        robotPlayerInfo.setStatus("1");
                        robotPlayerInfo.setVip_level(playerInfo.getVip_level());
                        robotPlayerInfo.setIp_zone(playerInfo.getIp_zone());
                        robotPlayerInfoDao.save(robotPlayerInfo);
                    }else{
                        RobotPlayerInfo robot= new RobotPlayerInfo();
                        robot.setUid(playerInfo.getUid());
                        robot.setNick_name(playerInfo.getNick_name());
                        robot.setScore(playerInfo.getScore());
                        robot.setVip_level(playerInfo.getVip_level());
                        robot.setStatus("0");
                        robot.setLast_conn_ip(ip);
                        robot.setLevel(playerInfo.getLevel());
                        robot.setIp_zone(playerInfo.getIp_zone());
                        robot.setPassword("");
                        robot.setUuid(playerInfo.getUuid());
                        robotPlayerInfoDao.save(robot);
                    }

                    String playerInfoStr = JSON.toJSONString(playerInfo);
                    redisService.set("robot:"+playerInfo.getUid(),playerInfoStr);
                 }else{
                    if(redisService.hasKey("robot:"+playerInfo.getUid())){//检测到该玩家也是机器人，则在缓存中生成队友关系
                        redisService.lSet("friend:"+ownUid,playerInfo.getUid());
                        redisService.lSet("friend:"+ownUid,"test");
                    }
                }
            }
        }

        if(postCardPlayInfo.getAction().equals(Constant.SHOW_RESULT)){
            logger.info("######################################################牌局结束#################################################");
            System.out.println("游戏结束");
            //结束时间
            finishtime = DateUtils.currentTimeStamp();
            System.out.println(finishtime);

            //游戏结束后把Status的状态由1改为0
            List<PlayerInfo> player = postCardPlayInfo.getPlayer();
            for(int k = 0 ; k < player.size(); k++){
                PlayerInfo playerInfo = player.get(k);
                if(playerInfo.getStatus().equals("1")){
                    playerInfo.setStatus("0");
                }
            }

            //1800 == 30分钟
            /*if((finishtime-receipttime) > 1800){
                RobotPlayerInfo firstByStatusIs = robotPlayerInfoDao.findFirstByStatusIs("1");
                if(firstByStatusIs.getStatus().equals("1")){
                    firstByStatusIs.setStatus("0");
                }
            }*/

            PlayCardsInfo playCardsInfo = new PlayCardsInfo();
            List<PlayerInfo> playerInfoList = postCardPlayInfo.getPlayer();
            String endTime = DateUtils.currentFormatDate(DateUtils.DATE_TO_STRING_DETAIAL_PATTERN);
            for (int i = 0; i < playerInfoList.size(); i++) {
                PlayerInfo playerInfo = playerInfoList.get(i);
                if(chairId.equals(playerInfo.getChairid())){
                    playCardsInfo.setUid(playerInfo.getUid());
                    playCardsInfo.setChairId(chairId);
                    playCardsInfo.setLordChairId(postCardPlayInfo.getLord_chair_id());
                    playCardsInfo.setRole(playerInfo.getRole());
                    playCardsInfo.setPlayCards(postCardPlayInfo.getPlay_cards());
                    playCardsInfo.setOrigCards(postCardPlayInfo.getOrig_cards());
                    playCardsInfo.setEndTime(endTime);
                    redisService.del("friend:"+playerInfo.getUid());
                }
            }
            playCardsInfoDao.save(playCardsInfo);

            //判断当前玩家分数是否大于100
            /*List<PlayerInfo> player = postCardPlayInfo.getPlayer();
            for(int l = 0 ; l < player.size(); l++){
                PlayerInfo playerInfo = player.get(l);
                int i = Integer.parseInt(playerInfo.getScore());
                if(i>100){
                    //继续游戏
                }else {
                    //告诉玩家金币不足
                }
            }*/
        }
        if(postCardPlayInfo.getAction().equals(Constant.PLAY_CARD)) {
            List<PlayerInfo> playerInfoList = postCardPlayInfo.getPlayer();
            JSONObject msg = new JSONObject();
            //地主编号
            msg.put("landlord",postCardPlayInfo.getLord_chair_id());
            //当前出牌玩家编号
            msg.put("to_play",chairId);
            //出牌动作
            msg.put("activeplay",postCardPlayInfo.getActive_play());
            //上一次出牌玩家的编号
            msg.put("player",postCardPlayInfo.getLast_play_id());
            PlayerInfo curPlayerInfo = null;
            for (int i = 0; i < playerInfoList.size(); i++) {
                PlayerInfo playerInfo = playerInfoList.get(i);
                if (chairId.equals(playerInfo.getChairid())) {
                    curPlayerInfo = playerInfo;
                    msg.put("card_array",playerInfo.getOwn_cards());
                    msg.put("othercard",playerInfo.getUnplayed_cards());
                    if(redisService.hasKey("friend:"+playerInfo.getUid())){//如果发现同伙
                        msg.put("ddz_playcard","1002");
                        String friendsInfo = redisService.lGet("friend:"+playerInfo.getUid(),0,-1).toString();
                        String[] friendArr = friendsInfo.substring(1,friendsInfo.length()-1).split(",");
                        logger.info("他有机器人同伙" + friendsInfo);
                        for (int k = 0; k < friendArr.length; k++) {
                            String friendInfoStr = (String) redisService.get("robot:"+playerInfo.getUid());
                            PlayerInfo friendPlayerInfo = JSON.parseObject(friendInfoStr, PlayerInfo.class);
                            if(Integer.parseInt(friendPlayerInfo.getChairid()) == getNextChairId(Integer.parseInt(chairId))){//如果该玩家是下家
                                    msg.put("card_xj",friendPlayerInfo.getOwn_cards());
                                    msg.put("card_sj","0");
                            }else{
                                msg.put("card_sj",friendPlayerInfo.getOwn_cards());
                                msg.put("card_xj","0");
                            }
                        }
                    }else {
                        msg.put("ddz_playcard","1001");
                    }
                }
            }
            for (int i = 0; i < playerInfoList.size(); i++) {
                PlayerInfo playerInfo = playerInfoList.get(i);
                if (lastChairId.equals(playerInfo.getChairid())) {
                    msg.put("play",playerInfo.getLast_play_card());
                }
            }
            msg.put("xj_count",playerInfoList.get(getNextChairId(Integer.parseInt(chairId))-1).getRemain_count());
            msg.put("board_list",postCardPlayInfo.getPlay_cards());
            String I = msg.toJSONString();

            logger.info("即将发送报文到AI:" + I);
            System.out.println("即将发送报文到AI:" + I);
            long l = System.currentTimeMillis();
            System.out.println(l);
            String res = null;
            try {
                ScoketClient scoketClient = new ScoketClient("riseworlds.51vip.biz",8000);
                res = scoketClient.sendMsg(I);
            } catch (IOException e) {
                e.printStackTrace();
                return Response.error(CodeMsg.SERVER_ERROR);
            }
            logger.info("收到AI返回出牌:" + res);
            System.out.println("收到AI返回出牌:" + res);
            System.out.println(System.currentTimeMillis()-l);

            if(curPlayerInfo!=null){//更新个人信息到缓存
                curPlayerInfo.setOwn_cards(getCurCards(curPlayerInfo.getOwn_cards(),res));
                String curPlayerInfoStr = JSON.toJSONString(curPlayerInfo);
                redisService.set("robot:"+curPlayerInfo.getUid(),curPlayerInfoStr);
            }
            return Response.success(res);
        }
        return Response.success(postCardPlayInfo);
    }

    /***
     * 玩家登录进入房间时向玩家提供一些信息
     * @return
     */
    @ResponseBody
    @RequestMapping("/getConnInfo")
    public Response<Object> getConnectionInfo(){
        JSONObject res = new JSONObject();
        ServerInfoPost serverInfo = null;

        //拿到当前玩家手上的金额
        RobotPlayerInfo robotPlayerInfo = robotPlayerInfoDao.findFirstByStatusIs("0");
        String score = robotPlayerInfo.getScore();
        int i = Integer.parseInt(score);

        //取出redis中的数据
        Map map = redisService.hmget("serverList");
        String resServerIp = "";
        String resServerPort = "";
        int minOnLineCnt = Integer.MAX_VALUE;
        for(Object key : map.keySet()){
            //System.out.println(key);
            String  value = (String) map.get(key);
            serverInfo = JSON.parseObject(value, ServerInfoPost.class);
        }
        //房间分配需要根据当前人数去均衡分配 不能一个房间突然很多机器人进去
        if(serverInfo.getOnLineCnt()<minOnLineCnt){
            minOnLineCnt = serverInfo.getOnLineCnt();
            resServerIp = serverInfo.getServerIp();
            resServerPort = serverInfo.getServerPort();
        }
        //判断当前用户的金额是否满足进入房间的条件
        if(i>serverInfo.getMinEnterScore()){
            res.put("uid",robotPlayerInfo.getUid());
            res.put("uuid", robotPlayerInfo.getUuid());
            res.put("password",robotPlayerInfo.getPassword());
            res.put("score",score);
            res.put("serverIp",resServerIp);
            res.put("serverPort",resServerPort);
            if(robotPlayerInfo.getStatus().equals("0")){
                robotPlayerInfo.setStatus("1");
            }
            //获得当前unix时间戳(单位秒)
            receipttime = DateUtils.currentTimeStamp();
            System.out.println(receipttime);
            return Response.success(res);
        }else {
            /*robotPlayerInfoDao.delete(robotPlayerInfo);*/
            return Response.error(CodeMsg.LACK_ERROR);
        }
    }

    @RequestMapping("/getGameInfo")
//    @Transactional
    public String getGameInfo(String uid, Model m){
        List<PlayCardsInfo> gameInfoList = playCardsInfoDao.findAllByUidIs(uid);

        m.addAttribute("uid",uid);

        m.addAttribute("gameInfoList",gameInfoList);

        return "gamelist";
    }

    @ResponseBody
    @RequestMapping("/getGameCardsInfo")
//    @Transactional
    public Response getGameCardsInfo(@RequestParam("id") int id){
//        int id_ = Integer.parseInt(id);
        StringBuffer sb = new StringBuffer();
        PlayCardsInfo playCardsInfo = playCardsInfoDao.findFirstById(id);
        String lordChairId = playCardsInfo.getLordChairId();
        String chairId = playCardsInfo.getChairId();
        String playCards = playCardsInfo.getPlayCards();
        String[] playCardsArr = playCards.split(",");
        String origCards = playCardsInfo.getOrigCards();
        StringBuffer outCards = new StringBuffer();
        String roleName = "";
        String color = "";
        String cards = "";
        String curCards = "";
        for (int i = 0; i < playCardsArr.length; i=i+2) {
            roleName = playCardsArr[i].equals(lordChairId)?"地主":"农民";
            color = playCardsArr[i].equals(chairId)?"#0366d6":"#333";
            cards = playCardsArr[i+1].equals("0")?"不要":playCardsArr[i+1].replaceAll("T","10");
            curCards =  playCardsArr[i].equals(chairId)?"<span style=\"float: right\">"+getCurCards(origCards,outCards.toString()).replaceAll("T","10")+"</span>":"";
            sb.append("<p style=\"color:"+color+";align=\"left\">玩家"+playCardsArr[i]+"("+roleName+")："+cards+curCards+"</p>");
            if(playCardsArr[i].equals(chairId)){
                outCards.append(playCardsArr[i+1]);
            }
        }
        System.out.println(sb.toString());
        return Response.success(sb.toString());
    }


    //获得下家chairId
    private int getNextChairId(int cur){
        if(cur == 1){
            return 3;
        }else{
            return cur-1;
        }
    }

    //获得上家chairId
    private int getPreChairId(int cur){
        if(cur == 3){
            return 1;
        }else{
            return cur+1;
        }
    }

    private String getCurCards(String origCards, String outCards){
        char[] charArray = outCards.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            origCards = origCards.replaceFirst(String.valueOf(charArray[i]),"");
        }
        return origCards;
    }

    /***
     *外挂客户端上线时向其提供账号密码以及游戏服务器地址端口信息
     *
     * */
    @RequestMapping("/getRobotPlayerInfo")
    public Response getRobotPlayerInfo(HttpServletRequest request){
        try {
            //判断外挂客户端玩家是否在线
            ArrayList<Object> list = new ArrayList<>();
            String uid = "";
            String uid1 = "";
            String last_conn_ip = "";
            String score = "";
            RobotPlayerInfo playerInfo = null;
            PlayCardsInfo playCardsInfo = null;
            List<RobotPlayerInfo> all = robotPlayerInfoDao.findAll();
            for(int j=0; j <all.size();j++){
                playerInfo = all.get(j);
                uid = playerInfo.getUid();
                last_conn_ip = playerInfo.getLast_conn_ip();
                score = playerInfo.getScore();
            }
            List<PlayCardsInfo> all1 = playCardsInfoDao.findAll();
            for(int k=0; k <all1.size();k++){
               playCardsInfo = all1.get(k);
               uid1 = playCardsInfo.getUid();
            }
            if(uid.equals(uid1)) {
                Cookie[] cookies = request.getCookies();
                if (cookies != null && cookies.length > 0) {
                    for (Cookie cookie : cookies) {
                        String name = cookie.getName();
                        String value = cookie.getValue();
                        if (name.equals(playerInfo.getNick_name())|| value.equals(playerInfo.getPassword())) {
                            System.out.println("当前外挂玩家处于登录状态");
                            //外挂客户端玩家处于登录状态，给其提供账号密码以及游戏服务器地址端口信息
                            //账号
                            list.add(name);
                            //密码
                            list.add(value);
                            //服务器地址
                            list.add(last_conn_ip);
                            //服务器端口
                            list.add(score);
                        }else {
                            return Response.error(CodeMsg.REQUEST_ERROR);                                                      }
                    }
                }
            }
            return Response.success(list);
        } catch (Exception e) {
            e.printStackTrace();
            return Response.error(CodeMsg.SERVER_ERROR);
        }
    }





    /*@RequestMapping("/getuser")
    public void getUser(){
        List<PlayerInfo> all = playerInfoDao.findAll();
        for(int i=0; i<all.size();i++){
            PlayerInfo playerInfo = all.get(i);
            System.out.println(playerInfo);
        }

    }

    @ResponseBody
    @RequestMapping("/getRobotAndPlay")
    public void getRobotAndPlay(String uid){
        List<PlayCardsInfo> allByUidIs = playCardsInfoDao.findAllByUidIs(uid);
        RobotPlayerInfo playerInfo = new RobotPlayerInfo();
        String uid2 = playerInfo.getUid();
        for(int i=0;i<allByUidIs.size();i++){
            PlayCardsInfo playCardsInfo = allByUidIs.get(i);
            String uid1 = playCardsInfo.getUid();
            if(uid1.equals(uid2)||uid1 == uid2){
                String uid3 = playCardsInfo.getUid();
                System.out.println(uid3);
            }
        }
    }*/

}
