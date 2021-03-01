package com.accp.controller;


import com.accp.domain.Bumenbiao;
import com.accp.domain.Yuangongziliaobiao;
import com.accp.domain.Zuzhijiegoubiao;
import com.accp.mapper.BumenbiaoMapper;
import com.accp.mapper.LizhiyuanyingbiaoMapper;
import com.accp.mapper.YuangongziliaobiaoMapper;
import com.accp.service.IBumenbiaoService;
import com.accp.service.IYuangongziliaobiaoService;
import com.accp.service.impl.ZuzhijiegoubiaoServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ytang
 * @since 2021-01-27
 */
@RestController
@RequestMapping("/lizhiyuanyingbiao")
public class LizhiyuanyingbiaoController {
    @Autowired
    YuangongziliaobiaoMapper ymapper;
    @Autowired
    BumenbiaoMapper bmapper;
    @Autowired
    LizhiyuanyingbiaoMapper lmapper;
    @Autowired
    IYuangongziliaobiaoService service;
    @Autowired
    IBumenbiaoService bservice;
    @Autowired
    ZuzhijiegoubiaoServiceImpl o;

    @RequestMapping("/lizhifind")
    public List<Yuangongziliaobiao> LizhiFind(String name){
        QueryWrapper<Yuangongziliaobiao> stu=new QueryWrapper<>();
        if(name!=null&&name.length()>0){
            stu.lambda().like(Yuangongziliaobiao::getYid,name).or().like(Yuangongziliaobiao::getYname,name);
        }
        stu.eq("y1",2);
        List<Yuangongziliaobiao> s= service.list(stu);
        for (Yuangongziliaobiao sd: s) {
            sd.setBu(bservice.getById(sd.getBid()));
        }
        return s;
    }

    @RequestMapping("/lizhih/{id}")
    public boolean LizhiH(@PathVariable("id") Integer id){
        boolean su=ymapper.lizhih(id);
        return su;
    }

    @RequestMapping("/lizhib")
    public List<Bumenbiao> LizhiB1(){
        List<Bumenbiao> s=bmapper.bu();
        return s;
    }

    @RequestMapping("/lizhibu")
    public List<Bumenbiao> LizhiB2(){
        List<Bumenbiao> s=bmapper.bu1();
        return s;
    }

    @RequestMapping("/lizhibuxuan/{id}")
    public List<Bumenbiao> LizhibuXuan(@PathVariable Integer id){
        List<Bumenbiao> s=bmapper.bu2(id);
        return s;
    }

    @RequestMapping("/lizhiid/{id}")
    public Yuangongziliaobiao LizhiId(@PathVariable("id") Integer id){
        Yuangongziliaobiao s=service.getById(id);
        return s;
    }

    @RequestMapping("/lizhixiu")
    public boolean LizhiXiu(Yuangongziliaobiao stu){
        boolean s=service.updateById(stu);
        return s;
    }

    @RequestMapping("/find")
    public List<Zuzhijiegoubiao> findByAll(String name){
        QueryWrapper<Zuzhijiegoubiao> stu=new QueryWrapper<>();
        if(name!=null&&name.length()>0){
            stu.lambda().like(Zuzhijiegoubiao::getZid,name).or().like(Zuzhijiegoubiao::getZname,name);
        }
        return o.list(stu);
    }

    @RequestMapping("/findById")
    public List<Yuangongziliaobiao> findById(@RequestBody List<Integer> s){
        QueryWrapper<Yuangongziliaobiao> queryWrapper=new QueryWrapper<>();
        for(Integer i:s){
            queryWrapper.or().eq("reserved3",i);
        }
        queryWrapper.eq("y1",2);
        List<Yuangongziliaobiao> sdd= service.list(queryWrapper);
        for (Yuangongziliaobiao c: sdd) {
            c.setBu(bservice.getById(c.getBid()));
        }
        return sdd;
    }

    @RequestMapping("/lizhib1/{id}")
    public Bumenbiao lizhib1(@PathVariable("id") Integer id){
        return bservice.getById(id);
    }

    @RequestMapping("/lizhiyuans")
    public List<Yuangongziliaobiao> LizhiYuans(){
        QueryWrapper<Yuangongziliaobiao> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("y1",1);
        List<Yuangongziliaobiao> sdd= service.list(queryWrapper);
        for (Yuangongziliaobiao c: sdd) {
            c.setBu(bservice.getById(c.getBid()));
        }
        return sdd;
    }

    @RequestMapping("/lizhixz")
    public boolean LizhiXz(Yuangongziliaobiao stu){
        boolean s=lmapper.lizhixz(stu);
        return s;
    }

