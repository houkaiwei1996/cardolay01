package com.zzb.ipfs.filestore.utils;

import com.google.gson.Gson;
import com.zzb.ipfs.filestore.pojo.capacity.CapacityDto;
import com.zzb.ipfs.filestore.pojo.capacity.SecondLevel;
import com.zzb.ipfs.filestore.pojo.flowdata.Stair;
import com.zzb.ipfs.lib_netty_sdk.entity.Protocal4001PacketEntity;
import com.zzb.ipfs.lib_netty_sdk.service.ILogReportProduce;
import org.springframework.stereotype.Component;

@Component
public class IPFSLogProcedure implements ILogReportProduce {


    LogDataQueue logDataQueue;

    public IPFSLogProcedure(LogDataQueue logDataQueue) {
        this.logDataQueue = logDataQueue;
    }

    @Override
    public void processMsg(Protocal4001PacketEntity logReportFrame) {

        String msgBody = logReportFrame.getMsgBody();

        System.out.println(msgBody);
        String method = logReportFrame.getMethod();
        Gson gson = new Gson();
        if(msgBody.contains("\"type\":3")){
            CapacityDto capacityDto3 = gson.fromJson(msgBody, CapacityDto.class);
            System.out.println(capacityDto3);
        }else if(msgBody.contains("\"type\":2")){
            CapacityDto capacityDto = gson.fromJson(msgBody,CapacityDto.class);
            System.out.println(capacityDto);
            logDataQueue.enquueNewLogReportData(capacityDto);
        }else if(msgBody.contains("\"type\":1")){
            Stair stair = gson.fromJson(msgBody, Stair.class);
            System.out.println(stair);
            logDataQueue.injectStair(stair);
        }else if(msgBody.contains("\"type\":4")){
            CapacityDto capacityDto4 = gson.fromJson(msgBody, CapacityDto.class);
            System.out.println(capacityDto4);
        }
    }
}
