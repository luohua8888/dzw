package com.accp.controller;


import com.accp.domain.TechnicianInformation;
import com.accp.domain.TechnicianInformation;
import com.accp.domain.TechnicianLevel;
import com.accp.service.impl.TechnicianInformationServiceImpl;
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
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ytang
 * @since 2021-01-27
 */
@RestController
@RequestMapping("/technicianInformation")
public class TechnicianInformationController {
    @Autowired
    TechnicianInformationServiceImpl service;
    @Autowired
    MaintenanceTeamController teamController;
    @Autowired
    TechnicianLevelController levelController;

    @RequestMapping("findbyteamid")
    public List<TechnicianInformation> findByTeamid(String[] teamid, String where) {
        List<TechnicianInformation> technicianInformations = new ArrayList<TechnicianInformation>();
        QueryWrapper<TechnicianInformation> wrapper = new QueryWrapper<TechnicianInformation>();
        if (teamid != null&&teamid.length>0) {
            wrapper.lambda().in(TechnicianInformation::getTeamid, teamid);
        }
        if(where!=null){
            wrapper.lambda().and(wq -> wq.like(TechnicianInformation::getTechnicianid, where).or().like(TechnicianInformation::getTechnicianname, where).or().like(TechnicianInformation::getPhone, where));
        }
        technicianInformations = service.list(wrapper);
        for (TechnicianInformation i :
                technicianInformations) {
            i.setMaintenanceTeam(teamController.findByTid(i.getTeamid()));
            i.setTechnicianLevel(levelController.findByLid(i.getLevelid()));
        }
        return technicianInformations;
    }

    @RequestMapping("find")
    public List<TechnicianInformation> find() {
        List<TechnicianInformation> technicianInformations = service.list();
        for (TechnicianInformation i :
                technicianInformations) {
            i.setMaintenanceTeam(teamController.findByTid(i.getTeamid()));
            i.setTechnicianLevel(levelController.findByLid(i.getLevelid()));
        }
        return technicianInformations;
    }
    @RequestMapping("save")
    public int save(TechnicianInformation technicianInformation) {
        int count = 0;
        QueryWrapper<TechnicianInformation> wrapper = new QueryWrapper<TechnicianInformation>();
        wrapper.lambda().eq(TechnicianInformation::getTechnicianid, technicianInformation.getTechnicianid());
        if (technicianInformation.getTechnicianid().equals(technicianInformation.getRetechnicianid())||service.count(wrapper) == 0) {
            boolean bool;
            if (technicianInformation.getRetechnicianid() != null) {
                wrapper.clear();
                wrapper.lambda().eq(TechnicianInformation::getTechnicianid, technicianInformation.getRetechnicianid());
                bool = service.update(technicianInformation, wrapper);
            } else {
                bool = service.save(technicianInformation);
            }
            return  count =bool ? 1 : 0;
        } else {
            return -1;
        }
    }

