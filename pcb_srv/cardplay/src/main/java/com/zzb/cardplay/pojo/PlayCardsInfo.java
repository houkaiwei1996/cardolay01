package com.zzb.cardplay.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "play_cards_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayCardsInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "uid")
    private String uid;

    @Column(name = "chair_id")
    private String chairId;

    @Column(name = "lord_chair_id")
    private String lordChairId;

    @Column(name = "role")
    private String role;

    @Column(name = "play_cards")
    private String playCards;

    @Column(name = "end_time")
    private String endTime;

    @Column(name = "orig_cards")
    private String origCards;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getChairId() {
        return chairId;
    }

    public void setChairId(String chairId) {
        this.chairId = chairId;
    }

    public String getLordChairId() {
        return lordChairId;
    }

    public void setLordChairId(String lordChairId) {
        this.lordChairId = lordChairId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPlayCards() {
        return playCards;
    }

    public void setPlayCards(String playCards) {
        this.playCards = playCards;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getOrigCards() {
        return origCards;
    }

    public void setOrigCards(String origCards) {
        this.origCards = origCards;
    }
}
