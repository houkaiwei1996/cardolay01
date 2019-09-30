package com.zzb.ipfs.filestore.pojo.flowdata;


import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

//流量1级数据节点
public class Stair implements Serializable {

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDev_sn() {
        return dev_sn;
    }

    public void setDev_sn(String dev_sn) {
        this.dev_sn = dev_sn;
    }

    public String getPtfs_id() {
        return ptfs_id;
    }

    public void setPtfs_id(String ptfs_id) {
        this.ptfs_id = ptfs_id;
    }

    public Integer getPtfs_type() {
        return ptfs_type;
    }

    public void setPtfs_type(Integer ptfs_type) {
        this.ptfs_type = ptfs_type;
    }

    public String getDev_ip() {
        return dev_ip;
    }

    public void setDev_ip(String dev_ip) {
        this.dev_ip = dev_ip;
    }

    public Integer getLog_seqno() {
        return log_seqno;
    }

    public void setLog_seqno(Integer log_seqno) {
        this.log_seqno = log_seqno;
    }

    public String getRecord_id() {
        return record_id;
    }

    public void setRecord_id(String record_id) {
        this.record_id = record_id;
    }

    public Integer getSub_pkg_cnt() {
        return sub_pkg_cnt;
    }

    public void setSub_pkg_cnt(Integer sub_pkg_cnt) {
        this.sub_pkg_cnt = sub_pkg_cnt;
    }

    public StairTwo getData() {
        StairTwo stairTwo = gson.fromJson(data, StairTwo.class);
        return stairTwo;
    }

    public void setData(String data) {
        this.data = data;
    }

    private String token;
    private String proxy_dev_sn;
    private Integer type;
    private String dev_sn;
    private String ptfs_id;
    private Integer ptfs_type;
    private String dev_ip;
    private Integer log_seqno;
    private String record_id;
    private Integer sub_pkg_cnt;

    private Gson gson = new Gson();

    @Override
    public String toString() {
        return "Stair{" +
                "token='" + token + '\'' +
                ", proxy_dev_sn='" + proxy_dev_sn + '\'' +
                ", type=" + type +
                ", dev_sn='" + dev_sn + '\'' +
                ", ptfs_id='" + ptfs_id + '\'' +
                ", ptfs_type=" + ptfs_type +
                ", dev_ip='" + dev_ip + '\'' +
                ", log_seqno=" + log_seqno +
                ", record_id='" + record_id + '\'' +
                ", sub_pkg_cnt=" + sub_pkg_cnt +
                ", data_ex=" + data_ex +
                ", data=" + data +
                '}';
    }

    public String getProxy_dev_sn() {
        return proxy_dev_sn;
    }

    public void setProxy_dev_sn(String proxy_dev_sn) {
        this.proxy_dev_sn = proxy_dev_sn;
    }

    public Stairfive getData_ex() {
        Stairfive stairfive = gson.fromJson(data_ex, Stairfive.class);
        return stairfive;
    }

    public void setData_ex(String data_ex) {
        this.data_ex = data_ex;
    }

    private String data_ex;
    private String data;
}
