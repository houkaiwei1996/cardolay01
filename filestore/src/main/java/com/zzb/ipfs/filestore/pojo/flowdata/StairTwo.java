package com.zzb.ipfs.filestore.pojo.flowdata;

import com.zzb.ipfs.filestore.pojo.capacity.ThreeLevel;

import java.io.Serializable;
import java.util.List;

//流量2级数据节点
public class StairTwo implements Serializable {

    private Integer timestamp;
    private Integer filecnt;
    private List<StairThree> filelist;
    private Integer totalstreamsize;
    private Integer spreadtotalstreamsize;
    private Integer totalusercount;
    private Stairsix totaluserlist;

    @Override
    public String toString() {
        return "StairTwo{" +
                "timestamp=" + timestamp +
                ", filecnt=" + filecnt +
                ", filelist=" + filelist +
                ", totalstreamsize=" + totalstreamsize +
                ", spreadtotalstreamsize=" + spreadtotalstreamsize +
                ", totalusercount=" + totalusercount +
                ", totaluserlist=" + totaluserlist +
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

    public List<StairThree> getFilelist() {
        return filelist;
    }

    public void setFilelist(List<StairThree> filelist) {
        this.filelist = filelist;
    }

    public Integer getTotalstreamsize() {
        return totalstreamsize;
    }

    public void setTotalstreamsize(Integer totalstreamsize) {
        this.totalstreamsize = totalstreamsize;
    }

    public Integer getSpreadtotalstreamsize() {
        return spreadtotalstreamsize;
    }

    public void setSpreadtotalstreamsize(Integer spreadtotalstreamsize) {
        this.spreadtotalstreamsize = spreadtotalstreamsize;
    }

    public Integer getTotalusercount() {
        return totalusercount;
    }

    public void setTotalusercount(Integer totalusercount) {
        this.totalusercount = totalusercount;
    }

    public Stairsix getTotaluserlist() {
        return totaluserlist;
    }

    public void setTotaluserlist(Stairsix totaluserlist) {
        this.totaluserlist = totaluserlist;
    }
}
