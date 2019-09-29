package com.zzb.ipfs.filestore.pojo.capacity;

import java.io.Serializable;

//容量3级数据节点
public class ThreeLevel implements Serializable {

    private String fileid;
    private Integer filecreatets;
    private Integer filesize;
    private String filetype;
    private String filename;
    private String ownerid;

    @Override
    public String toString() {
        return "ThreeLevel{" +
                "fileid='" + fileid + '\'' +
                ", filecreatets=" + filecreatets +
                ", filesize=" + filesize +
                ", filetype='" + filetype + '\'' +
                ", filename='" + filename + '\'' +
                ", ownerid='" + ownerid + '\'' +
                '}';
    }
    public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid;
    }

    public Integer getFilecreatets() {
        return filecreatets;
    }

    public void setFilecreatets(Integer filecreatets) {
        this.filecreatets = filecreatets;
    }

    public Integer getFilesize() {
        return filesize;
    }

    public void setFilesize(Integer filesize) {
        this.filesize = filesize;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
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
}
