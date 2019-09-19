package com.zzb.cardplay.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServerInfo {
    //房间ID
    private String  id;
    //房间名称
    private String ip;
    //房间IP
    private String  name;
    //房间端口
    private String  port;
}
