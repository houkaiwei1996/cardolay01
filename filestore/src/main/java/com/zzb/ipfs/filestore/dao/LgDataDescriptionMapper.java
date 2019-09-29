package com.zzb.ipfs.filestore.dao;

import com.zzb.ipfs.filestore.pojo.LgDataDescription;
import com.zzb.ipfs.filestore.pojo.LgDataDescriptionExample;
import com.zzb.ipfs.filestore.pojo.dto.IPFSdto;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LgDataDescriptionMapper {
    int countByExample(LgDataDescriptionExample example);

    int deleteByExample(LgDataDescriptionExample example);

    int deleteByPrimaryKey(String id);

    int insert(LgDataDescription record);

    int insertSelective(LgDataDescription record);

    List<LgDataDescription> selectByExample(LgDataDescriptionExample example);

    LgDataDescription selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LgDataDescription record, @Param("example") LgDataDescriptionExample example);

    int updateByExample(@Param("record") LgDataDescription record, @Param("example") LgDataDescriptionExample example);

    int updateByPrimaryKeySelective(LgDataDescription record);

    int updateByPrimaryKey(LgDataDescription record);

    List<LgDataDescription> selectlgdata(IPFSdto sdto);
}