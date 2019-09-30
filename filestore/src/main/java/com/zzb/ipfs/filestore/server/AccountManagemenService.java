package com.zzb.ipfs.filestore.server;

import com.zzb.ipfs.filestore.dao.LgAccountKeyMapper;
import com.zzb.ipfs.filestore.dao.LgAccountManagementMapper;
import com.zzb.ipfs.filestore.impserver.AccountManagemenimp;
import com.zzb.ipfs.filestore.pojo.LgAccountKey;
import com.zzb.ipfs.filestore.pojo.LgAccountKeyExample;
import com.zzb.ipfs.filestore.pojo.LgAccountManagement;
import com.zzb.ipfs.filestore.pojo.LgAccountManagementExample;
import com.zzb.ipfs.filestore.pojo.dto.LgAccountDto;
import com.zzb.ipfs.filestore.pojo.dto.LgAccountKeyDto;
import com.zzb.ipfs.filestore.pojo.dto.LgAccountManagementDto;
import com.zzb.ipfs.filestore.utils.DateUtils;
import com.zzb.ipfs.filestore.utils.PkUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AccountManagemenService implements AccountManagemenimp {

    @Autowired
    LgAccountManagementMapper managementMapper;
    @Autowired
    LgAccountKeyMapper keyMapper;

    /***
     * “账户管理”功能------创建用户
     * @param dto
     * @return
     */
    @Override
    public String addAccountManagemen(LgAccountManagementDto dto) {
        try {
            LgAccountManagement lgAccountManagement = new LgAccountManagement();
            //id（账户ID）
            lgAccountManagement.setId(dto.getId());
            //渠道-----暂时不写（不清楚数据怎么拿）
            lgAccountManagement.setChannel(null);
            //开户时间
            lgAccountManagement.setCurrenttime(System.currentTimeMillis());
            //联系邮箱
            lgAccountManagement.seteMail(dto.geteMail());
            //企业名称
            lgAccountManagement.setEnterprise(dto.getEnterprise());
            //账户密码
            lgAccountManagement.setPassword(dto.getPassword());
            //联系电话
            lgAccountManagement.setPhone(dto.getPhone());
            //账户状态(0---启用   1---禁用)  默认刚创建的账户为启动状态
            lgAccountManagement.setStatus(0);
            managementMapper.insertSelective(lgAccountManagement);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "error";
    }

    /***
     * 账户管理首页（根据手机号，企业名称，渠道来进行查询操作）
     * @param dto
     * @return
     */
    @Override
    public List<LgAccountManagement> selectLgAccountManagement(LgAccountDto dto) {
        if (dto != null) {
            LgAccountManagementExample lgAccountManagementExample = new LgAccountManagementExample();
            LgAccountManagementExample.Criteria criteria = lgAccountManagementExample.createCriteria();
            if(dto.getEnterprise() != null){
                criteria.andEnterpriseEqualTo(dto.getEnterprise() );
            }
            if(dto.getChannel() != null){
                criteria.andChannelEqualTo(dto.getChannel());
            }
            if(dto.getPhone() != null){
                criteria.andPhoneEqualTo(dto.getPhone());
            }
            List<LgAccountManagement> lgAccountManagements = managementMapper.selectByExample(lgAccountManagementExample);
            for(LgAccountManagement lg:lgAccountManagements){
                Long currenttime = lg.getCurrenttime();
                String s = DateUtils.longToDate(currenttime);
                System.out.println(s);
            }
            return lgAccountManagements;
        }else {
            List<LgAccountManagement> lgAccountManagements = managementMapper.selectByExample(null);
            return lgAccountManagements;
        }
    }

    /***
     * 修改账号状态（禁用？启用）
     * @param id
     * @return
     */
    @Override
    public String changeStatus(String id) {
        try {
            LgAccountManagement lgAccountManagement = managementMapper.selectByPrimaryKey(id);
            //账户状态(0---启用   1---禁用)
            Integer status = lgAccountManagement.getStatus();
            if(status == 1){
                lgAccountManagement.setStatus(0);
                LgAccountKeyExample lgAccountKeyExample = new LgAccountKeyExample();
                LgAccountKeyExample.Criteria criteria = lgAccountKeyExample.createCriteria();
                criteria.andAidEqualTo(id);
                List<LgAccountKey> lgAccountKeys = keyMapper.selectByExample(lgAccountKeyExample);
                for(LgAccountKey key:lgAccountKeys){
                    key.setStatus(0);
                    keyMapper.updateByPrimaryKey(key);
                }
            }else if(status == 0){
                lgAccountManagement.setStatus(1);
                LgAccountKeyExample lgAccountKeyExample = new LgAccountKeyExample();
                LgAccountKeyExample.Criteria criteria = lgAccountKeyExample.createCriteria();
                criteria.andAidEqualTo(id);
                List<LgAccountKey> lgAccountKeys = keyMapper.selectByExample(lgAccountKeyExample);
                for(LgAccountKey key:lgAccountKeys){
                    key.setStatus(1);
                    keyMapper.updateByPrimaryKey(key);
                }
            }
            int i = managementMapper.updateByPrimaryKey(lgAccountManagement);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "error";
    }

    /***
     * 创建密钥
     * @return
     */
    @Override
    public String createkey(LgAccountKeyDto key) {
        try {
            LgAccountKey lgAccountKey = new LgAccountKey();
            //主键
            lgAccountKey.setId(PkUtils.getPrimaryKey());
            //外键（账户ID【应用名称】）
            lgAccountKey.setAid(key.getAid());
            //密钥的ID
            lgAccountKey.setSecretid(key.getSecretid());
            //密钥的Key
            lgAccountKey.setSecretkey(key.getSecretkey());
            //密钥状态(0---启用   1---禁用) 默认创建的时候为启用状态
            lgAccountKey.setStatus(0);
            //创建时间
            lgAccountKey.setCurrenttime(System.currentTimeMillis());
            //应用名称
            lgAccountKey.setUsername(key.getUsername());
            //密钥状态（0--未删除，1--删除）
            lgAccountKey.setDelKey(0);
            keyMapper.insert(lgAccountKey);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "error";
    }

    /***
     * 查看密钥
     * @param id
     * @return
     */
    @Override
    public List<LgAccountKey> selectLgAccountKey(String id) {
        LgAccountKeyExample lgAccountKeyExample = new LgAccountKeyExample();
        LgAccountKeyExample.Criteria criteria = lgAccountKeyExample.createCriteria();
        List<LgAccountKey> lgAccountKeys = null;
        if (id != null) {
            criteria.andAidEqualTo(id);
            criteria.andDelKeyEqualTo(0);
            lgAccountKeys = keyMapper.selectByExample(lgAccountKeyExample);
        }
        return lgAccountKeys;
    }
}
