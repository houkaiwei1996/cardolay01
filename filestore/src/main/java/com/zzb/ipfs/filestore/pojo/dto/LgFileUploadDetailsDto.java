package com.zzb.ipfs.filestore.pojo.dto;

import java.io.Serializable;
import java.util.Date;

public class LgFileUploadDetailsDto implements Serializable {

    private String filename;

    private String devsn;

    private String download;

    private String downloadregion;

    @Override
    public String toString() {
        return "LgFileUploadDetailsDto{" +
                "filename='" + filename + '\'' +
                ", devsn='" + devsn + '\'' +
                ", download='" + download + '\'' +
                ", downloadregion='" + downloadregion + '\'' +
                ", timebigen=" + timebigen +
                ", timaupdate=" + timaupdate +
                '}';
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getDevsn() {
        return devsn;
    }

    public void setDevsn(String devsn) {
        this.devsn = devsn;
    }

    public Long getTimebigen() {
        return timebigen;
    }

    public void setTimebigen(Long timebigen) {
        this.timebigen = timebigen;
    }

    public Long getTimaupdate() {
        return timaupdate;
    }

    public void setTimaupdate(Long timaupdate) {
        this.timaupdate = timaupdate;
    }

    public String getDownload() {
        return download;
    }

    public void setDownload(String download) {
        this.download = download;
    }

    public String getDownloadregion() {
        return downloadregion;
    }

    public void setDownloadregion(String downloadregion) {
        this.downloadregion = downloadregion;
    }



    private Long timebigen;

    private Long timaupdate;
}
