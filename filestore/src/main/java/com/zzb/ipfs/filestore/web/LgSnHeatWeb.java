package com.zzb.ipfs.filestore.web;

import com.zzb.ipfs.filestore.impserver.LgSnHeatimp;
import com.zzb.ipfs.filestore.pojo.LgSnHeat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class LgSnHeatWeb {

    @Autowired
    LgSnHeatimp snHeatimp;

    /***
     * 查询出全部数据以及其台数（测试）
     * @return
     */
    @GetMapping("/selLgSnHeatAll")
    List<LgSnHeat> selLgSnHeatAll(){
        return snHeatimp.selLgSnHeatAll();
    }
}
