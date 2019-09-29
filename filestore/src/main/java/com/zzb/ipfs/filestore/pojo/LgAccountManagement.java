package com.zzb.ipfs.filestore.pojo;

import java.io.Serializable;

public class LgAccountManagement implements Serializable {
    private String id;

    private String password;

    private String phone;

    private String eMail;

    private String enterprise;

    private String channel;

    private Integer status;

    private Long currenttime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail == null ? null : eMail.trim();
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise == null ? null : enterprise.trim();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCurrenttime() {
        return currenttime;
    }

    public void setCurrenttime(Long currenttime) {
        this.currenttime = currenttime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", password=").append(password);
        sb.append(", phone=").append(phone);
        sb.append(", eMail=").append(eMail);
        sb.append(", enterprise=").append(enterprise);
        sb.append(", channel=").append(channel);
        sb.append(", status=").append(status);
        sb.append(", currenttime=").append(currenttime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}