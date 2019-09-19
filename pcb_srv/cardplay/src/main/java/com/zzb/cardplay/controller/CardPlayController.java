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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import util.DateUtils;
import util.IpUtil;
import util.ScoketClient;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
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

    @ResponseBody
    @RequestMapping("/postCardPlayInfo")
//    @Transactional
    public Response postCardPlayInfo(@RequestBody PostCardPlayInfo postCardPlayInfo, HttpServletRequest request)  {
        String ip = IpUtil.getIpAddr(request);
        String chairId = postCardPlayInfo.getChair_id();
        String lastChairId = postCardPlayInfo.getLast_play_id();
        String postCardPlayInfoStr = JSON.toJSONString(postCardPlayInfo);
        String ownUid = "";
        logger.debug("收到postCardPlayInfo请求:"+postCardPlayInfoStr);
        //拿到牌
        if(postCardPlayInfo.getAction().equals(Constant.SEND_CARD)){
            logger.info("######################################################拿到牌，牌局开始#####################################################");
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
                        robotPlayerInfo.setStatus(playerInfo.getStatus());
                        robotPlayerInfo.setVip_level(playerInfo.getVip_level());
                        robotPlayerInfoDao.save(robotPlayerInfo);
                    }else{
                        RobotPlayerInfo robot= new RobotPlayerInfo();
                        robot.setUid(playerInfo.getUid());
                        robot.setNick_name(playerInfo.getNick_name());
                        robot.setScore(playerInfo.getScore());
                        robot.setVip_level(playerInfo.getVip_level());
                        robot.setStatus(playerInfo.getStatus());
                        robot.setLast_conn_ip(ip);
                        robot.setLevel(playerInfo.getLevel());
                        robot.setIp_zone(playerInfo.getIp_zone());
                        robot.setPassword(playerInfo.getPassword());
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

        }
        if(postCardPlayInfo.getAction().equals(Constant.PLAY_CARD)) {
            List<PlayerInfo> playerInfoList = postCardPlayInfo.getPlayer();
            JSONObject msg = new JSONObject();

            msg.put("landlord",postCardPlayInfo.getLord_chair_id());
            msg.put("to_play",chairId);
            msg.put("activeplay",postCardPlayInfo.getActive_play());
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
            String res = null;
            try {
                ScoketClient scoketClient = new ScoketClient("riseworlds.51vip.biz",8000);
                res = scoketClient.sendMsg(I);

            } catch (IOException e) {
                e.printStackTrace();
                return Response.error(CodeMsg.SERVER_ERROR);
            }
            logger.info("收到AI返回出牌:" + res);

            if(curPlayerInfo!=null){//更新个人信息到缓存
                curPlayerInfo.setOwn_cards(getCurCards(curPlayerInfo.getOwn_cards(),res));
                String curPlayerInfoStr = JSON.toJSONString(curPlayerInfo);
                redisService.set("robot:"+curPlayerInfo.getUid(),curPlayerInfoStr);
            }



            return Response.success(res);
        }
        return Response.success(postCardPlayInfo);
    }

    @ResponseBody
    @RequestMapping("/getConnInfo")
//    @Transactional
    public Response getConnectionInfo(){
        JSONObject res = new JSONObject();
        Map map = redisService.hmget("serverList");
        String resServerIp = "";
        String resServerPort = "";
        int minOnLineCnt = Integer.MAX_VALUE;
        for(Object key : map.keySet()){
            //System.out.println(key);
            String  value = (String) map.get(key);
            ServerInfoPost serverInfo = JSON.parseObject(value, ServerInfoPost.class);
            if(serverInfo.getOnLineCnt()<minOnLineCnt){
                minOnLineCnt = serverInfo.getOnLineCnt();
                resServerIp = serverInfo.getServerIp();
                resServerPort = serverInfo.getServerPort();
            }
        }
        RobotPlayerInfo robotPlayerInfo = robotPlayerInfoDao.findFirstByStatusIs("0");
        res.put("uid",robotPlayerInfo.getUid());
        res.put("password",robotPlayerInfo.getPassword());
        res.put("serverIp",resServerIp);
        res.put("serverPort",resServerPort);
        return Response.success(res);
    }

    @RequestMapping("/getGameInfo")
//    @Transactional
    public String getGameInfo(String uid,Model m){
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

}
