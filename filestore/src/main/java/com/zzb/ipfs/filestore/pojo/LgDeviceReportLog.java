package com.zzb.ipfs.filestore.pojo;

import java.io.Serializable;

public class LgDeviceReportLog implements Serializable {
    private Long id;

    private String devSn;

    private String devIp;

    private String ipfsHash;

    private Integer logType;

    private Integer logSeqno;

    private String recordId;

    private Integer subPkgCnt;

    private Long timeCreate;

    private Long timeUpdate;

    private String data;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDevSn() {
        return devSn;
    }

    public void setDevSn(String devSn) {
        this.devSn = devSn == null ? null : devSn.trim();
    }

    public String getDevIp() {
        return devIp;
    }

    public void setDevIp(String devIp) {
        this.devIp = devIp == null ? null : devIp.trim();
    }

    public String getIpfsHash() {
        return ipfsHash;
    }

    public void setIpfsHash(String ipfsHash) {
        this.ipfsHash = ipfsHash == null ? null : ipfsHash.trim();
    }

    public Integer getLogType() {
        return logType;
    }

    public void setLogType(Integer logType) {
        this.logType = logType;
    }

    public Integer getLogSeqno() {
        return logSeqno;
    }

    public void setLogSeqno(Integer logSeqno) {
        this.logSeqno = logSeqno;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    public Integer getSubPkgCnt() {
        return subPkgCnt;
    }

    public void setSubPkgCnt(Integer subPkgCnt) {
        this.subPkgCnt = subPkgCnt;
    }

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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", devSn=").append(devSn);
        sb.append(", devIp=").append(devIp);
        sb.append(", ipfsHash=").append(ipfsHash);
        sb.append(", logType=").append(logType);
        sb.append(", logSeqno=").append(logSeqno);
        sb.append(", recordId=").append(recordId);
        sb.append(", subPkgCnt=").append(subPkgCnt);
        sb.append(", timeCreate=").append(timeCreate);
        sb.append(", timeUpdate=").append(timeUpdate);
        sb.append(", data=").append(data);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}