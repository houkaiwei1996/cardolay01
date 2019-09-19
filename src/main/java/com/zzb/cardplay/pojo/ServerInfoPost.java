package com.zzb.cardplay.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServerInfoPost {
    //房间ID
    private String serverId;
    //房间名称
    private String serverName;
    //房间IP
    private String serverIp;
    //房间端口
    private String serverPort;
    //在线人数
    private int onLineCnt;
    //最低进入分数
    private int minEnterScore;
    //最高进入分数
    private int maxEnterScore;
    //最大连接数
    private int maxConnectCnt;
    //更新时间
    private String updateTime;

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public String getServerPort() {
        return serverPort;
    }

    public void setServerPort(String serverPort) {
        this.serverPort = serverPort;
    }

    public int getOnLineCnt() {
        return onLineCnt;
    }

    public void setOnLineCnt(int onLineCnt) {
        this.onLineCnt = onLineCnt;
    }

    public int getMinEnterScore() {
        return minEnterScore;
    }

    public void setMinEnterScore(int minEnterScore) {
        this.minEnterScore = minEnterScore;
    }

    public int getMaxEnterScore() {
        return maxEnterScore;
    }

    public void setMaxEnterScore(int maxEnterScore) {
        this.maxEnterScore = maxEnterScore;
    }

    public int getMaxConnectCnt() {
        return maxConnectCnt;
    }

    public void setMaxConnectCnt(int maxConnectCnt) {
        this.maxConnectCnt = maxConnectCnt;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
