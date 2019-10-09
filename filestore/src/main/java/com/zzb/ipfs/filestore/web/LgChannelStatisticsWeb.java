package com.zzb.ipfs.filestore.web;

import com.zzb.ipfs.filestore.impserver.LgChannelStatisticsimp;
import com.zzb.ipfs.filestore.pojo.LgChannelStatistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LgChannelStatisticsWeb {

    @Autowired
    LgChannelStatisticsimp statisticsimp;

    /***
     * 渠道名称：支持模糊查询，不填则无此条件
     * 无查询条件点击搜索为全查
     */
    @ResponseBody
    @GetMapping("/selchanne")
    List<LgChannelStatistics> selchanne(String name){
        return statisticsimp.selchanne(name);
    }
}
