package com.zzb.ipfs.filestore.web;

import com.zzb.ipfs.filestore.impserver.DocumentOverviewServiceimp;
import com.zzb.ipfs.filestore.pojo.LgDocumentOverview;;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

@RestController
public class DocumentOverviewWeb {

    @Autowired
    DocumentOverviewServiceimp serviceimp;

    /***
     * 文件名称：支持模糊查询，不填则无此条件
     * 渠道：支持模糊查询，不填则无此条件
     * 无查询条件点击搜索为全查
     * @return
     */
    @ResponseBody
    @GetMapping("/selDocumentOverview")
    public List<LgDocumentOverview> selDocumentOverview(String devName, String channel, Integer currPage, Integer pageSize) {
        return serviceimp.selDocumentOverview(devName, channel, currPage, pageSize);
    }


}
