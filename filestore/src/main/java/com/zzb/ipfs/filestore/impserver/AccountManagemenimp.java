package com.zzb.ipfs.filestore.impserver;

import com.zzb.ipfs.filestore.pojo.LgAccountKey;
import com.zzb.ipfs.filestore.pojo.LgAccountManagement;
import com.zzb.ipfs.filestore.pojo.dto.LgAccountDto;
import com.zzb.ipfs.filestore.pojo.dto.LgAccountKeyDto;
import com.zzb.ipfs.filestore.pojo.dto.LgAccountManagementDto;

import java.util.List;

public interface AccountManagemenimp {

    /***
     * “账户管理”功能------创建用户
     * @param dto
     * @return
     */
    String addAccountManagemen(LgAccountManagementDto dto);

    /***
     * 账户管理首页（根据手机号，企业名称，渠道来进行查询操作）
     * @param dto
     * @return
     */
    List<LgAccountManagement> selectLgAccountManagement(LgAccountDto dto);

    /***
     * 修改账号状态（禁用？启用）
     * @param id
     * @return
     */
    String changeStatus(String id);

    /***
     * 创建密钥
     * @return
     */
    String createkey(LgAccountKeyDto key);

    /***
     * 查看密钥
     * @param id
     * @return
     */
    List<LgAccountKey> selectLgAccountKey(String id);
}
