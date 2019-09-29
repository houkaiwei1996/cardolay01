package com.zzb.ipfs.filestore.pojo.capacity;

import java.io.Serializable;
import java.util.List;

//容量2级数据节点
public class SecondLevel implements Serializable {

    private Integer timestamp;
    private Integer filecnt;
    private List<ThreeLevel> filelist;

    @Override
    public String toString() {
        return "SecondLevel{" +
                "timestamp=" + timestamp +
                ", filecnt=" + filecnt +
                ", filelist=" + filelist +
                '}';
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getFilecnt() {
        return filecnt;
    }

    public void setFilecnt(Integer filecnt) {
        this.filecnt = filecnt;
    }

    public List<ThreeLevel> getFilelist() {
        return filelist;
    }

    public void setFilelist(List<ThreeLevel> filelist) {
        this.filelist = filelist;
    }

}
