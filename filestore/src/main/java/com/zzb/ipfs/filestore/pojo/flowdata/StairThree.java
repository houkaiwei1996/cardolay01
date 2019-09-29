package com.zzb.ipfs.filestore.pojo.flowdata;

import java.io.Serializable;
import java.util.List;

//流量3级数据节点
public class StairThree implements Serializable {

    private String fileid;
    private String filename;
    private String ownerid;
    private Integer filesize;

    @Override
    public String toString() {
        return "StairThree{" +
                "fileid='" + fileid + '\'' +
                ", filename='" + filename + '\'' +
                ", ownerid='" + ownerid + '\'' +
                ", filesize=" + filesize +
                ", filestreamsize=" + filestreamsize +
                ", usercount=" + usercount +
                ", userlist=" + userlist +
                '}';
    }

    public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(String ownerid) {
        this.ownerid = ownerid;
    }

    public Integer getFilesize() {
        return filesize;
    }

    public void setFilesize(Integer filesize) {
        this.filesize = filesize;
    }

    public Integer getFilestreamsize() {
        return filestreamsize;
    }

    public void setFilestreamsize(Integer filestreamsize) {
        this.filestreamsize = filestreamsize;
    }

    public Integer getUsercount() {
        return usercount;
    }

    public void setUsercount(Integer usercount) {
        this.usercount = usercount;
    }

    public StairFour getUserlist() {
        return userlist;
    }

    public void setUserlist(StairFour userlist) {
        this.userlist = userlist;
    }

    private Integer filestreamsize;
    private Integer usercount;
    private StairFour userlist;
}
