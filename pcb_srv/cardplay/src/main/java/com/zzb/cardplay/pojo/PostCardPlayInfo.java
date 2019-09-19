package com.zzb.cardplay.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 主动出牌上报信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostCardPlayInfo {
    //当前动作 0->坐下，1->拿到牌，2->抢地主，3->加倍，4->出牌，5->展示结果
    private String action;
    //房间ID
    private ServerInfo server;
    //底牌
    private String blind_cards;
    //当前牌局玩家编号
    private String chair_id;
    //出牌信息
    private String play_cards;
    //原始牌
    private String orig_cards;
    //玩家信息
    private List<PlayerInfo> player;
    //地主编号
    private String lord_chair_id;
    //主动出牌
    private String active_play;
    //上一次出牌的玩家
    private String last_play_id;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ServerInfo getServer() {
        return server;
    }

    public void setServer(ServerInfo server) {
        this.server = server;
    }

    public String getBlind_cards() {
        return blind_cards;
    }

    public void setBlind_cards(String blind_cards) {
        this.blind_cards = blind_cards;
    }

    public String getChair_id() {
        return chair_id;
    }

    public void setChair_id(String chair_id) {
        this.chair_id = chair_id;
    }

    public String getPlay_cards() {
        return play_cards;
    }

    public void setPlay_cards(String play_cards) {
        this.play_cards = play_cards;
    }

    public String getOrig_cards() {
        return orig_cards;
    }

    public void setOrig_cards(String orig_cards) {
        this.orig_cards = orig_cards;
    }

    public List<PlayerInfo> getPlayer() {
        return player;
    }

    public void setPlayer(List<PlayerInfo> player) {
        this.player = player;
    }

    public String getLord_chair_id() {
        return lord_chair_id;
    }

    public void setLord_chair_id(String lord_chair_id) {
        this.lord_chair_id = lord_chair_id;
    }

    public String getActive_play() {
        return active_play;
    }

    public void setActive_play(String active_play) {
        this.active_play = active_play;
    }

    public String getLast_play_id() {
        return last_play_id;
    }

    public void setLast_play_id(String last_play_id) {
        this.last_play_id = last_play_id;
    }
}
