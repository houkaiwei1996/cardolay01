package com.zzb.cardplay.controller;

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

import java.awt.*;
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
        playerInfoDao.save(playerInfo);
        return Response.success("插入数据成功");
    }

    @ResponseBody
    @RequestMapping("/addRobotPlayer")
    public Response addRobotPlayer(@RequestBody RobotPlayerInfo robotplayerInfo ){
        robotPlayerInfoDao.save(robotplayerInfo);
        return Response.success("插入数据成功");
    }

    @RequestMapping("/getPlayerList")
    public String getServerList(Model m){


        List<PlayerInfo> playerInfoList = playerInfoDao.findAll();


        m.addAttribute("playerInfoList",playerInfoList);

        return "playerlist";

    }

    @RequestMapping("/getRobotPlayerList")
    public String getRobotServerList(Model m){


        List<RobotPlayerInfo> robotPlayerInfoList = robotPlayerInfoDao.findAll();


        m.addAttribute("robotPlayerInfoList",robotPlayerInfoList);

        return "robotPlayerlist";

    }

    @ResponseBody
    @RequestMapping("/delRobot")
    public Response delRobot(@RequestParam("id") int id,@RequestParam("uid") int uid){

        robotPlayerInfoDao.deleteById(id);

        return Response.success("success");

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
