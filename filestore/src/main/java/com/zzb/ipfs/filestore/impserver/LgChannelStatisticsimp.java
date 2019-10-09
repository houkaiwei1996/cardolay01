package com.zzb.ipfs.filestore.impserver;

import com.zzb.ipfs.filestore.pojo.LgChannelStatistics;

import java.util.List;

public interface LgChannelStatisticsimp {

    /***
     * 渠道名称：支持模糊查询，不填则无此条件
     * 无查询条件点击搜索为全查
     */
    List<LgChannelStatistics> selchanne(String name);
}
