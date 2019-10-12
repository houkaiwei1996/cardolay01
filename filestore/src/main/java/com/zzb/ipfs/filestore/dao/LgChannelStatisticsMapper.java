package com.zzb.ipfs.filestore.dao;

import com.zzb.ipfs.filestore.pojo.LgChannelStatistics;
import com.zzb.ipfs.filestore.pojo.LgChannelStatisticsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LgChannelStatisticsMapper {
    int countByExample(LgChannelStatisticsExample example);

    int deleteByExample(LgChannelStatisticsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LgChannelStatistics record);

    int insertSelective(LgChannelStatistics record);

    List<LgChannelStatistics> selectByExample(LgChannelStatisticsExample example);

    LgChannelStatistics selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LgChannelStatistics record, @Param("example") LgChannelStatisticsExample example);

    int updateByExample(@Param("record") LgChannelStatistics record, @Param("example") LgChannelStatisticsExample example);

    int updateByPrimaryKeySelective(LgChannelStatistics record);

    int updateByPrimaryKey(LgChannelStatistics record);

    LgChannelStatistics seleLgChannelStatistics(String aid);
}