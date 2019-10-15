package com.zzb.ipfs.filestore.impserver;

import com.zzb.ipfs.filestore.pojo.LgDateStatistics;

import java.util.List;

public interface DateStatisticsimp {

    /***
     * 查询条件： 渠道名称：支持模糊查询，不填则无此条件
     * 统计日期：日期选择框，不填则无此条件
     * 无查询条件点击搜索为全查
     * @return
     */
    List<LgDateStatistics> sleLgDateStatistics(String channelName, String dateStatistics,Integer currPage, Integer pageSize);

}
