package com.zzb.ipfs.filestore.pojo.flowdata;

import java.io.Serializable;

//流量4级数据节点
public class StairFour implements Serializable {

    private String appid;
    private String userid;
    private String userip;

    @Override
    public String toString() {
        return "StairFour{" +
                "appid='" + appid + '\'' +
                ", useridL='" + userid + '\'' +
                ", userip='" + userip + '\'' +
                ", userstreamsize=" + userstreamsize +
                '}';
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getUseridL() {
        return userid;
    }

    public void setUseridL(String useridL) {
        this.userid = useridL;
    }

    public String getUserip() {
        return userip;
    }

    public void setUserip(String userip) {
        this.userip = userip;
    }

    public Integer getUserstreamsize() {
        return userstreamsize;
    }

    public void setUserstreamsize(Integer userstreamsize) {
        this.userstreamsize = userstreamsize;
    }

    private Integer userstreamsize;
}
