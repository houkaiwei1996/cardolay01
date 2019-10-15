package com.zzb.ipfs.filestore.pojo;

import java.io.Serializable;

public class LgDateStatistics implements Serializable {
    private Integer id;

    private String dateStatistics;

    private String channelName;

    private Integer memoryCapacity;

    private Integer backupCapacity;

    private Integer fileSize;

    private Integer backupSize;

    private Integer downloadFlow;

    private Integer downloadSize;

    private Integer downloadtime;

    private Integer downloadUser;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDateStatistics() {
        return dateStatistics;
    }

    public void setDateStatistics(String dateStatistics) {
        this.dateStatistics = dateStatistics == null ? null : dateStatistics.trim();
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public Integer getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(Integer memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public Integer getBackupCapacity() {
        return backupCapacity;
    }

    public void setBackupCapacity(Integer backupCapacity) {
        this.backupCapacity = backupCapacity;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public Integer getBackupSize() {
        return backupSize;
    }

    public void setBackupSize(Integer backupSize) {
        this.backupSize = backupSize;
    }

    public Integer getDownloadFlow() {
        return downloadFlow;
    }

    public void setDownloadFlow(Integer downloadFlow) {
        this.downloadFlow = downloadFlow;
    }

    public Integer getDownloadSize() {
        return downloadSize;
    }

    public void setDownloadSize(Integer downloadSize) {
        this.downloadSize = downloadSize;
    }

    public Integer getDownloadtime() {
        return downloadtime;
    }

    public void setDownloadtime(Integer downloadtime) {
        this.downloadtime = downloadtime;
    }

    public Integer getDownloadUser() {
        return downloadUser;
    }

    public void setDownloadUser(Integer downloadUser) {
        this.downloadUser = downloadUser;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", dateStatistics=").append(dateStatistics);
        sb.append(", channelName=").append(channelName);
        sb.append(", memoryCapacity=").append(memoryCapacity);
        sb.append(", backupCapacity=").append(backupCapacity);
        sb.append(", fileSize=").append(fileSize);
        sb.append(", backupSize=").append(backupSize);
        sb.append(", downloadFlow=").append(downloadFlow);
        sb.append(", downloadSize=").append(downloadSize);
        sb.append(", downloadtime=").append(downloadtime);
        sb.append(", downloadUser=").append(downloadUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}