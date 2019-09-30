package com.zzb.ipfs.filestore.impserver;


import com.zzb.ipfs.filestore.pojo.LgDeviceStatistics;
import com.zzb.ipfs.filestore.pojo.dto.LgDeviceStatisticsDto;

import java.util.List;

public interface DeviceStatisticsServiceimp {

    /***
     * 设备 SN：支持模糊查询，不填则无此条件
     * 地区：点击为省市选项组，不填则无此条件
     * 上传流量区间：需校验开始值小于等于结束值，不填则无此条件
     * 无查询条件点击搜索为全查
     * @param dto
     * @return
     */
    List<LgDeviceStatistics> selLgDeviceStatistics(LgDeviceStatisticsDto dto,Integer currPage, Integer pageSize);
}
