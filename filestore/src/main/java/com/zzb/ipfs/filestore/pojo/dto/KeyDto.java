package com.zzb.ipfs.filestore.pojo.dto;

import java.io.Serializable;

public class KeyDto implements Serializable {

    private String aid;

    private String username;

    private String secretid;

    @Override
    public String toString() {
        return "KeyDto{" +
                "aid='" + aid + '\'' +
                ", username='" + username + '\'' +
                ", secretid='" + secretid + '\'' +
                '}';
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSecretid() {
        return secretid;
    }

    public void setSecretid(String secretid) {
        this.secretid = secretid;
    }
}
