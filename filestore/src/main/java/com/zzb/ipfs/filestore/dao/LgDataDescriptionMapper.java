package com.zzb.ipfs.filestore.dao;

import com.zzb.ipfs.filestore.pojo.LgDataDescription;
import com.zzb.ipfs.filestore.pojo.LgDataDescriptionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LgDataDescriptionMapper {
    int countByExample(LgDataDescriptionExample example);

    int deleteByExample(LgDataDescriptionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LgDataDescription record);

    int insertSelective(LgDataDescription record);

    List<LgDataDescription> selectByExample(LgDataDescriptionExample example);

    LgDataDescription selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LgDataDescription record, @Param("example") LgDataDescriptionExample example);

    int updateByExample(@Param("record") LgDataDescription record, @Param("example") LgDataDescriptionExample example);

    int updateByPrimaryKeySelective(LgDataDescription record);

    int updateByPrimaryKey(LgDataDescription record);
}