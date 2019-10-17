package com.zzb.ipfs.filestore.server;

import com.zzb.ipfs.filestore.dao.LgSnHeatMapper;
import com.zzb.ipfs.filestore.impserver.LgSnHeatimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LgSnHeatService implements LgSnHeatimp {

    @Autowired
    LgSnHeatMapper snHeatMapper;

    /***
     * 查询出全部数据以及其台数（测试）
     * @return
     */
    @Override
    public ArrayList<Object> selLgSnHeatAll() {
        return null;
    }
}
