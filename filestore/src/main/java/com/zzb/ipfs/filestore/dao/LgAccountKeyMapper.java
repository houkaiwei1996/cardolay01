package com.zzb.ipfs.filestore.dao;

import com.zzb.ipfs.filestore.pojo.LgAccountKey;
import com.zzb.ipfs.filestore.pojo.LgAccountKeyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LgAccountKeyMapper {
    int countByExample(LgAccountKeyExample example);

    int deleteByExample(LgAccountKeyExample example);

    int deleteByPrimaryKey(String id);

    int insert(LgAccountKey record);

    int insertSelective(LgAccountKey record);

    List<LgAccountKey> selectByExample(LgAccountKeyExample example);

    LgAccountKey selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LgAccountKey record, @Param("example") LgAccountKeyExample example);

    int updateByExample(@Param("record") LgAccountKey record, @Param("example") LgAccountKeyExample example);

    int updateByPrimaryKeySelective(LgAccountKey record);

    int updateByPrimaryKey(LgAccountKey record);
}