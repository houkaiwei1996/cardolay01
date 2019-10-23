package com.zzb.ipfs.filestore.server;

import com.zzb.ipfs.filestore.utils.IPFSLogProcedure;
import com.zzb.ipfs.filestore.utils.LogDataQueue;
import com.zzb.ipfs.lib_netty_sdk.service.TcpSdk;
import org.springframework.beans.BeansException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunnerImpl implements ApplicationRunner,ApplicationContextAware {

    private ApplicationContext context;
    private LogDataQueue logDataQueue = null;
    @Override
    public void run(ApplicationArguments args) throws Exception {

//        for(String name:context.getBeanDefinitionNames()){
//            System.out.println(name);
//        };
        logDataQueue = (LogDataQueue)context.getBean("logDataQueue");

        TcpSdk.sdk.initSdk();
        TcpSdk.sdk.connect2Switch("10.0.0.73",2468,(short)110,(short)8802,0);
        TcpSdk.sdk.setLogReportCallback(new IPFSLogProcedure(logDataQueue));
        TcpSdk.sdk.startLogReportWorker();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }
}