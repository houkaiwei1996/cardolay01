package com.zzb.ipfs.filestore.web;

import com.zzb.ipfs.filestore.impserver.DeviceStatisticsServiceimp;
import com.zzb.ipfs.filestore.pojo.LgDeviceStatistics;
import com.zzb.ipfs.filestore.pojo.dto.LgDeviceStatisticsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeviceStatisticsWeb {

    @Autowired
    DeviceStatisticsServiceimp serviceimp;

    /***
     * 设备 SN：支持模糊查询，不填则无此条件
     * 地区：点击为省市选项组，不填则无此条件
     * 上传流量区间：需校验开始值小于等于结束值，不填则无此条件
     * 无查询条件点击搜索为全查
     * @param dto
     * @return
     */
    @ResponseBody
    @GetMapping("/selLgDeviceStatistics")
    public List<LgDeviceStatistics> selLgDeviceStatistics(LgDeviceStatisticsDto dto,Integer currPage, Integer pageSize) {
        return serviceimp.selLgDeviceStatistics(dto, currPage, pageSize);
    }
}
