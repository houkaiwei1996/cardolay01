package com.zzb.ipfs.filestore.web;

import com.zzb.ipfs.filestore.impserver.LgSnHeatimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class LgSnHeatWeb {

    @Autowired
    LgSnHeatimp snHeatimp;

    /***
     * 查询出全部数据以及其台数（测试）
     * @return
     */
    @GetMapping("/selLgSnHeatAll")
    ArrayList<Object> selLgSnHeatAll(){
        return snHeatimp.selLgSnHeatAll();
    }
}
