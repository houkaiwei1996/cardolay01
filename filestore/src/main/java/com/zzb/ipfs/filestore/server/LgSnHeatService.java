package com.zzb.ipfs.filestore.server;

import com.zzb.ipfs.filestore.dao.LgSnHeatMapper;
import com.zzb.ipfs.filestore.impserver.LgSnHeatimp;
import com.zzb.ipfs.filestore.pojo.LgSnHeat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LgSnHeatService implements LgSnHeatimp {

    @Autowired
    LgSnHeatMapper snHeatMapper;

    /***
     * 查询出全部数据以及其台数（测试）
     * @return
     */
    @Override
    public List<LgSnHeat> selLgSnHeatAll() {
        int uploadingtime = 0;
        int uploading = 0;
        List<LgSnHeat> lgSnHeats = snHeatMapper.selectByExample(null);
        for (int i = 0 ; i < lgSnHeats.size()-1 ; i++){
            for (int j = lgSnHeats.size()-1 ; j > i ; j--){
                if(lgSnHeats.get(j).getRegion().equals(lgSnHeats.get(i).getRegion()) && lgSnHeats.get(j).getEquipmentSn().equals(lgSnHeats.get(i).getEquipmentSn())){
                    LgSnHeat remove = lgSnHeats.remove(j);
                    System.out.println(remove);
                    if(remove != null){
                        uploadingtime += remove.getUploadingtime();
                        uploading += remove.getUploading();
                    }
                }
            }
        }
        System.out.println(uploading+"-------------------------------"+uploadingtime);
        System.out.println(lgSnHeats);
        int  k = 1;
        for(int i = 0 ; i < lgSnHeats.size() -1 ; i++){
            for (int j = lgSnHeats.size() -1 ; j > i; j--){
                if (lgSnHeats.get(j).getRegion().equals(lgSnHeats.get(i).getRegion())){
                    lgSnHeats.get(i).setEquipmentSets(k);
                    lgSnHeats.get(i+1).setEquipmentSets(k);
                }else {
                    lgSnHeats.get(i).setEquipmentSets(k);
                }
            }
        }
        return lgSnHeats;
    }
}
