package com.zzb.ipfs.filestore.dao;

import com.zzb.ipfs.filestore.pojo.LgDeviceReportLog;
import com.zzb.ipfs.filestore.pojo.LgDeviceReportLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LgDeviceReportLogMapper {
    int countByExample(LgDeviceReportLogExample example);

    int deleteByExample(LgDeviceReportLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LgDeviceReportLog record);

    int insertSelective(LgDeviceReportLog record);

    List<LgDeviceReportLog> selectByExampleWithBLOBs(LgDeviceReportLogExample example);

    List<LgDeviceReportLog> selectByExample(LgDeviceReportLogExample example);

    LgDeviceReportLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LgDeviceReportLog record, @Param("example") LgDeviceReportLogExample example);

    int updateByExampleWithBLOBs(@Param("record") LgDeviceReportLog record, @Param("example") LgDeviceReportLogExample example);

    int updateByExample(@Param("record") LgDeviceReportLog record, @Param("example") LgDeviceReportLogExample example);

    int updateByPrimaryKeySelective(LgDeviceReportLog record);

    int updateByPrimaryKeyWithBLOBs(LgDeviceReportLog record);

    int updateByPrimaryKey(LgDeviceReportLog record);
}