    @RequestMapping("del")
    public boolean del(String retechnicianid){
        QueryWrapper<TechnicianInformation> wrapper = new QueryWrapper<TechnicianInformation>();
        wrapper.lambda().eq(TechnicianInformation::getTechnicianid,retechnicianid);
        return service.remove(wrapper);
    }
    @RequestMapping("/downloadExcel")
    public ResponseEntity<byte []> downloadExcel(String[] teamid, String where) throws IOException {
        List<TechnicianInformation> list = new ArrayList<TechnicianInformation>();
        if (teamid.length==0&&where.trim().length()==0){
            list=this.find();
        }else{
            list=this.findByTeamid(teamid,where);
        }
        Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet();
        //导出excel头部
        Row rowTitle = sheet.createRow(0);
        Cell tid = rowTitle.createCell(0);
        Cell tname = rowTitle.createCell(1);
        Cell jid = rowTitle.createCell(2);
        Cell jname = rowTitle.createCell(3);
        Cell sex = rowTitle.createCell(4);
        Cell phone = rowTitle.createCell(5);
        Cell address = rowTitle.createCell(6);
        Cell borndate = rowTitle.createCell(7);
        Cell isgroupleader = rowTitle.createCell(8);
        Cell loginname = rowTitle.createCell(9);
        Cell idcard = rowTitle.createCell(10);
        Cell residenceaddress = rowTitle.createCell(11);
        Cell residencebank = rowTitle.createCell(12);
        Cell bankaccount = rowTitle.createCell(13);
        Cell levelname = rowTitle.createCell(14);
        Cell maintenancetype = rowTitle.createCell(15);
        Cell maintenancebrand = rowTitle.createCell(16);
        tid.setCellValue("班组编号");
        tname.setCellValue("班组名称");
        jid.setCellValue("技工编号");
        jname.setCellValue("技工姓名");
        sex.setCellValue("性别");
        phone.setCellValue("手机");
        address.setCellValue("地址");
        borndate.setCellValue("出生日期");
        isgroupleader.setCellValue("组长");
        loginname.setCellValue("登录名");
        idcard.setCellValue("身份证号");
        residenceaddress.setCellValue("户口地址");
        residencebank.setCellValue("开户银行");
        bankaccount.setCellValue("银行账户");
        levelname.setCellValue("星级");
        maintenancetype.setCellValue("维修工种");
        maintenancebrand.setCellValue("修为品牌");

        //组装导出的学生数据，如果是其他业务，请根据业务情况进行编写
        if(list!=null){
            for (int i = 1; i <= list.size(); i++) {
                TechnicianInformation information = list.get(i-1);
                //导出excel数据
                Row rowValue = sheet.createRow(i);
                Cell tidvalue = rowValue.createCell(0);
                Cell tnamevalue = rowValue.createCell(1);
                Cell jidvalue = rowValue.createCell(2);
                Cell jnamevalue = rowValue.createCell(3);
                Cell sexvalue = rowValue.createCell(4);
                Cell phonevalue = rowValue.createCell(5);
                Cell addressvalue = rowValue.createCell(6);
                Cell borndatevalue = rowValue.createCell(7);
                Cell isgroupleadervalue = rowValue.createCell(8);
                Cell loginnamevalue = rowValue.createCell(9);
                Cell idcardvalue = rowValue.createCell(10);
                Cell residenceaddressvalue = rowValue.createCell(11);
                Cell residencebankvalue = rowValue.createCell(12);
                Cell bankaccountvalue = rowValue.createCell(13);
                Cell levelnamevalue = rowValue.createCell(14);
                Cell maintenancetypevalue = rowValue.createCell(15);
                Cell maintenancebrandvalue = rowValue.createCell(16);
                tidvalue.setCellValue(information.getMaintenanceTeam().getTeamid());
                tnamevalue.setCellValue(information.getMaintenanceTeam().getTeamname());
                jidvalue.setCellValue(information.getTechnicianid());
                jnamevalue.setCellValue(information.getTechnicianname());
                sexvalue.setCellValue(information.getSex());
                phonevalue.setCellValue(information.getPhone());
                addressvalue.setCellValue(information.getAddress());
                borndatevalue.setCellValue(information.getBorndate());
                isgroupleadervalue.setCellValue(information.getIsteamleader()==1?"组长":"");
                loginnamevalue.setCellValue(information.getLoginphone());
                idcardvalue.setCellValue(information.getIdcard());
                residenceaddressvalue.setCellValue(information.getResidenceaddress());
                residencebankvalue.setCellValue(information.getResidencebank());
                bankaccountvalue.setCellValue(information.getBankaccount());
                levelnamevalue.setCellValue(information.getTechnicianLevel().getLevelname());
                maintenancetypevalue.setCellValue(information.getMaintenancetype());
                maintenancebrandvalue.setCellValue(information.getMaintenancebrand());
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        book.write(byteArrayOutputStream);
        HttpHeaders headers = new HttpHeaders();
        //设置响应内容为文件流模式
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        String fileName = new String("技工表.xlsx".getBytes("utf-8"),"iso-8859-1");
        //设置响应的文件的名称
        headers.setContentDispositionFormData("attachment",fileName);
        return new ResponseEntity(byteArrayOutputStream.toByteArray(), headers, HttpStatus.OK);
    }
}

