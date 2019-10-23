package com.zzb.ipfs.filestore.web;

import com.zzb.ipfs.filestore.impserver.UploadingServiceimp;
import com.zzb.ipfs.filestore.pojo.LgFileUploadDetails;
import com.zzb.ipfs.filestore.pojo.MongoPojo;
import com.zzb.ipfs.filestore.pojo.dto.LgFileUploadDetailsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UploadingWeb {

    @Autowired
    UploadingServiceimp uploadingServiceimp;
    @Autowired
    MongoTemplate mongoTemplate;

    /***
     * 测试
     */
    @GetMapping("/selectLgFileUploadDetails")
    List<LgFileUploadDetails> selectLgFileUploadDetails(){
        return uploadingServiceimp.selectLgFileUploadDetails();
    }

    /***
     * 测试：mongodb----添加数据
     * @return
     */
    @GetMapping("/addmongodb")
    public String addmongodb(MongoPojo mongoPojo){
        mongoPojo.setName("人渣");
        mongoPojo.setSex("那");
        mongoPojo.setAhe(22);
        mongoTemplate.save(mongoPojo);
        return "success";
    }

    /***
     * 测试：mongodb----查询数据
     * @return
     */
    @GetMapping("/selectmongodb")
    public List<MongoPojo> selectmongodb(){
        List<MongoPojo> all = mongoTemplate.findAll(MongoPojo.class);
        return all;
    }

    /***
     * 测试：mongodb----根据ID来查询数据
     * @return
     */
    @GetMapping("/selectmongodbbyid")
    public MongoPojo selectmongodbbyid(){
        MongoPojo byId = mongoTemplate.findById("5dafc3bd6dbade1ef870fe00", MongoPojo.class);
        return byId;
    }



    /***
     * 测试：mongodb----修改数据
     * @return
     */
    @GetMapping("/updatamongodb")
    public String updatamongodb(){
        Query query = new Query();
        query.addCriteria(Criteria.where("5dafc3bd6dbade1ef870fe00").is("人渣"));
        MongoPojo mongoPojo = new MongoPojo();
        mongoPojo.setName("人渣侯凯威");
        mongoPojo.setAhe(22);
        mongoPojo.setSex("男");
        mongoTemplate.update(MongoPojo.class);
        return "success";
    }
    /***
     * 测试：mongodb----修改数据
     * @return
     */
    @GetMapping("/deletemongodb")
    public String deletemongodb(){
        mongoTemplate.remove(MongoPojo.class);
        return "success";
    }


    /***
     * 查询条件：
     * 文件名称：支持模糊查询，不填则无此条件
     * 设备 SN：支持模糊查询，不填则无此条件
     * 渠道：支持模糊查询，不填则无此条件
     * 地区：点击为省市选项组，不填则无此条件
     * 时间区间：上传时间区间，需校验开始值小于等于结束值，不填则无此条件
     * 无查询条件点击搜索为全查
     * Integer currPage, Integer pageSize
     * 实现mybatis的分页效果
     * @return
     */
    @ResponseBody
    @GetMapping("/selectLguploadlist")
    List<LgFileUploadDetails> selectLguploadlist(LgFileUploadDetailsDto dto,Integer currPage, Integer pageSize) {
        return uploadingServiceimp.selectLguploadlist(dto,currPage,pageSize);
    }
}
