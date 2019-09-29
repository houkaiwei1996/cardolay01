package com.zzb.ipfs.filestore.utils;

import com.zzb.ipfs.filestore.pojo.capacity.CapacityDto;
import com.zzb.ipfs.filestore.pojo.flowdata.Stair;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class LogDataQueue {

    public static LogDataQueue dataQueue;

    static{
        dataQueue = new LogDataQueue();
    }

    public LinkedBlockingQueue<CapacityDto> capacityDtosList = new LinkedBlockingQueue<CapacityDto>(1024);
    public LinkedBlockingQueue<Stair> stairDtoList = new LinkedBlockingQueue<Stair>(1024);

    public void enquueNewLogReportData(CapacityDto capacityDto){

        try {
            capacityDtosList.put(capacityDto);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public CapacityDto dequeueLogReportData(){
        CapacityDto data = null;
        try {
            data = capacityDtosList.poll(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return data;
    }

    public void injectStair(Stair stair){

        try {
            stairDtoList.put(stair);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Stair quoteStair(){
        Stair data = null;
        try {
            data = stairDtoList.poll(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return data;
    }
}
