package com.zzb.ipfs.filestore.dao;

import com.zzb.ipfs.filestore.pojo.LgSnHeat;
import com.zzb.ipfs.filestore.pojo.LgSnHeatExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LgSnHeatMapper {
    int countByExample(LgSnHeatExample example);

    int deleteByExample(LgSnHeatExample example);

    int deleteByPrimaryKey(String id);

    int insert(LgSnHeat record);

    int insertSelective(LgSnHeat record);

    List<LgSnHeat> selectByExample(LgSnHeatExample example);

    LgSnHeat selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LgSnHeat record, @Param("example") LgSnHeatExample example);

    int updateByExample(@Param("record") LgSnHeat record, @Param("example") LgSnHeatExample example);

    int updateByPrimaryKeySelective(LgSnHeat record);

    int updateByPrimaryKey(LgSnHeat record);
}