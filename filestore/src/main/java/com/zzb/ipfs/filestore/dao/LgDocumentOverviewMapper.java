package com.zzb.ipfs.filestore.dao;

import com.zzb.ipfs.filestore.pojo.LgDocumentOverview;
import com.zzb.ipfs.filestore.pojo.LgDocumentOverviewExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LgDocumentOverviewMapper {
    int countByExample(LgDocumentOverviewExample example);

    int deleteByExample(LgDocumentOverviewExample example);

    int deleteByPrimaryKey(String id);

    int insert(LgDocumentOverview record);

    int insertSelective(LgDocumentOverview record);

    List<LgDocumentOverview> selectByExample(LgDocumentOverviewExample example);

    LgDocumentOverview selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LgDocumentOverview record, @Param("example") LgDocumentOverviewExample example);

    int updateByExample(@Param("record") LgDocumentOverview record, @Param("example") LgDocumentOverviewExample example);

    int updateByPrimaryKeySelective(LgDocumentOverview record);

    int updateByPrimaryKey(LgDocumentOverview record);
}