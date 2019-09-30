package com.zzb.ipfs.filestore.impserver;

import com.zzb.ipfs.filestore.pojo.LgDocumentOverview;

import java.util.List;

public interface DocumentOverviewServiceimp {

    /***
     * 文件名称：支持模糊查询，不填则无此条件
     * 渠道：支持模糊查询，不填则无此条件
     * 无查询条件点击搜索为全查
     * @return
     */
    List<LgDocumentOverview> selDocumentOverview(String devName,String channel,Integer currPage, Integer pageSize);
}
