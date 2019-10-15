package com.zzb.ipfs.filestore.web;

import com.zzb.ipfs.filestore.impserver.DateStatisticsimp;
import com.zzb.ipfs.filestore.pojo.LgDateStatistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DateStatisticsWeb {

    @Autowired
    DateStatisticsimp dateStatisticsimp;

    /***
     * 查询条件： 渠道名称：支持模糊查询，不填则无此条件
     * 统计日期：日期选择框，不填则无此条件
     * 无查询条件点击搜索为全查
     * @return
     */
    @ResponseBody
    @GetMapping("/sleLgDateStatistics")
    public List<LgDateStatistics> sleLgDateStatistics(String channelName, String dateStatistics, Integer currPage, Integer pageSize){
        return dateStatisticsimp.sleLgDateStatistics(channelName, dateStatistics, currPage, pageSize);
    }
}
