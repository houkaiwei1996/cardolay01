package com.zzb.ipfs.filestore.server;

import com.zzb.ipfs.filestore.dao.LgSnHeatMapper;
import com.zzb.ipfs.filestore.impserver.ChannelStatisticsServiceimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChannelStatisticsService implements ChannelStatisticsServiceimp {

    @Autowired
    LgSnHeatMapper mapper;
}
