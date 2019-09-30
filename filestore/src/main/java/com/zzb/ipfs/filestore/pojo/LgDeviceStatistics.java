package com.zzb.ipfs.filestore.pojo;

import java.io.Serializable;

public class LgDeviceStatistics implements Serializable {
    private String id;

    private String devSn;

    private String memoryCapacity;

    private Integer filedata;

    private Integer filetime;

    private Integer uploadTraffic;

    private Integer uploadChannel;

    private Integer uploadUser;

    private Integer stockpileBandwidth;

    private Integer uploadBandwidth;

    private String region;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDevSn() {
        return devSn;
    }

    public void setDevSn(String devSn) {
        this.devSn = devSn == null ? null : devSn.trim();
    }

    public String getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(String memoryCapacity) {
        this.memoryCapacity = memoryCapacity == null ? null : memoryCapacity.trim();
    }

    public Integer getFiledata() {
        return filedata;
    }

    public void setFiledata(Integer filedata) {
        this.filedata = filedata;
    }

    public Integer getFiletime() {
        return filetime;
    }

    public void setFiletime(Integer filetime) {
        this.filetime = filetime;
    }

    public Integer getUploadTraffic() {
        return uploadTraffic;
    }

    public void setUploadTraffic(Integer uploadTraffic) {
        this.uploadTraffic = uploadTraffic;
    }

    public Integer getUploadChannel() {
        return uploadChannel;
    }

    public void setUploadChannel(Integer uploadChannel) {
        this.uploadChannel = uploadChannel;
    }

    public Integer getUploadUser() {
        return uploadUser;
    }

    public void setUploadUser(Integer uploadUser) {
        this.uploadUser = uploadUser;
    }

    public Integer getStockpileBandwidth() {
        return stockpileBandwidth;
    }

    public void setStockpileBandwidth(Integer stockpileBandwidth) {
        this.stockpileBandwidth = stockpileBandwidth;
    }

    public Integer getUploadBandwidth() {
        return uploadBandwidth;
    }

    public void setUploadBandwidth(Integer uploadBandwidth) {
        this.uploadBandwidth = uploadBandwidth;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", devSn=").append(devSn);
        sb.append(", memoryCapacity=").append(memoryCapacity);
        sb.append(", filedata=").append(filedata);
        sb.append(", filetime=").append(filetime);
        sb.append(", uploadTraffic=").append(uploadTraffic);
        sb.append(", uploadChannel=").append(uploadChannel);
        sb.append(", uploadUser=").append(uploadUser);
        sb.append(", stockpileBandwidth=").append(stockpileBandwidth);
        sb.append(", uploadBandwidth=").append(uploadBandwidth);
        sb.append(", region=").append(region);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}