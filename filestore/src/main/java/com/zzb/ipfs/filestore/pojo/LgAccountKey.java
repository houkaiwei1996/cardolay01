package com.zzb.ipfs.filestore.pojo;

import java.io.Serializable;

public class LgAccountKey implements Serializable {
    private Integer id;

    private String aid;

    private String secretid;

    private String secretkey;

    private Long currenttime;

    private Integer status;

    private String username;

    private Integer delKey;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid == null ? null : aid.trim();
    }

    public String getSecretid() {
        return secretid;
    }

    public void setSecretid(String secretid) {
        this.secretid = secretid == null ? null : secretid.trim();
    }

    public String getSecretkey() {
        return secretkey;
    }

    public void setSecretkey(String secretkey) {
        this.secretkey = secretkey == null ? null : secretkey.trim();
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
        this.username = username == null ? null : username.trim();
    }

    public Integer getDelKey() {
        return delKey;
    }

    public void setDelKey(Integer delKey) {
        this.delKey = delKey;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", aid=").append(aid);
        sb.append(", secretid=").append(secretid);
        sb.append(", secretkey=").append(secretkey);
        sb.append(", currenttime=").append(currenttime);
        sb.append(", status=").append(status);
        sb.append(", username=").append(username);
        sb.append(", delKey=").append(delKey);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}