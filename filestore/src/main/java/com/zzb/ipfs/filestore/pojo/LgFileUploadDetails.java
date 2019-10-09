package com.zzb.ipfs.filestore.pojo;

import java.io.Serializable;
import java.util.Date;

public class LgFileUploadDetails implements Serializable {
    private Integer id;

    private String filename;

    private Integer filesize;

    private Integer uploadtraffic;

    private Date timebigen;

    private Date timaupdate;

    private String download;

    private String downloaduser;

    private String downloadregion;

    private Integer uploadspeed;

    private Integer downloadspeed;

    private String devsn;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public Integer getFilesize() {
        return filesize;
    }

    public void setFilesize(Integer filesize) {
        this.filesize = filesize;
    }

    public Integer getUploadtraffic() {
        return uploadtraffic;
    }

    public void setUploadtraffic(Integer uploadtraffic) {
        this.uploadtraffic = uploadtraffic;
    }

    public Date getTimebigen() {
        return timebigen;
    }

    public void setTimebigen(Date timebigen) {
        this.timebigen = timebigen;
    }

    public Date getTimaupdate() {
        return timaupdate;
    }

    public void setTimaupdate(Date timaupdate) {
        this.timaupdate = timaupdate;
    }

    public String getDownload() {
        return download;
    }

    public void setDownload(String download) {
        this.download = download == null ? null : download.trim();
    }

    public String getDownloaduser() {
        return downloaduser;
    }

    public void setDownloaduser(String downloaduser) {
        this.downloaduser = downloaduser == null ? null : downloaduser.trim();
    }

    public String getDownloadregion() {
        return downloadregion;
    }

    public void setDownloadregion(String downloadregion) {
        this.downloadregion = downloadregion == null ? null : downloadregion.trim();
    }

    public Integer getUploadspeed() {
        return uploadspeed;
    }

    public void setUploadspeed(Integer uploadspeed) {
        this.uploadspeed = uploadspeed;
    }

    public Integer getDownloadspeed() {
        return downloadspeed;
    }

    public void setDownloadspeed(Integer downloadspeed) {
        this.downloadspeed = downloadspeed;
    }

    public String getDevsn() {
        return devsn;
    }

    public void setDevsn(String devsn) {
        this.devsn = devsn == null ? null : devsn.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", filename=").append(filename);
        sb.append(", filesize=").append(filesize);
        sb.append(", uploadtraffic=").append(uploadtraffic);
        sb.append(", timebigen=").append(timebigen);
        sb.append(", timaupdate=").append(timaupdate);
        sb.append(", download=").append(download);
        sb.append(", downloaduser=").append(downloaduser);
        sb.append(", downloadregion=").append(downloadregion);
        sb.append(", uploadspeed=").append(uploadspeed);
        sb.append(", downloadspeed=").append(downloadspeed);
        sb.append(", devsn=").append(devsn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}