package com.zzb.ipfs.filestore.dao;

import com.zzb.ipfs.filestore.pojo.LgFileUploadDetails;
import com.zzb.ipfs.filestore.pojo.LgFileUploadDetailsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LgFileUploadDetailsMapper {
    int countByExample(LgFileUploadDetailsExample example);

    int deleteByExample(LgFileUploadDetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LgFileUploadDetails record);

    int insertSelective(LgFileUploadDetails record);

    List<LgFileUploadDetails> selectByExample(LgFileUploadDetailsExample example);

    LgFileUploadDetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LgFileUploadDetails record, @Param("example") LgFileUploadDetailsExample example);

    int updateByExample(@Param("record") LgFileUploadDetails record, @Param("example") LgFileUploadDetailsExample example);

    int updateByPrimaryKeySelective(LgFileUploadDetails record);

    int updateByPrimaryKey(LgFileUploadDetails record);
}