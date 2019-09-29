package com.zzb.ipfs.filestore.web;

import com.zzb.ipfs.filestore.impserver.AccountManagemenimp;
import com.zzb.ipfs.filestore.pojo.LgAccountKey;
import com.zzb.ipfs.filestore.pojo.LgAccountManagement;
import com.zzb.ipfs.filestore.pojo.dto.LgAccountDto;
import com.zzb.ipfs.filestore.pojo.dto.LgAccountKeyDto;
import com.zzb.ipfs.filestore.pojo.dto.LgAccountManagementDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountManagemenWeb {

    @Autowired
    AccountManagemenimp managemenimp;
    /***
     * “账户管理”功能------创建用户
     * @param dto
     * @return
     */
    @ResponseBody
    @GetMapping("/addAccountManagemen")
    public String addAccountManagemen(LgAccountManagementDto dto) {
        return managemenimp.addAccountManagemen(dto);
    }

    /***
     * 账户管理首页（根据手机号，企业名称，渠道来进行查询操作）
     * @param dto
     * @return
     */
    @ResponseBody
    @GetMapping("/selectLgAccountManagement")
    public List<LgAccountManagement> selectLgAccountManagement(LgAccountDto dto) {
        return managemenimp.selectLgAccountManagement(dto);
    }

    /***
     * 修改账号状态（禁用？启用）
     * @param id
     * @return
     */
    @ResponseBody
    @GetMapping("/changeStatus")
    public String changeStatus(String id) {
        return managemenimp.changeStatus(id);
    }
    /***
     * 创建密钥
     * @return
     */
    @ResponseBody
    @GetMapping("/createkey")
    public String createkey(LgAccountKeyDto key) {
        return managemenimp.createkey(key);
    }

    /***
     * 查看密钥
     * @param id
     * @return
     */
    @ResponseBody
    @GetMapping("/selectLgAccountKey")
    public List<LgAccountKey> selectLgAccountKey(String id) {
        return managemenimp.selectLgAccountKey(id);
    }

}
