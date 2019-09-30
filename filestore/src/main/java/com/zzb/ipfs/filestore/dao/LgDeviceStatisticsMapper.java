package com.zzb.ipfs.filestore.dao;

import com.zzb.ipfs.filestore.pojo.LgDeviceStatistics;
import com.zzb.ipfs.filestore.pojo.LgDeviceStatisticsExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LgDeviceStatisticsMapper {
    int countByExample(LgDeviceStatisticsExample example);

    int deleteByExample(LgDeviceStatisticsExample example);

    int deleteByPrimaryKey(String id);

    int insert(LgDeviceStatistics record);

    int insertSelective(LgDeviceStatistics record);

    List<LgDeviceStatistics> selectByExample(LgDeviceStatisticsExample example);

    LgDeviceStatistics selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LgDeviceStatistics record, @Param("example") LgDeviceStatisticsExample example);

    int updateByExample(@Param("record") LgDeviceStatistics record, @Param("example") LgDeviceStatisticsExample example);

    int updateByPrimaryKeySelective(LgDeviceStatistics record);

    int updateByPrimaryKey(LgDeviceStatistics record);
}