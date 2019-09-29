package com.zzb.ipfs.filestore.pojo;

import java.io.Serializable;
import java.util.Date;

public class LgDataDescription implements Serializable {
    private String id;

    private String filename;

    private Date timebegin;

    private Date timeupdata;

    private String storageclass;

    private Integer filesize;

    private Integer capacity;

    private Integer speed;

    private String devsn;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public Date getTimebegin() {
        return timebegin;
    }

    public void setTimebegin(Date timebegin) {
        this.timebegin = timebegin;
    }

    public Date getTimeupdata() {
        return timeupdata;
    }

    public void setTimeupdata(Date timeupdata) {
        this.timeupdata = timeupdata;
    }

    public String getStorageclass() {
        return storageclass;
    }

    public void setStorageclass(String storageclass) {
        this.storageclass = storageclass == null ? null : storageclass.trim();
    }

    public Integer getFilesize() {
        return filesize;
    }

    public void setFilesize(Integer filesize) {
        this.filesize = filesize;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public String getDevsn() {
        return devsn;
    }

    public void setDevsn(String devsn) {
        this.devsn = devsn == null ? null : devsn.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", filename=").append(filename);
        sb.append(", timebegin=").append(timebegin);
        sb.append(", timeupdata=").append(timeupdata);
        sb.append(", storageclass=").append(storageclass);
        sb.append(", filesize=").append(filesize);
        sb.append(", capacity=").append(capacity);
        sb.append(", speed=").append(speed);
        sb.append(", devsn=").append(devsn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}