package com.zzb.ipfs.filestore.pojo.dto;

import java.io.Serializable;

public class LgAccountManagementDto implements Serializable {

    private String id;

    private String password;

    private String phone;

    private String enterprise;

    private String eMail;

    @Override
    public String toString() {
        return "LgAccountManagementDto{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", phone=" + phone +
                ", eMail='" + eMail + '\'' +
                ", enterprise='" + enterprise + '\'' +
                '}';
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }

}
