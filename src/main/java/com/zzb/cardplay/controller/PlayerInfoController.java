package com.zzb.cardplay.controller;

import com.zzb.cardplay.common.CodeMsg;
import com.zzb.cardplay.common.Response;
import com.zzb.cardplay.dao.PlayerInfoDao;
import com.zzb.cardplay.dao.RobotPlayerInfoDao;
import com.zzb.cardplay.pojo.PlayerInfo;
import com.zzb.cardplay.pojo.RobotPlayerInfo;
import com.zzb.cardplay.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

@Controller
public class PlayerInfoController {
    @Autowired
    RedisService redisService;

    @Autowired
    PlayerInfoDao playerInfoDao;

    @Autowired
    RobotPlayerInfoDao robotPlayerInfoDao;

    @ResponseBody
    @RequestMapping("/addPlayer")
    public Response addPlayer(PlayerInfo playerInfo ){
        try {
            playerInfoDao.save(playerInfo);
            return Response.success("插入数据成功");
        } catch (Exception e) {
            //非法请求
            return Response.error(CodeMsg.REQUEST_ERROR);
        }
    }

    @ResponseBody
    @RequestMapping("/addRobotPlayer")
    public Response addRobotPlayer(@RequestBody RobotPlayerInfo robotplayerInfo ){
        try {
            robotPlayerInfoDao.save(robotplayerInfo);
            return Response.success("插入数据成功");
        } catch (Exception e) {
            //非法请求
            return Response.error(CodeMsg.REQUEST_ERROR);
        }
    }

    @RequestMapping("/getPlayerList")
    public String getServerList(Model m){
        try {
            List<PlayerInfo> playerInfoList = playerInfoDao.findAll();
            m.addAttribute("playerInfoList",playerInfoList);
            return "playerlist";
        } catch (Exception e) {
            //非法请求
            return "请求失败！！";
        }
    }

    @RequestMapping("/getRobotPlayerList")
    public String getRobotServerList(Model m){
        try {
            List<RobotPlayerInfo> robotPlayerInfoList = robotPlayerInfoDao.findAll();
            m.addAttribute("robotPlayerInfoList",robotPlayerInfoList);
            return "robotPlayerlist";
        } catch (Exception e) {
            //非法请求
            return "请求失败！！";
        }
    }

    @ResponseBody
    @RequestMapping("/delRobot")
    public Response delRobot(@RequestParam("id") int id,@RequestParam("uid") int uid){
        try {
            robotPlayerInfoDao.deleteById(id);
            return Response.success("success");
        } catch (Exception e) {
            //非法请求
            return Response.error(CodeMsg.REQUEST_ERROR);
        }
    }


    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8000);
            System.out.println("启动服务器....");
            Socket s = ss.accept();
            System.out.println("客户端:"+s.getInetAddress().getLocalHost()+"已连接到服务器");

            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            //读取客户端发送来的消息
            String mess = br.readLine();
            System.out.println("客户端："+mess);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bw.write(mess+"\n");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
