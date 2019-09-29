package com.zzb.ipfs.filestore.web;

import com.zzb.ipfs.filestore.impserver.KeyManageimp;
import com.zzb.ipfs.filestore.pojo.LgAccountKey;
import com.zzb.ipfs.filestore.pojo.dto.KeyDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KeyManageWeb {

    @Autowired
    KeyManageimp keyManageimp;

    /***
     * 查询方式：所有查询条件为空，则代表该维度全查，所有查询条件均支持模糊查询。
     * @return
     */
    @ResponseBody
    @GetMapping("/lgAccountKeylist")
    public List<LgAccountKey> lgAccountKeylist(KeyDto dto) {
        return keyManageimp.lgAccountKeylist(dto);
    }

    /***
     * 密钥管理功能-----状态【启用】【禁用】
     * @return
     */
    @GetMapping("/updataStatus")
    public String updataStatus(String aid) {
        return keyManageimp.updataStatus(aid);
    }
}
