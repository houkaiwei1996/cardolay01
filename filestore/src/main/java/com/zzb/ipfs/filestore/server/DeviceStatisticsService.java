package com.zzb.ipfs.filestore.server;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zzb.ipfs.filestore.dao.LgDeviceStatisticsMapper;
import com.zzb.ipfs.filestore.impserver.DeviceStatisticsServiceimp;
import com.zzb.ipfs.filestore.pojo.LgDeviceStatistics;
import com.zzb.ipfs.filestore.pojo.LgDeviceStatisticsExample;
import com.zzb.ipfs.filestore.pojo.dto.LgDeviceStatisticsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceStatisticsService implements DeviceStatisticsServiceimp {


    @Autowired
    LgDeviceStatisticsMapper mapper;
    /***
     * 设备 SN：支持模糊查询，不填则无此条件
     * 地区：点击为省市选项组，不填则无此条件
     * 上传流量区间：需校验开始值小于等于结束值，不填则无此条件
     * 无查询条件点击搜索为全查
     * @param dto
     * @return
     */
    @Override
    public List<LgDeviceStatistics> selLgDeviceStatistics(LgDeviceStatisticsDto dto,Integer currPage, Integer pageSize) {
        Page<Object> objects = PageHelper.startPage(currPage, pageSize);

        LgDeviceStatisticsExample lgDeviceStatisticsExample = new LgDeviceStatisticsExample();
        LgDeviceStatisticsExample.Criteria criteria = lgDeviceStatisticsExample.createCriteria();
        if(dto.getDevSn() == null && dto.getRegion() == null && dto.getUploadTraffic() == null && dto.getUploadTraffic1() == null){
            List<LgDeviceStatistics> lgDeviceReportLogs = mapper.selectByExample(null);
            return lgDeviceReportLogs;
        }else {
            if(dto.getDevSn() != null){
                criteria.andDevSnLike("%"+dto.getDevSn()+"%");
            }
            if(dto.getRegion() != null){
                criteria.andRegionLike("%"+dto.getRegion()+"%");
            }
            if(dto.getUploadTraffic() != null){
                criteria.andUploadTrafficGreaterThan(dto.getUploadTraffic());
            }
            if(dto.getUploadTraffic1() != null){
                criteria.andUploadTrafficLessThan(dto.getUploadTraffic1());
            }
            List<LgDeviceStatistics> lgDeviceStatistics = mapper.selectByExample(lgDeviceStatisticsExample);
            return lgDeviceStatistics;
        }
    }
}
