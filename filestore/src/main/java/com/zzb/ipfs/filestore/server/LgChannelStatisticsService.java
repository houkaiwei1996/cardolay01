package com.zzb.ipfs.filestore.server;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zzb.ipfs.filestore.dao.LgChannelStatisticsMapper;
import com.zzb.ipfs.filestore.impserver.LgChannelStatisticsimp;
import com.zzb.ipfs.filestore.pojo.LgChannelStatistics;
import com.zzb.ipfs.filestore.pojo.LgChannelStatisticsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LgChannelStatisticsService implements LgChannelStatisticsimp {

    @Autowired
    LgChannelStatisticsMapper statisticsMapper;

    /***
     * 渠道名称：支持模糊查询，不填则无此条件
     * 无查询条件点击搜索为全查
     */
    @Override
    public List<LgChannelStatistics> selchanne(String name) {
        Page<Object> objects = PageHelper.startPage(10, 1);
        if (name == null) {
            List<LgChannelStatistics> lgChannelStatistics = statisticsMapper.selectByExample(null);
            return lgChannelStatistics;
        }else {
            LgChannelStatisticsExample lgChannelStatisticsExample = new LgChannelStatisticsExample();
            LgChannelStatisticsExample.Criteria criteria = lgChannelStatisticsExample.createCriteria();
            criteria.andNameLike("%"+name+"%");
            List<LgChannelStatistics> lgChannelStatistics = statisticsMapper.selectByExample(lgChannelStatisticsExample);
            return lgChannelStatistics;
        }
    }
}
