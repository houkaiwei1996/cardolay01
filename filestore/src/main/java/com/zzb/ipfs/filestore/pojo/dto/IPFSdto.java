package com.zzb.ipfs.filestore.pojo.dto;

import java.util.Date;

//文件存储明细功能参数
public class IPFSdto {

    @Override
    public String toString() {
        return "IPFSdto{" +
                "ipfsname='" + ipfsname + '\'' +
                ", devSn='" + devSn + '\'' +
                ", ptfs_type=" + ptfs_type +
                ", timeCreate=" + timeCreate +
                ", timeUpdate=" + timeUpdate +
                '}';
    }

    public String getIpfsname() {
        return ipfsname;
    }

    public void setIpfsname(String ipfsname) {
        this.ipfsname = ipfsname;
    }

    public String getDevSn() {
        return devSn;
    }

    public void setDevSn(String devSn) {
        this.devSn = devSn;
    }

    public Integer getPtfs_type() {
        return ptfs_type;
    }

    public void setPtfs_type(Integer ptfs_type) {
        this.ptfs_type = ptfs_type;
    }


    //文件名称
    private String ipfsname;

    //西柚机设备SN
    private String devSn;

    public Long getTimeCreate() {
        return timeCreate;
    }

    public void setTimeCreate(Long timeCreate) {
        this.timeCreate = timeCreate;
    }

    public Long getTimeUpdate() {
        return timeUpdate;
    }

    public void setTimeUpdate(Long timeUpdate) {
        this.timeUpdate = timeUpdate;
    }

    //存储类型
    private Integer ptfs_type;

    //存储开始时间
    private Long timeCreate;

    //存储结束时间
    private Long timeUpdate;
}
