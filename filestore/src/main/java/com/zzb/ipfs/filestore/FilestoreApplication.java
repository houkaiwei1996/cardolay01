package com.zzb.ipfs.filestore;


import com.zzb.ipfs.filestore.utils.IPFSLogProcedure;
import com.zzb.ipfs.filestore.utils.LogDataQueue;
import com.zzb.ipfs.lib_netty_sdk.service.LogReportCallback;
import com.zzb.ipfs.lib_netty_sdk.service.TcpSdk;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@SpringBootApplication
@MapperScan("com.zzb.ipfs.filestore.dao")
public class FilestoreApplication {

    public static void main(String[] args) {

        SpringApplication.run(FilestoreApplication.class, args);


    }
}
