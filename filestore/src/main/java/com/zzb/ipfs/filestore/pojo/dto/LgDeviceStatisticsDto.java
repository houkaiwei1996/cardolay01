package com.zzb.ipfs.filestore.pojo.dto;

import java.io.Serializable;

public class LgDeviceStatisticsDto implements Serializable {

    private String devSn;

    private String region;

    private Integer uploadTraffic;

    public String getDevSn() {
        return devSn;
    }

    @Override
    public String toString() {
        return "LgDeviceStatisticsDto{" +
                "devSn='" + devSn + '\'' +
                ", region='" + region + '\'' +
                ", uploadTraffic=" + uploadTraffic +
                ", uploadTraffic1=" + uploadTraffic1 +
                '}';
    }

    public void setDevSn(String devSn) {
        this.devSn = devSn;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getUploadTraffic() {
        return uploadTraffic;
    }

    public void setUploadTraffic(Integer uploadTraffic) {
        this.uploadTraffic = uploadTraffic;
    }

    public Integer getUploadTraffic1() {
        return uploadTraffic1;
    }

    public void setUploadTraffic1(Integer uploadTraffic1) {
        this.uploadTraffic1 = uploadTraffic1;
    }

    private Integer uploadTraffic1;
}
