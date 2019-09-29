package com.zzb.ipfs.filestore.server;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zzb.ipfs.filestore.dao.LgDataDescriptionMapper;
import com.zzb.ipfs.filestore.dao.LgDeviceReportLogMapper;
import com.zzb.ipfs.filestore.impserver.StorageServiceimp;
import com.zzb.ipfs.filestore.pojo.LgDataDescription;
import com.zzb.ipfs.filestore.pojo.LgDataDescriptionExample;
import com.zzb.ipfs.filestore.pojo.LgFileUploadDetails;
import com.zzb.ipfs.filestore.pojo.dto.IPFSdto;
import com.zzb.ipfs.filestore.utils.DateUtils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;

@Service
public class StorageService implements StorageServiceimp {

    @Autowired
    private LgDeviceReportLogMapper logMapper;

    @Autowired
    private LgDataDescriptionMapper dataDescriptionMapper;


    /**
     * 根据页面传回来的数据进行模糊查询(文件存储明细功能)
     * @param sdto
     * @return
     */
    @Override
    public List<LgDataDescription> selectFsdelist(IPFSdto sdto,Integer currPage, Integer pageSize) {
        Date date = null;
        Date date1 = null;
        //让查询结果呈分页状态呈现
        Page<Object> objects = PageHelper.startPage(currPage, pageSize);

        //查询条件
        LgDataDescriptionExample lgDataDescriptionExample = new LgDataDescriptionExample();
        LgDataDescriptionExample.Criteria criteria = lgDataDescriptionExample.createCriteria();

        //如果当传入的参数为空的时候，实现全表扫描
        if(sdto.getIpfsname() == null && sdto.getTimeCreate() == null && sdto.getTimeUpdate() == null && sdto.getDevSn() == null && sdto.getPtfs_type() == null){
            List<LgDataDescription> lgDataDescriptions = dataDescriptionMapper.selectByExample(null);
            return lgDataDescriptions;
        }else {
            //判断文件名称(支持模糊查询)
            if (sdto.getIpfsname() != null) {
                //有数据
                criteria.andFilenameLike("%"+sdto.getIpfsname()+"%");
            }
            //判断设备SN(支持模糊查询)
            if (sdto.getDevSn() != null) {
                //有数据
                criteria.andDevsnLike("%"+sdto.getDevSn()+"%");
            }
            //存储类型（首次&&备份）
            if(sdto.getPtfs_type() != null){
                criteria.andStorageclassEqualTo(sdto.getPtfs_type().toString());
            }

            //判断时间区间（校验开始值要小于结束值）
            if (sdto.getTimeUpdate() == null && sdto.getTimeCreate() == null) {
                List<LgDataDescription> lgDataDescriptions = dataDescriptionMapper.selectByExample(lgDataDescriptionExample);
                return lgDataDescriptions;
            }else {
                if (!sdto.getTimeUpdate().equals("") || sdto.getTimeUpdate() !=null && !sdto.getTimeCreate().equals("") || sdto.getTimeCreate() !=null) {
                    String s1 = DateUtils.longToDate(sdto.getTimeCreate());
                    String s2 = DateUtils.longToDate(sdto.getTimeUpdate());
                    try {
                        date = DateUtils.stringToDate1(s1);
                        date1 = DateUtils.stringToDate1(s2);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    criteria.andTimebeginLessThanOrEqualTo(date);
                    criteria.andTimeupdataGreaterThanOrEqualTo(date1);
                }
                List<LgDataDescription> lgDataDescriptions = dataDescriptionMapper.selectByExample(lgDataDescriptionExample);
                for(LgDataDescription lgData:lgDataDescriptions){
                    Date timebegin = lgData.getTimebegin();
                    Date timeupdata = lgData.getTimeupdata();

                }
                return lgDataDescriptions;
            }
        }
    }

    /**
     * “导出”：可导出当前查询结果数据为 excel 文件，附带表头
     */
    @Override
    public String importExcel(List<LgDataDescription> list) throws IOException {
        //1.在内存中创建一个excel文件
        HSSFWorkbook sheets = new HSSFWorkbook();
        //2.创建工作簿
        HSSFSheet sheet = sheets.createSheet();
        //3.创建标题行
        HSSFRow row = sheet.createRow(0);
        row.createCell(0).setCellValue("文件名称");
        row.createCell(1).setCellValue("存储开始时间");
        row.createCell(2).setCellValue("存储结束时间");
        row.createCell(3).setCellValue("存储类型");
        row.createCell(4).setCellValue("文件大小");
        row.createCell(5).setCellValue("实际存储容量");
        row.createCell(6).setCellValue("平均存储带宽");
        row.createCell(7).setCellValue("储存设备SN");

        //4.遍历数据，创建数据行
        for(LgDataDescription log: list){
            //获取最后一行的行好
            int lastRowNum = sheet.getLastRowNum();
            HSSFRow row1 = sheet.createRow(lastRowNum + 1);
            row1.createCell(0).setCellValue(log.getFilename());
            row1.createCell(1).setCellValue(log.getTimebegin());
            row1.createCell(2).setCellValue(log.getTimeupdata());
            row1.createCell(3).setCellValue(log.getStorageclass());
            row1.createCell(4).setCellValue(log.getFilesize());
            row1.createCell(5).setCellValue(log.getCapacity());
            row1.createCell(6).setCellValue(log.getSpeed());
            row1.createCell(7).setCellValue(log.getDevsn());
        }
        //5.获取输出流对象
        FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\文件存储明细.xls");
        sheets.write(fos);
        sheets.close();
        return "OK";
    }
}
