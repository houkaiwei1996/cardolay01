package com.zzb.ipfs.filestore.pojo.flowdata;

import java.io.Serializable;

public class Stairsix implements Serializable {

    private String appid;
    private String userid;
    private String userip;
    private Integer userstreamsize;

    @Override
    public String toString() {
        return "Stairsix{" +
                "appid='" + appid + '\'' +
                ", userid='" + userid + '\'' +
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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
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
}
