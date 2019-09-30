package com.zzb.ipfs.filestore.server;

import com.zzb.ipfs.filestore.dao.LgAccountKeyMapper;
import com.zzb.ipfs.filestore.impserver.KeyManageimp;
import com.zzb.ipfs.filestore.pojo.LgAccountKey;
import com.zzb.ipfs.filestore.pojo.LgAccountKeyExample;
import com.zzb.ipfs.filestore.pojo.dto.KeyDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeyManageService implements KeyManageimp {

    @Autowired
    LgAccountKeyMapper keyMapper;

    /***
     * 查询方式：所有查询条件为空，则代表该维度全查，所有查询条件均支持模糊查询。
     * @return
     */
    @Override
    public List<LgAccountKey> lgAccountKeylist(KeyDto dto) {
        if(dto.getAid() == null && dto.getSecretid() == null && dto.getUsername() == null){
            LgAccountKeyExample lgAccountKeyExample = new LgAccountKeyExample();
            LgAccountKeyExample.Criteria criteria = lgAccountKeyExample.createCriteria();
            criteria.andDelKeyEqualTo(0);
            List<LgAccountKey> lgAccountKeys = keyMapper.selectByExample(lgAccountKeyExample);
            return lgAccountKeys;
        }else {
            LgAccountKeyExample lgAccountKeyExample = new LgAccountKeyExample();
            LgAccountKeyExample.Criteria criteria = lgAccountKeyExample.createCriteria();
            criteria.andDelKeyEqualTo(0);
            if(dto.getAid() != null){
                criteria.andAidLike("%"+dto.getAid()+"%");
            }
            if(dto.getUsername() != null){
                criteria.andUsernameLike("%"+dto.getUsername()+"%");
            }
            if(dto.getSecretid() != null){
                criteria.andSecretidLike("%"+dto.getSecretid()+"%");
            }
            List<LgAccountKey> lgAccountKeys = keyMapper.selectByExample(lgAccountKeyExample);
            return lgAccountKeys;
        }
    }

    /***
     * 密钥管理功能-----状态【启用】【禁用】
     * @return
     */
    @Override
    public String updataStatus(String aid) {
        try {
            LgAccountKey key = keyMapper.selectByPrimaryKey(aid);
            //密钥状态(0---启用   1---禁用) 默认创建的时候为启用状态
            if(key.getStatus() == 1){
                key.setStatus(0);
            }else if(key.getStatus() == 0){
                key.setStatus(1);
            }
            keyMapper.updateByPrimaryKey(key);
            return "success";
        } catch (Exception e) {
            return "erroe";
        }
    }

    /***
     * 删除密钥（该状态）
     * @param id
     * @return
     */
    @Override
    public String delkey(String id) {
        try {
            LgAccountKey key = keyMapper.selectByPrimaryKey(id);
            key.setDelKey(1);
            keyMapper.updateByPrimaryKey(key);
            return "删除成功";
        } catch (Exception e) {
            return "删除失败";
        }
    }
}
