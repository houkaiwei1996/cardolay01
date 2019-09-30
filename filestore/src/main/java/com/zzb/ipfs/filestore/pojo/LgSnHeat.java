package com.zzb.ipfs.filestore.pojo;

import java.io.Serializable;

public class LgSnHeat implements Serializable {
    private String id;

    private String region;

    private Integer equipmentSets;

    private String equipmentSn;

    private Integer uploadingtime;

    private Integer uploading;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public Integer getEquipmentSets() {
        return equipmentSets;
    }

    public void setEquipmentSets(Integer equipmentSets) {
        this.equipmentSets = equipmentSets;
    }

    public String getEquipmentSn() {
        return equipmentSn;
    }

    public void setEquipmentSn(String equipmentSn) {
        this.equipmentSn = equipmentSn == null ? null : equipmentSn.trim();
    }

    public Integer getUploadingtime() {
        return uploadingtime;
    }

    public void setUploadingtime(Integer uploadingtime) {
        this.uploadingtime = uploadingtime;
    }

    public Integer getUploading() {
        return uploading;
    }

    public void setUploading(Integer uploading) {
        this.uploading = uploading;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", region=").append(region);
        sb.append(", equipmentSets=").append(equipmentSets);
        sb.append(", equipmentSn=").append(equipmentSn);
        sb.append(", uploadingtime=").append(uploadingtime);
        sb.append(", uploading=").append(uploading);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}