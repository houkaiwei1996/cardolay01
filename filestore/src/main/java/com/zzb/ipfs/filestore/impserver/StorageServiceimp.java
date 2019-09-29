package com.zzb.ipfs.filestore.impserver;

import com.zzb.ipfs.filestore.pojo.LgDataDescription;
import com.zzb.ipfs.filestore.pojo.dto.IPFSdto;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface StorageServiceimp {

    /**
     * 根据页面传回来的数据进行模糊查询(文件存储明细功能)
     * @param sdto
     * @return
     */
    List<LgDataDescription> selectFsdelist(IPFSdto sdto,Integer currPage, Integer pageSize);

    /**
     * “导出”：可导出当前查询结果数据为 excel 文件，附带表头
     */
    String importExcel(List<LgDataDescription> list) throws IOException;


}
