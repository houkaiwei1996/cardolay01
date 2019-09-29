package com.zzb.ipfs.filestore.server;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zzb.ipfs.filestore.dao.LgFileUploadDetailsMapper;
import com.zzb.ipfs.filestore.impserver.UploadingServiceimp;
import com.zzb.ipfs.filestore.pojo.LgFileUploadDetails;
import com.zzb.ipfs.filestore.pojo.LgFileUploadDetailsExample;
import com.zzb.ipfs.filestore.pojo.dto.LgFileUploadDetailsDto;
import com.zzb.ipfs.filestore.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class UploadingService implements UploadingServiceimp {

    @Autowired
    private LgFileUploadDetailsMapper lgFileUploadDetailsMapper;

    /**
     * 测试
     * @return
     */
    @Override
    public List<LgFileUploadDetails> selectLgFileUploadDetails() {
        List<LgFileUploadDetails> lgFileUploadDetails = lgFileUploadDetailsMapper.selectByExample(null);
        return lgFileUploadDetails;
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
    @Override
    public List<LgFileUploadDetails> selectLguploadlist(LgFileUploadDetailsDto dto,Integer currPage, Integer pageSize) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //mybatis实现分页
        Page<Object> objects = PageHelper.startPage(currPage, pageSize);

        LgFileUploadDetailsExample lgFileUploadDetailsExample = new LgFileUploadDetailsExample();
        LgFileUploadDetailsExample.Criteria criteria = lgFileUploadDetailsExample.createCriteria();
        if(dto.getFilename() == null && dto.getDevsn() ==null && dto.getTimebigen() == null && dto.getTimaupdate() == null && dto.getDownload() == null && dto.getDownloadregion() == null){
            List<LgFileUploadDetails> lgFileUploadDetails = selectLgFileUploadDetails();
            return lgFileUploadDetails;
        }else {
            if(dto.getFilename() != null){
                criteria.andFilenameLike("%"+dto.getFilename()+"%");
            }
            if(dto.getDevsn() != null){
                criteria.andDevsnLike("%"+dto.getDevsn()+"%");
            }
            if(dto.getDownload() != null){
                criteria.andDownloadLike("%"+dto.getDownload()+"%");
            }
            if(dto.getDownloadregion() != null){
                criteria.andDownloadregionEqualTo(dto.getDownloadregion());
            }
            if(dto.getTimebigen() != null){
                String s = dto.getTimebigen().toString();
                try {
                    Date date = sdf.parse(s);
                    System.out.println(date);
                    if (date != null) {
                        criteria.andTimebigenGreaterThanOrEqualTo(date);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            if(dto.getTimaupdate() != null){
                String s = dto.getTimaupdate().toString();
                try {
                    Date date = sdf.parse(s);
                    System.out.println(date);
                    if (date != null) {
                        criteria.andTimebigenGreaterThanOrEqualTo(date);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            List<LgFileUploadDetails> lgFileUploadDetails = lgFileUploadDetailsMapper.selectByExample(lgFileUploadDetailsExample);
            return lgFileUploadDetails;
        }
    }
}
