package com.zzb.ipfs.filestore.dao;

import com.zzb.ipfs.filestore.pojo.LgAccountManagement;
import com.zzb.ipfs.filestore.pojo.LgAccountManagementExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LgAccountManagementMapper {
    int countByExample(LgAccountManagementExample example);

    int deleteByExample(LgAccountManagementExample example);

    int deleteByPrimaryKey(String id);

    int insert(LgAccountManagement record);

    int insertSelective(LgAccountManagement record);

    List<LgAccountManagement> selectByExample(LgAccountManagementExample example);

    LgAccountManagement selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LgAccountManagement record, @Param("example") LgAccountManagementExample example);

    int updateByExample(@Param("record") LgAccountManagement record, @Param("example") LgAccountManagementExample example);

    int updateByPrimaryKeySelective(LgAccountManagement record);

    int updateByPrimaryKey(LgAccountManagement record);
}