package com.zzb.ipfs.filestore.dao;

import com.zzb.ipfs.filestore.pojo.LgDateStatistics;
import com.zzb.ipfs.filestore.pojo.LgDateStatisticsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LgDateStatisticsMapper {
    int countByExample(LgDateStatisticsExample example);

    int deleteByExample(LgDateStatisticsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LgDateStatistics record);

    int insertSelective(LgDateStatistics record);

    List<LgDateStatistics> selectByExample(LgDateStatisticsExample example);

    LgDateStatistics selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LgDateStatistics record, @Param("example") LgDateStatisticsExample example);

    int updateByExample(@Param("record") LgDateStatistics record, @Param("example") LgDateStatisticsExample example);

    int updateByPrimaryKeySelective(LgDateStatistics record);

    int updateByPrimaryKey(LgDateStatistics record);
}