package com.zzb.ipfs.filestore.pojo;

import java.io.Serializable;

public class LgChannelStatistics implements Serializable {
    private Integer id;

    private String name;

    private Integer addup;

    private Integer backups;

    private Integer addQuantity;

    private Integer backupsQuantity;

    private Integer addDownload;

    private Integer addDownloadQuantity;

    private Integer addtime;

    private Integer addUser;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAddup() {
        return addup;
    }

    public void setAddup(Integer addup) {
        this.addup = addup;
    }

    public Integer getBackups() {
        return backups;
    }

    public void setBackups(Integer backups) {
        this.backups = backups;
    }

    public Integer getAddQuantity() {
        return addQuantity;
    }

    public void setAddQuantity(Integer addQuantity) {
        this.addQuantity = addQuantity;
    }

    public Integer getBackupsQuantity() {
        return backupsQuantity;
    }

    public void setBackupsQuantity(Integer backupsQuantity) {
        this.backupsQuantity = backupsQuantity;
    }

    public Integer getAddDownload() {
        return addDownload;
    }

    public void setAddDownload(Integer addDownload) {
        this.addDownload = addDownload;
    }

    public Integer getAddDownloadQuantity() {
        return addDownloadQuantity;
    }

    public void setAddDownloadQuantity(Integer addDownloadQuantity) {
        this.addDownloadQuantity = addDownloadQuantity;
    }

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    public Integer getAddUser() {
        return addUser;
    }

    public void setAddUser(Integer addUser) {
        this.addUser = addUser;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", addup=").append(addup);
        sb.append(", backups=").append(backups);
        sb.append(", addQuantity=").append(addQuantity);
        sb.append(", backupsQuantity=").append(backupsQuantity);
        sb.append(", addDownload=").append(addDownload);
        sb.append(", addDownloadQuantity=").append(addDownloadQuantity);
        sb.append(", addtime=").append(addtime);
        sb.append(", addUser=").append(addUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}