package com.zzb.cardplay.pojo;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "player_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "uid")
    private String uid;

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "ip_zone")
    private String ip_zone;

    @Column(name = "level")
    private String level;

    @Column(name = "nick_name")
    private String nick_name;

    @Column(name = "score")
    private String score;

    @Column(name = "status")
    private String status;

    @Column(name = "vip_level")
    private String vip_level;

    @Column(name = "password")
    private String password;

    @Column(name = "last_connect_ip")
    private String last_conn_ip;

    @Transient
    private String chairid;

    @Transient
    private String multi;

    @Transient
    private String own_cards;

    @Transient
    private String remain_count;

    @Transient
    private String role;

    @Transient
    private String unplayed_cards;

    @Transient
    private String last_play_card;


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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getIp_zone() {
        return ip_zone;
    }

    public void setIp_zone(String ip_zone) {
        this.ip_zone = ip_zone;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVip_level() {
        return vip_level;
    }

    public void setVip_level(String vip_level) {
        this.vip_level = vip_level;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLast_conn_ip() {
        return last_conn_ip;
    }

    public void setLast_conn_ip(String last_conn_ip) {
        this.last_conn_ip = last_conn_ip;
    }

    public String getChairid() {
        return chairid;
    }

    public void setChairid(String chairid) {
        this.chairid = chairid;
    }

    public String getMulti() {
        return multi;
    }

    public void setMulti(String multi) {
        this.multi = multi;
    }

    public String getOwn_cards() {
        return own_cards;
    }

    public void setOwn_cards(String own_cards) {
        this.own_cards = own_cards;
    }

    public String getRemain_count() {
        return remain_count;
    }

    public void setRemain_count(String remain_count) {
        this.remain_count = remain_count;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUnplayed_cards() {
        return unplayed_cards;
    }

    public void setUnplayed_cards(String unplayed_cards) {
        this.unplayed_cards = unplayed_cards;
    }

    public String getLast_play_card() {
        return last_play_card;
    }

    public void setLast_play_card(String last_play_card) {
        this.last_play_card = last_play_card;
    }
}
