package com.zzb.ipfs.filestore.pojo;

import java.io.Serializable;

public class LgDocumentOverview implements Serializable {
    private String id;

    private String devName;

    private String devType;

    private String devLabel;

    private Integer devSize;

    private String channel;

    private Integer backups;

    private Integer backupsOccur;

    private Integer uploads;

    private Integer uploadValid;

    private String uploadtime;

    private Integer uploadFlow;

    private Integer downloadUser;

    private Integer uploadSpeed;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName == null ? null : devName.trim();
    }

    public String getDevType() {
        return devType;
    }

    public void setDevType(String devType) {
        this.devType = devType == null ? null : devType.trim();
    }

    public String getDevLabel() {
        return devLabel;
    }

    public void setDevLabel(String devLabel) {
        this.devLabel = devLabel == null ? null : devLabel.trim();
    }

    public Integer getDevSize() {
        return devSize;
    }

    public void setDevSize(Integer devSize) {
        this.devSize = devSize;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public Integer getBackups() {
        return backups;
    }

    public void setBackups(Integer backups) {
        this.backups = backups;
    }

    public Integer getBackupsOccur() {
        return backupsOccur;
    }

    public void setBackupsOccur(Integer backupsOccur) {
        this.backupsOccur = backupsOccur;
    }

    public Integer getUploads() {
        return uploads;
    }

    public void setUploads(Integer uploads) {
        this.uploads = uploads;
    }

    public Integer getUploadValid() {
        return uploadValid;
    }

    public void setUploadValid(Integer uploadValid) {
        this.uploadValid = uploadValid;
    }

    public String getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(String uploadtime) {
        this.uploadtime = uploadtime == null ? null : uploadtime.trim();
    }

    public Integer getUploadFlow() {
        return uploadFlow;
    }

    public void setUploadFlow(Integer uploadFlow) {
        this.uploadFlow = uploadFlow;
    }

    public Integer getDownloadUser() {
        return downloadUser;
    }

    public void setDownloadUser(Integer downloadUser) {
        this.downloadUser = downloadUser;
    }

    public Integer getUploadSpeed() {
        return uploadSpeed;
    }

    public void setUploadSpeed(Integer uploadSpeed) {
        this.uploadSpeed = uploadSpeed;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", devName=").append(devName);
        sb.append(", devType=").append(devType);
        sb.append(", devLabel=").append(devLabel);
        sb.append(", devSize=").append(devSize);
        sb.append(", channel=").append(channel);
        sb.append(", backups=").append(backups);
        sb.append(", backupsOccur=").append(backupsOccur);
        sb.append(", uploads=").append(uploads);
        sb.append(", uploadValid=").append(uploadValid);
        sb.append(", uploadtime=").append(uploadtime);
        sb.append(", uploadFlow=").append(uploadFlow);
        sb.append(", downloadUser=").append(downloadUser);
        sb.append(", uploadSpeed=").append(uploadSpeed);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}