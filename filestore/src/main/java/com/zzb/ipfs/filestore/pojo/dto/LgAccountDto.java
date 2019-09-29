package com.zzb.ipfs.filestore.pojo.dto;

import java.io.Serializable;

public class LgAccountDto implements Serializable {

    private String enterprise;

    private String phone;

    private String channel;

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "LgAccountDto{" +
                "enterprise='" + enterprise + '\'' +
                ", phone='" + phone + '\'' +
                ", channel='" + channel + '\'' +
                '}';
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}
