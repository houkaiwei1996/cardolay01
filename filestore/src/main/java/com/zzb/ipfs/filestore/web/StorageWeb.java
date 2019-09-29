package com.zzb.ipfs.filestore.web;

import com.zzb.ipfs.filestore.dao.LgDataDescriptionMapper;
import com.zzb.ipfs.filestore.dao.LgFileUploadDetailsMapper;
import com.zzb.ipfs.filestore.impserver.StorageServiceimp;
import com.zzb.ipfs.filestore.pojo.LgDataDescription;
import com.zzb.ipfs.filestore.pojo.LgFileUploadDetails;
import com.zzb.ipfs.filestore.pojo.capacity.CapacityDto;
import com.zzb.ipfs.filestore.pojo.capacity.SecondLevel;
import com.zzb.ipfs.filestore.pojo.capacity.ThreeLevel;
import com.zzb.ipfs.filestore.pojo.dto.IPFSdto;
import com.zzb.ipfs.filestore.pojo.flowdata.Stair;
import com.zzb.ipfs.filestore.pojo.flowdata.StairFour;
import com.zzb.ipfs.filestore.pojo.flowdata.StairThree;
import com.zzb.ipfs.filestore.pojo.flowdata.StairTwo;
import com.zzb.ipfs.filestore.utils.LogDataQueue;
import com.zzb.ipfs.filestore.utils.PkUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class StorageWeb {

    @Autowired
    StorageServiceimp serverimp;
    @Autowired
    LogDataQueue logDataQueue ;
    @Autowired
    LgDataDescriptionMapper lgDataDescriptionMapper;
    @Autowired
    LgFileUploadDetailsMapper lgFileUploadDetailsMapper;
    /**
     * 根据页面传回来的数据进行模糊查询(文件存储明细功能)
     * @param sdto
     * @return
     */
    @ResponseBody
    @GetMapping("/selectFsdelist")
    List<LgDataDescription> selectFsdelist(IPFSdto sdto,Integer currPage, Integer pageSize){
        return serverimp.selectFsdelist(sdto,currPage,pageSize);
    }

    /***
     * 添加数据到数据库中(type = 2，容量消息【文件上传明细数据】)
     * @return
     */
    @GetMapping("/insertLgdata")
    public String insertLgdata(){
        try {
            //LgFileUploadDetails(文件上传)
            LgFileUploadDetails details = new LgFileUploadDetails();
            CapacityDto capacityDto = logDataQueue.dequeueLogReportData();
            Stair stair = logDataQueue.quoteStair();
            System.out.println(capacityDto);
            //主键
            String primaryKey = PkUtils.getPrimaryKey();
            //文件大小
            SecondLevel data = capacityDto.getData();
            List<ThreeLevel> filelist = data.getFilelist();
            for (ThreeLevel three: filelist){
                details.setFilesize(three.getFilesize());
                //文件名称
                details.setFilename(three.getFilename());
            }
            //上传流量
            details.setUploadtraffic(null);
            //上传开始时间
            //上传结束时间
            //下载渠道
            StairTwo data1 = stair.getData();
            List<StairThree> filelist1 = data1.getFilelist();
            for(StairThree three: filelist1){
                StairFour userlist = three.getUserlist();
                details.setDownload(userlist.getAppid());
                //下载用户
                details.setDownloaduser(userlist.getUseridL());
            }
            //下载地区
            //上传速度
            //下载速度
            //上传设备
            details.setDevsn(capacityDto.getDev_sn());
            lgFileUploadDetailsMapper.insert(details);
            return "数据添加成功";
        } catch (Exception e) {
            return "数据添加失败！";
        }
    }

    /***
     * 数据添加到数据中（type = 1 流量消息【文件存储明细数据】）
     * @return
     */
    @GetMapping("/addCapacity")
    public String addStair(){
        String filename = null;
        try {
            //LgDataDescription表（文件下载）
            LgDataDescription log = new LgDataDescription();
            CapacityDto capacityDto = logDataQueue.dequeueLogReportData();
            if (capacityDto != null) {
                //主键
                log.setId(PkUtils.getPrimaryKey());
                //文件名
                SecondLevel data = capacityDto.getData();
                List<ThreeLevel> filelist = data.getFilelist();
                for(ThreeLevel three: filelist){
                    filename = three.getFilename();
                    if (filename != null) {
                        log.setFilename(filename);
                        //存储开始时间
                        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        Integer filecreatets =three.getFilecreatets();
                        long l = filecreatets.longValue()*1000;
                        Date date = new Date(l);
                        System.out.println(data);
                        log.setTimebegin(date);
                    }
                    //文件大小
                    log.setFilesize(three.getFilesize());
                }
                //存储结束时间
                Integer timestamp = data.getTimestamp();
                if (timestamp != null) {
                    long l = timestamp.longValue()*1000;
                    Date date = new Date(l);
                    log.setTimeupdata(date);
                }
                //存储类型
                log.setStorageclass(capacityDto.getPtfs_type().toString());
                //实际存储容量
                log.setCapacity(null);
                //平均存储带宽
                log.setSpeed(null);
                //存储设备
                log.setDevsn(capacityDto.getDev_sn());
                lgDataDescriptionMapper.insert(log);
            }
            return "数据添加成功";
        } catch (Exception e) {
            return "数据添加失败";
        }
    }


    /**
     * “导出”：可导出当前查询结果数据为 excel 文件，附带表头
     */
    @ResponseBody
    @GetMapping("/importExcel")
    public String importExcel(List<LgDataDescription> list) throws IOException {
        return serverimp.importExcel(list);
    }
}
