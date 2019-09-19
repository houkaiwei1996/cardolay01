package com.zzb.cardplay.controller;

import com.alibaba.fastjson.JSON;
import com.zzb.cardplay.common.Response;
import com.zzb.cardplay.pojo.ServerInfoPost;
import com.zzb.cardplay.redis.RedisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import util.DateUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class ServerController {


    private static final Logger logger = LoggerFactory.getLogger(ServerController.class);

    @Autowired
    RedisService redisService;

    /***
     * 存储前端传过来的ServerInfoPost数据（存到redis）
     * @param serverInfo
     * @return
     */
    @ResponseBody
    @RequestMapping("/postServerList")
    public Response postServerList(@RequestBody ServerInfoPost serverInfo){
        String now = DateUtils.currentFormatDate(DateUtils.DATE_TO_STRING_DETAIAL_PATTERN);
        serverInfo.setUpdateTime(now);

        String serverInfoStr = JSON.toJSONString(serverInfo);
        logger.info("收到postServerList请求:" + serverInfoStr);
        if(serverInfoStr != null && !serverInfoStr.equals("")) {
            redisService.hset("serverList",serverInfo.getServerId(), serverInfoStr);
        }
        return Response.success(serverInfo);
    }

    /**
     * 读取redis里的数据（游戏服务器列表）
     * @param m
     * @return
     */
    @RequestMapping("/getServerList")
    public String getServerList(Model m){

        Map map = redisService.hmget("serverList");

        List<ServerInfoPost> serverInfoList = new ArrayList<ServerInfoPost>();

        for(Object key : map.keySet()){
            //System.out.println(key);
            String  value = (String) map.get(key);
            ServerInfoPost serverInfo = JSON.parseObject(value, ServerInfoPost.class);
            serverInfoList.add(serverInfo);
        }
        m.addAttribute("serverInfoList",serverInfoList);
        return "serverlist";
    }
}
