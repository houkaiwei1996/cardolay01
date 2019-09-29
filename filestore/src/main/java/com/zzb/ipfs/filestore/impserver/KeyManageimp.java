package com.zzb.ipfs.filestore.impserver;

import com.zzb.ipfs.filestore.pojo.LgAccountKey;
import com.zzb.ipfs.filestore.pojo.dto.KeyDto;

import java.util.List;

public interface KeyManageimp {

    /***
     * 查询方式：所有查询条件为空，则代表该维度全查，所有查询条件均支持模糊查询。
     * @return
     */
    List<LgAccountKey> lgAccountKeylist(KeyDto dto);

    /***
     * 密钥管理功能-----状态【启用】【禁用】
     * @return
     */
    String updataStatus(String aid);
}
