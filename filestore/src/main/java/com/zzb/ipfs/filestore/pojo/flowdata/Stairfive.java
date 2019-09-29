package com.zzb.ipfs.filestore.pojo.flowdata;

import java.io.Serializable;

public class Stairfive implements Serializable {

    private String up_bw;
    private String down_bw;

    @Override
    public String toString() {
        return "Stairfive{" +
                "up_bw=" + up_bw +
                ", down_bw=" + down_bw +
                '}';
    }

    public String getUp_bw() {
        return up_bw;
    }

    public void setUp_bw(String up_bw) {
        this.up_bw = up_bw;
    }

    public String getDown_bw() {
        return down_bw;
    }

    public void setDown_bw(String down_bw) {
        this.down_bw = down_bw;
    }
}
