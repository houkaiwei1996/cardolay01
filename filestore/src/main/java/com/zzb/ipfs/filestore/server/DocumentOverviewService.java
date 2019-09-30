package com.zzb.ipfs.filestore.server;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zzb.ipfs.filestore.dao.LgDocumentOverviewMapper;
import com.zzb.ipfs.filestore.impserver.DocumentOverviewServiceimp;
import com.zzb.ipfs.filestore.pojo.LgDocumentOverview;
import com.zzb.ipfs.filestore.pojo.LgDocumentOverviewExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentOverviewService implements DocumentOverviewServiceimp {

    @Autowired
    LgDocumentOverviewMapper mapper;

    /***
     * 文件名称：支持模糊查询，不填则无此条件
     * 渠道：支持模糊查询，不填则无此条件
     * 无查询条件点击搜索为全查
     * @return
     */
    @Override
    public List<LgDocumentOverview> selDocumentOverview(String devName, String channel, Integer currPage, Integer pageSize) {
        Page<Object> objects = PageHelper.startPage(currPage, pageSize);

        LgDocumentOverviewExample lgDocumentOverviewExample = new LgDocumentOverviewExample();
        LgDocumentOverviewExample.Criteria criteria = lgDocumentOverviewExample.createCriteria();
        if(devName == null && channel == null){
            List<LgDocumentOverview> lgDocumentOverviews = mapper.selectByExample(null);
            return lgDocumentOverviews;
        }else {
            if (devName != null){
                criteria.andDevNameLike("%"+devName+"%");
            }
            if (channel != null){
                criteria.andChannelLike("%"+channel+"%");
            }
            List<LgDocumentOverview> lgDocumentOverviews = mapper.selectByExample(lgDocumentOverviewExample);
            return lgDocumentOverviews;
        }
    }
}
