package com.zzb.ipfs.filestore.server;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zzb.ipfs.filestore.dao.LgDateStatisticsMapper;
import com.zzb.ipfs.filestore.impserver.DateStatisticsimp;
import com.zzb.ipfs.filestore.pojo.LgDateStatistics;
import com.zzb.ipfs.filestore.pojo.LgDateStatisticsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DateStatisticsService implements DateStatisticsimp {

    @Autowired
    LgDateStatisticsMapper dateStatisticsMapper;

    /***
     * 查询条件： 渠道名称：支持模糊查询，不填则无此条件
     * 统计日期：日期选择框，不填则无此条件
     * 无查询条件点击搜索为全查
     * @return
     */
    @Override
    public List<LgDateStatistics> sleLgDateStatistics(String channelName, String dateStatistics,Integer currPage, Integer pageSize) {
        Page<Object> objects = PageHelper.startPage(currPage, pageSize);

        if(channelName == null && dateStatistics == null){
            List<LgDateStatistics> lgDateStatistics = dateStatisticsMapper.selectByExample(null);
            return lgDateStatistics;
        }else {
            LgDateStatisticsExample lgDateStatisticsExample = new LgDateStatisticsExample();
            LgDateStatisticsExample.Criteria criteria = lgDateStatisticsExample.createCriteria();
            if(channelName != null){
                criteria.andChannelNameLike("%"+channelName+"%");
            }
            if(dateStatistics != null){
                criteria.andDateStatisticsEqualTo(dateStatistics);
            }
            List<LgDateStatistics> lgDateStatistics = dateStatisticsMapper.selectByExample(lgDateStatisticsExample);
            return lgDateStatistics;
        }
    }
}
