package com.zzb.ipfs.filestore.pojo.dto;

import java.io.Serializable;

public class LgAccountKeyDto implements Serializable {

    private String aid;

    private String secretid;

    private String secretkey;

    private Long currenttime;

    private Integer status;

    private String username;

    public String getAid() {
        return aid;
    }

    @Override
    public String toString() {
        return "LgAccountKeyDto{" +
                "aid='" + aid + '\'' +
                ", secretid='" + secretid + '\'' +
                ", secretkey='" + secretkey + '\'' +
                ", currenttime=" + currenttime +
                ", status=" + status +
                ", username='" + username + '\'' +
                '}';
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getSecretid() {
        return secretid;
    }

    public void setSecretid(String secretid) {
        this.secretid = secretid;
    }

    public String getSecretkey() {
        return secretkey;
    }

    public void setSecretkey(String secretkey) {
        this.secretkey = secretkey;
    }

    public Long getCurrenttime() {
        return currenttime;
    }

    public void setCurrenttime(Long currenttime) {
        this.currenttime = currenttime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
