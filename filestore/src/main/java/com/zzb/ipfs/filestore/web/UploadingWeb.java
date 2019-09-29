package com.zzb.ipfs.filestore.web;

import com.zzb.ipfs.filestore.impserver.UploadingServiceimp;
import com.zzb.ipfs.filestore.pojo.LgFileUploadDetails;
import com.zzb.ipfs.filestore.pojo.dto.LgFileUploadDetailsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UploadingWeb {

    @Autowired
    UploadingServiceimp uploadingServiceimp;

    /***
     * 测试
     */
    @GetMapping("/selectLgFileUploadDetails")
    List<LgFileUploadDetails> selectLgFileUploadDetails(){
        return uploadingServiceimp.selectLgFileUploadDetails();
    }

    /***
     * 查询条件：
     * 文件名称：支持模糊查询，不填则无此条件
     * 设备 SN：支持模糊查询，不填则无此条件
     * 渠道：支持模糊查询，不填则无此条件
     * 地区：点击为省市选项组，不填则无此条件
     * 时间区间：上传时间区间，需校验开始值小于等于结束值，不填则无此条件
     * 无查询条件点击搜索为全查
     * Integer currPage, Integer pageSize
     * 实现mybatis的分页效果
     * @return
     */
    @ResponseBody
    @GetMapping("/selectLguploadlist")
    List<LgFileUploadDetails> selectLguploadlist(LgFileUploadDetailsDto dto,Integer currPage, Integer pageSize) {
        return uploadingServiceimp.selectLguploadlist(dto,currPage,pageSize);
    }
}