    @RequestMapping("/allc")
    public List<Yuangongziliaobiao> AllSelect(Yuangongziliaobiao s){
        QueryWrapper<Yuangongziliaobiao> queryWrapper=new QueryWrapper<>();
        if (s.getYname()!=null) {
            queryWrapper.like("yname",s.getYname());
        }
        if (s.getYid()!=null) {
            queryWrapper.like("yid",s.getYid());
        }
        if (s.getYsex()!=null) {
            queryWrapper.like("ysex",s.getYsex());
        }
        if (s.getGid()!=null) {
            queryWrapper.like("gid",s.getGid());
        }
        if (s.getBid()!=null) {
            queryWrapper.like("bid",s.getBid());
        }
        if (s.getYheigth()!=null) {
            queryWrapper.like("yheigth",s.getYheigth());
        }
        if (s.getYnativplaceid()!=null) {
            queryWrapper.like("ynativplaceid",s.getYnativplaceid());
        }
        if (s.getYnationid()!=null) {
            queryWrapper.like("ynationid",s.getYnationid());
        }
        if (s.getYschoolid()!=null) {
            queryWrapper.like("yschoolid",s.getYschoolid());
        }
        if (s.getYspecialtyid()!=null) {
            queryWrapper.like("yspecialtyid",s.getYspecialtyid());
        }
        if (s.getYspecialtynid()!=null) {
            queryWrapper.like("yspecialtynid",s.getYspecialtynid());
        }
        if (s.getYdatetime()!=null) {
            queryWrapper.like("ydatetime",s.getYdatetime());
        }
        if (s.getYorganizationid()!=null) {
            queryWrapper.like("yorganizationid",s.getYorganizationid());
        }
        if (s.getYschoolid()!=null) {
            queryWrapper.like("yschoolid",s.getYschoolid());
        }
        if (s.getYnumber()!=null) {
            queryWrapper.like("ynumber",s.getYnumber());
        }
        if (s.getYattribute()!=null) {
            queryWrapper.like("yattribute",s.getYattribute());
        }
        if (s.getYheigth()!=null) {
            queryWrapper.like("yheigth",s.getYheigth());
        }
        queryWrapper.eq("y1",2);
        List<Yuangongziliaobiao> stt= service.list(queryWrapper);
        for (Yuangongziliaobiao sd: stt) {
            sd.setBu(bservice.getById(sd.getBid()));
        }
        return stt;
    }

    @RequestMapping("/lizhid/{id}")
    public boolean LizhiDelete(@PathVariable("id") Integer id){
        return service.removeById(id);
    }

    @RequestMapping("/downloadExcel")
    public ResponseEntity<byte []> downloadExcel() throws IOException {
        QueryWrapper<Yuangongziliaobiao> stu=new QueryWrapper<>();
        stu.eq("y1",2);
        List<Yuangongziliaobiao> s= service.list(stu);
        for (Yuangongziliaobiao sd: s) {
            sd.setBu(bservice.getById(sd.getBid()));
        }
        Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet();

        Row rowTitle = sheet.createRow(0);
        Cell ypositionsTilte = rowTitle.createCell(0);
        Cell bnameTilte = rowTitle.createCell(1);
        Cell yidTilte = rowTitle.createCell(2);
        Cell ynameTilte = rowTitle.createCell(3);
        Cell ysexTilte = rowTitle.createCell(4);
        Cell ypositionTilte = rowTitle.createCell(5);
        Cell y2Tilte = rowTitle.createCell(6);
        Cell y3Tilte = rowTitle.createCell(7);

        ypositionsTilte.setCellValue("所在门店");
        bnameTilte.setCellValue("部门");
        yidTilte.setCellValue("员工编号");
        ynameTilte.setCellValue("姓名");
        ysexTilte.setCellValue("性别");
        ypositionTilte.setCellValue("职位");
        y2Tilte.setCellValue("离职日期");
        y3Tilte.setCellValue("离职原因");
        if(s!=null){
            for (int i = 1; i <= s.size(); i++){
                Yuangongziliaobiao xsdjValue = s.get(i-1);
                Row rowValue = sheet.createRow(i);
                Cell ypositionsValue = rowValue.createCell(0);
                Cell bnameValue = rowValue.createCell(1);
                Cell yidValue = rowValue.createCell(2);
                Cell ynameValue = rowValue.createCell(3);
                Cell ysexValue = rowValue.createCell(4);
                Cell ypositionValue = rowValue.createCell(5);
                Cell y2Value = rowValue.createCell(6);
                Cell y3Value = rowValue.createCell(7);

                ypositionsValue.setCellValue("总厂");
                bnameValue.setCellValue(xsdjValue.getBu().getBname());
                yidValue.setCellValue(xsdjValue.getYid());
                ynameValue.setCellValue(xsdjValue.getYname());
                ysexValue.setCellValue(xsdjValue.getYsex());
                ypositionValue.setCellValue(xsdjValue.getYposition());
                y2Value.setCellValue(xsdjValue.getY2());
                y3Value.setCellValue(xsdjValue.getY3());
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        book.write(byteArrayOutputStream);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        String fileName = new String("离职登记导出数据.xlsx".getBytes("utf-8"),"iso-8859-1");
        headers.setContentDispositionFormData("attachment",fileName);
        return new ResponseEntity(byteArrayOutputStream.toByteArray(),headers, HttpStatus.OK);
    }

}

