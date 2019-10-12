package com.zzb.ipfs.filestore.web;

import com.zzb.ipfs.filestore.dao.*;
import com.zzb.ipfs.filestore.impserver.StorageServiceimp;
import com.zzb.ipfs.filestore.pojo.*;
import com.zzb.ipfs.filestore.pojo.capacity.CapacityDto;
import com.zzb.ipfs.filestore.pojo.capacity.SecondLevel;
import com.zzb.ipfs.filestore.pojo.capacity.ThreeLevel;
import com.zzb.ipfs.filestore.pojo.dto.IPFSdto;
import com.zzb.ipfs.filestore.pojo.flowdata.Stair;
import com.zzb.ipfs.filestore.pojo.flowdata.StairFour;
import com.zzb.ipfs.filestore.pojo.flowdata.StairThree;
import com.zzb.ipfs.filestore.pojo.flowdata.StairTwo;
import com.zzb.ipfs.filestore.reids.RedisServie;
import com.zzb.ipfs.filestore.utils.DateUtils;
import com.zzb.ipfs.filestore.utils.LogDataQueue;
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
    RedisServie redisServie;
    @Autowired
    StorageServiceimp serverimp;
    @Autowired
    LogDataQueue logDataQueue ;
    @Autowired
    LgDataDescriptionMapper lgDataDescriptionMapper;
    @Autowired
    LgFileUploadDetailsMapper lgFileUploadDetailsMapper;
    @Autowired
    LgSnHeatMapper snHeatMapper;
    @Autowired
    LgDeviceStatisticsMapper statisticsMapper;
    @Autowired
    LgDocumentOverviewMapper documentOverviewMapper;
    @Autowired
    LgChannelStatisticsMapper channelStatisticsMapper;

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
            System.out.println(stair);
            System.out.println(capacityDto);
            //文件大小
            SecondLevel data = capacityDto.getData();
            List<ThreeLevel> filelist = data.getFilelist();
            if (filelist != null) {
                for (ThreeLevel three: filelist){
                    details.setFilesize(three.getFilesize());
                    //文件名称
                    details.setFilename(three.getFilename());
                    //上传流量
                    details.setUploadtraffic(three.getFilesize());
                    //上传结束时间
                    Integer filecreatets = three.getFilecreatets();
                    long l = Integer.toUnsignedLong(filecreatets)*1000;
                    String s = DateUtils.longToDate(l);
                    Date date1 = DateUtils.stringToDate1(s);
                    Date date = new Date(l);
                    System.out.println(date1);
                    System.out.println(data);
                    details.setTimaupdate(date1);
                }
            }
            //上传开始时间
            //下载渠道
            StairTwo data1 = stair.getData();
            List<StairThree> filelist1 = data1.getFilelist();
            if (filelist1 != null) {
                for(StairThree three: filelist1){
                    StairFour userlist = three.getUserlist();
                    details.setDownload(userlist.getAppid());
                    //下载用户
                    details.setDownloaduser(userlist.getUseridL());
                    //下载地区
                    details.setDownloadregion(userlist.getUserip());
                }
            }
            //上传速度
            //下载速度
            //上传设备
            details.setDevsn(stair.getDev_sn());
            lgFileUploadDetailsMapper.insert(details);
            return "success";
        } catch (Exception e) {
            return "error！";
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
                //log.setId(PkUtils.getPrimaryKey());
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
                if (capacityDto.getData_ex()!= null) {
                    log.setSpeed(Integer.valueOf(capacityDto.getData_ex().getUp_bw()));
                }
                //存储设备
                log.setDevsn(capacityDto.getDev_sn());
                lgDataDescriptionMapper.insert(log);
            }
            return "success";
        } catch (Exception e) {
            return "error";
        }
    }

    @GetMapping("/addLgSnHeat")
    public String addLgSnHeat(){
        try {
            LgSnHeat lgSnHeat = new LgSnHeat();
            CapacityDto capacityDto = logDataQueue.dequeueLogReportData();
            if (capacityDto != null) {
                //主键
                //lgSnHeat.setId(PkUtils.getPrimaryKey());
                //地区
                String dev_ip = capacityDto.getDev_ip();
                lgSnHeat.setRegion(dev_ip);
                System.out.println("http://ip.taobao.com/service/getIpInfo.php?ip="+dev_ip);
                //设备台数
                //设备SN
                lgSnHeat.setEquipmentSn(capacityDto.getDev_sn());
                //上传次数
                lgSnHeat.setUploadingtime(Integer.valueOf(capacityDto.getData().getFilecnt()));
                //上传流量
                List<ThreeLevel> filelist = capacityDto.getData().getFilelist();
                int filesize = 0;
                for(ThreeLevel three:filelist){
                    filesize += three.getFilesize();
                    lgSnHeat.setUploading(filesize);
                }
                snHeatMapper.insert(lgSnHeat);
                return "success";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "error";
    }


    /***
     * 添加LgDeviceStatistics表的数据
     * @return
     */
    @GetMapping("/addLgDeviceStatistics")
    String addLgDeviceStatistics(){
        try {
            Stair stair = logDataQueue.quoteStair();
            CapacityDto capacityDto = logDataQueue.dequeueLogReportData();
            LgDeviceStatistics statistics = new LgDeviceStatistics();
            //设备SN
            if (capacityDto.getDev_sn() != null) {
                statistics.setDevSn(capacityDto.getDev_sn());
            }
            //存储容量
            List<ThreeLevel> filelist = capacityDto.getData().getFilelist();
            int filesize = 0 ;
            for(ThreeLevel threeLevel :filelist){
                filesize += threeLevel.getFilesize();
                statistics.setMemoryCapacity(filesize+"");
            }
            //存储文件数量
            statistics.setFiledata(capacityDto.getData().getFilelist().size());
            //存储次数
            statistics.setFiletime(capacityDto.getData().getFilecnt());
            if(stair.getDev_sn().equals(capacityDto.getDev_sn())){
                //上传流量
                Integer userstreamsize= null;
                int j = 1;
                List<StairThree> filelist1 = stair.getData().getFilelist();
                if (filelist1 != null) {
                    //上传用户数
                    statistics.setUploadUser(stair.getData().getFilelist().size());
                    for (int i = 0 ;i < filelist1.size();) {
                        StairThree three = filelist1.get(i);
                        String appid1 = three.getUserlist().getAppid();
                        for(StairThree file : filelist1){
                            userstreamsize = file.getUserlist().getUserstreamsize();
                            String appid = file.getUserlist().getAppid();
                            if(!appid1.equals(appid)){
                                j++;
                            }
                        }
                    }
                }
                statistics.setUploadTraffic(userstreamsize);
                //上传渠道数
                statistics.setUploadChannel(j);
            }
            //平均存储带宽
            if (stair.getData_ex() != null) {
                String up_bw = stair.getData_ex().getUp_bw();
                Integer integer = Integer.valueOf(up_bw);
                String down_bw = stair.getData_ex().getDown_bw();
                Integer integer1 = Integer.valueOf(down_bw);
                Integer i = (integer+integer1)/2;
                System.out.println((integer+integer1)/2);
                if (i != 0) {
                    statistics.setStockpileBandwidth(i);
                }
            }
            //平均上传带宽
            if (capacityDto.getData_ex() != null) {
                String up_bw1 = capacityDto.getData_ex().getUp_bw();
                String down_bw1 = capacityDto.getData_ex().getDown_bw();
                Integer integer2 = Integer.valueOf(up_bw1);
                Integer integer3 = Integer.valueOf(down_bw1);
                if ((integer2+integer3)/2 != 0) {
                    statistics.setUploadBandwidth((integer2+integer3)/2);
                }
                System.out.println((integer2+integer3)/2);
            }
            //设备地区
            statistics.setRegion(stair.getDev_ip());
            statisticsMapper.insert(statistics);
            return "success";
        } catch (NumberFormatException e) {
            return "error";
        }
    }

    /***
     * 往"lg_document_overview"里添加数据
     * @return
     */
    @GetMapping("/addDocument")
    public String addDocument(){
        try {
            LgDocumentOverview overview = new LgDocumentOverview();
            Stair stair = logDataQueue.quoteStair();
            //CapacityDto capacityDto = logDataQueue.dequeueLogReportData();
            //主键
            //overview.setId(PkUtils.getPrimaryKey());
            //文件名称
            String filename = null;
            Integer filesize = null;
            String appid = null;
            List<StairThree> filelist = stair.getData().getFilelist();
            if (filelist != null) {
                for(StairThree three: filelist){
                    filename = three.getFilename();
                    filesize = three.getFilesize();
                    appid = three.getUserlist().getAppid();
                }
                overview.setDevName(filename);
                //文件类型
                String substring = filename.substring(filename.lastIndexOf(".") + 1);
                System.out.println(substring);
                overview.setDevType(substring);
                //文件标签
                //overview.setDevLabel();
                //文件大小
                overview.setDevSize(filesize);
                //所属渠道
                overview.setChannel(appid);
            }
            //默认备份次数
            //overview.setBackups();
            //备份发生的次数
            //overview.setBackupsOccur();
            //上传的总次数
            overview.setUploads(stair.getData().getFilecnt());
            //有效上传次数
            overview.setUploadValid(stair.getData().getFilecnt());
            //有效上传时间
            //overview.setUploadtime();
            //有效上传流量
            overview.setUploadFlow(stair.getData().getTotalstreamsize());
            //下载用户总数
            overview.setDownloadUser(stair.getData().getTotalusercount());
            //平均上传速度
            //overview.setUploadSpeed();
            documentOverviewMapper.insertSelective(overview);
            return "success";
        } catch (Exception e) {
            return "error";
        }
    }

    /***
     * 往 lg_channel_statistics 表里添加数据
     */
    @GetMapping("/addChannel")
    public String addChannel(){
        try {
            LgChannelStatistics channelStatistics = new LgChannelStatistics();
            //接收流量数据
            String appid = null;
            Stair stair = logDataQueue.quoteStair();
            CapacityDto capacityDto = logDataQueue.dequeueLogReportData();
            Integer filesize1 =null;
            List<StairThree> filelist = stair.getData().getFilelist();
            Integer filecnt1 = stair.getData().getFilecnt();
            int size = 0;
            int j = 0;
            if (filelist != null) {
                size = filelist.size();
                for (StairThree three: filelist){
                    appid = three.getUserlist().getAppid();
                    filesize1 = three.getFilesize();
                    StairFour userlist = three.getUserlist();
                    if(userlist != null){
                        j++;
                    }
                }
            }
            //从数据库中取出数据进行比较
            String name = null;
            Integer addup = null;
            Integer backups = null;
            Integer addQuantity = null;
            Integer backupsQuantity = null;
            Integer addDownload = null;
            Integer addDownloadQuantity = null;
            Integer addtime = null;
            Integer addUser = null;
            LgChannelStatistics channelStatistics1 = channelStatisticsMapper.seleLgChannelStatistics(appid);
            if (channelStatistics1 != null) {
                name = channelStatistics1.getName();
                addup = channelStatistics1.getAddup();
                backups = channelStatistics1.getBackups();
                addQuantity = channelStatistics1.getAddQuantity();
                backupsQuantity = channelStatistics1.getBackupsQuantity();
                addDownload = channelStatistics1.getAddDownload();
                addDownloadQuantity = channelStatistics1.getAddDownloadQuantity();
                addtime = channelStatistics1.getAddtime();
                addUser = channelStatistics1.getAddUser();
            }
                if (stair.getDev_ip().equals(capacityDto.getDev_ip())) {
                    if (appid.equals(name)){
                        if (name != null) {
                            //渠道名称
                            channelStatistics.setName(name);
                            //累计存储容量
                            Integer filesize = null;
                            String filetype = null;
                            List<ThreeLevel> filelist1 = capacityDto.getData().getFilelist();
                        if (filelist1 != null) {
                            for(ThreeLevel level : filelist1){
                                filesize += level.getFilesize();
                                filetype = level.getFiletype();
                            }
                        }
                        channelStatistics.setAddup(filesize+addup);
                        //备份存储容量
                        if(filetype.equals("backup")){
                            channelStatistics.setBackups(backups+filesize);
                            //备份文件数量
                            channelStatistics.setBackupsQuantity(backupsQuantity+filesize);
                        }
                        //累计存储文件数量
                        Integer filecnt = capacityDto.getData().getFilecnt();
                        channelStatistics.setAddQuantity(addQuantity+filecnt);
                        //累计下载流量
                        channelStatistics.setAddDownload(addDownload+filesize1);
                        //累计下载文件数量
                        channelStatistics.setAddDownloadQuantity(addDownloadQuantity+filecnt1);
                        //累计下载次数
                        channelStatistics.setAddtime(size+addtime);
                        //累计下载用户数
                        channelStatistics.setAddUser(addUser+j);
                        channelStatisticsMapper.updateByPrimaryKey(channelStatistics);
                        return "success（数据已更新）";
                    }
                }else {
                    if (appid != null) {
                        //渠道名称
                        channelStatistics.setName(appid);
                        //累计存储容量
                        List<ThreeLevel> filelist1 = capacityDto.getData().getFilelist();
                        Integer filesize = null;
                        String filetype =null;
                        if (filecnt1 != null) {
                            for(ThreeLevel level: filelist1){
                                filesize += level.getFilesize();
                                filetype = level.getFiletype();
                            }
                        }
                        channelStatistics.setAddup(filesize);
                        //备份存储容量
                        if(filetype.equals("backup")){
                            channelStatistics.setBackups(filesize);
                            //备份文件数量
                            channelStatistics.setBackupsQuantity(filesize);
                        }
                        //累计存储文件数量
                        channelStatistics.setAddQuantity(capacityDto.getData().getFilecnt());
                        //累计下载流量
                        channelStatistics.setAddDownload(filesize1);
                        //累计下载文件数量
                        channelStatistics.setAddDownloadQuantity(filecnt1);
                        //累计下载次数
                        channelStatistics.setAddtime(size);
                        //累计下载用户数
                        channelStatistics.setAddUser(j);
                        channelStatisticsMapper.insert(channelStatistics);
                        return "success (数据已添加)";
                    }
                }
            }
            return "不是同一台西柚机上报的数据，可能会发生错误";
        } catch (Exception e) {
            return "error";
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
