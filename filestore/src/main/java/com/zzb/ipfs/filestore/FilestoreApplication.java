package com.zzb.ipfs.filestore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zzb.ipfs.filestore.dao")
public class FilestoreApplication {

    public static void main(String[] args) {

        SpringApplication.run(FilestoreApplication.class, args);


    }
}
