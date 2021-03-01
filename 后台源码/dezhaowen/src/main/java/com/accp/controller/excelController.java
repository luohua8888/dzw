package com.accp.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import com.accp.service.impl.CashierServiceImpl;
import com.accp.service.impl.RepairServiceImpl;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Cashier;
import com.accp.domain.Repair;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;



@RestController
@RequestMapping("/excel")
public class excelController {
    @Autowired
    RepairServiceImpl rs;
    @Autowired
    CashierServiceImpl ccs;

    @PostMapping("/settlementExcel")
    public ResponseEntity<byte []> settlementExcel(String attrid) throws IOException {
        List<Repair> rlist=rs.selectSettleAccounts();
        List<Repair> lastlist=new ArrayList<Repair>();
        List<Cashier> clist=ccs.selectAllInfo();
        if(attrid.equals("1")) {
            for(int i=0;i<rlist.size();i++) {
                for(int j=0;j<clist.size();j++) {
                    if(rlist.get(i).getNumber().equals(clist.get(j).getNumber())) {
                        break;
                    }
                    if(j==clist.size()-1) {
                        lastlist.add(rlist.get(i));
                    }
                }
            }
        }else {
            for(int i=0;i<rlist.size();i++) {
                for(int j=0;j<clist.size();j++) {
                    if(rlist.get(i).getNumber().equals(clist.get(j).getNumber())) {
                        lastlist.add(rlist.get(i));
                        break;
                    }
                }
            }
        }


        Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet();

        Row titleRow = sheet.createRow(0);
        titleRow.createCell(0).setCellValue("销售单号");
        titleRow.createCell(1).setCellValue("单据类型");
        titleRow.createCell(2).setCellValue("结算方式");
        titleRow.createCell(3).setCellValue("单据状态");
        titleRow.createCell(4).setCellValue("结算状态");
        titleRow.createCell(5).setCellValue("结算时间");
        titleRow.createCell(6).setCellValue("结算人");
        titleRow.createCell(7).setCellValue("结算金额");
        titleRow.createCell(8).setCellValue("业务类型");
        titleRow.createCell(9).setCellValue("客户名称");
        titleRow.createCell(10).setCellValue("车牌号");
        titleRow.createCell(11).setCellValue("车型");
        titleRow.createCell(12).setCellValue("车架号");
        titleRow.createCell(13).setCellValue("联系电话");
        titleRow.createCell(14).setCellValue("保险公司");
        titleRow.createCell(15).setCellValue("服务顾问");
        titleRow.createCell(16).setCellValue("完成时间");
        titleRow.createCell(17).setCellValue("备注");
        for(int i=0;i<lastlist.size();i++) {
            Row row = sheet.createRow(i+1);
            Cell qwe1 = row.createCell(0);
            Cell qwe2 = row.createCell(1);
            Cell qwe3 = row.createCell(2);
            Cell qwe4 = row.createCell(3);
            Cell qwe5 = row.createCell(4);
            Cell qwe6 = row.createCell(5);
            Cell qwe7 = row.createCell(6);
            Cell qwe8 = row.createCell(7);
            Cell qwe9 = row.createCell(8);
            Cell qwe10 = row.createCell(9);

            Cell qwe11 = row.createCell(10);
            Cell qwe12 = row.createCell(11);
            Cell qwe13 = row.createCell(12);

            Cell qwe14 = row.createCell(13);
            Cell qwe15 = row.createCell(14);
            Cell qwe16 = row.createCell(15);

            Cell qwe17 = row.createCell(16);
            Cell qwe18 = row.createCell(17);

            if(lastlist.get(i).getNumber()!=null&&lastlist.get(i).getNumber().length()>0) {
                qwe1.setCellValue(lastlist.get(i).getNumber());
            }else {
                qwe1.setCellValue("");
            }

            if(lastlist.get(i).getWtype()!=null&&lastlist.get(i).getWtype().length()>0) {
                qwe2.setCellValue(lastlist.get(i).getWtype());
            }else {
                qwe2.setCellValue("");
            }

            if(lastlist.get(i).getSetter()!=null&&lastlist.get(i).getSetter().length()>0) {
                qwe3.setCellValue(lastlist.get(i).getSetter());
            }else {
                qwe3.setCellValue("");
            }

            if(lastlist.get(i).getStatus()!=null&&lastlist.get(i).getStatus().length()>0) {
                qwe4.setCellValue(lastlist.get(i).getStatus());
            }else {
                qwe4.setCellValue("");
            }

            if(lastlist.get(i).getPaymenttype()!=null&&lastlist.get(i).getPaymenttype().length()>0) {
                qwe5.setCellValue(lastlist.get(i).getPaymenttype());
            }else {
                qwe5.setCellValue("");
            }

            if(lastlist.get(i).getCashiertime()!=null) {
                qwe6.setCellValue(lastlist.get(i).getCashiertime());
            }else {
                qwe6.setCellValue("");
            }

            if(lastlist.get(i).getStaffpeople()!=null&&lastlist.get(i).getStaffpeople().length()>0) {
                qwe7.setCellValue(lastlist.get(i).getStaffpeople());
            }else {
                qwe7.setCellValue("");
            }

            if(lastlist.get(i).getTotalnum()!=null&&lastlist.get(i).getTotalnum()>0) {
                qwe8.setCellValue(lastlist.get(i).getTotalnum());
            }else {
                qwe8.setCellValue("");
            }

            if(lastlist.get(i).getCarbrandname()!=null&&lastlist.get(i).getCarbrandname().length()>0) {
                qwe9.setCellValue(lastlist.get(i).getCarbrandname());
            }else {
                qwe9.setCellValue("");
            }

            if(lastlist.get(i).getClientname()!=null&&lastlist.get(i).getClientname().length()>0) {
                qwe10.setCellValue(lastlist.get(i).getClientname());
            }else {
                qwe10.setCellValue("");
            }



            if(lastlist.get(i).getCarnumber()!=null&&lastlist.get(i).getCarnumber().length()>0) {
                qwe11.setCellValue(lastlist.get(i).getCarnumber());
            }else {
                qwe11.setCellValue("");
            }

            if(lastlist.get(i).getCartypename()!=null&&lastlist.get(i).getCartypename().length()>0) {
                qwe12.setCellValue(lastlist.get(i).getCartypename());
            }else {
                qwe12.setCellValue("");
            }

            if(lastlist.get(i).getCarnumber1()!=null&&lastlist.get(i).getCarnumber1().length()>0) {
                qwe13.setCellValue(lastlist.get(i).getCarnumber1());
            }else {
                qwe13.setCellValue("");
            }

            if(lastlist.get(i).getCarerphone()!=null&&lastlist.get(i).getCarerphone().length()>0) {
                qwe14.setCellValue(lastlist.get(i).getCarerphone());
            }else {
                qwe14.setCellValue("");
            }

            if(lastlist.get(i).getJqinsurance()!=null&&lastlist.get(i).getJqinsurance().length()>0) {
                qwe15.setCellValue(lastlist.get(i).getJqinsurance());
            }else {
                qwe15.setCellValue("");
            }

            if(lastlist.get(i).getStaffname()!=null&&lastlist.get(i).getStaffname().length()>0) {
                qwe16.setCellValue(lastlist.get(i).getStaffname());
            }else {
                qwe16.setCellValue("");
            }

            if(lastlist.get(i).getOverworkdate()!=null) {
                qwe17.setCellValue(lastlist.get(i).getOverworkdate());
            }else {
                qwe17.setCellValue("");
            }
            if(lastlist.get(i).getOtherone()!=null&&lastlist.get(i).getOtherone().length()>0) {
                qwe18.setCellValue(lastlist.get(i).getOtherone());
            }else {
                qwe18.setCellValue("");
            }

        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        book.write(byteArrayOutputStream);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        String fileName = new String("导出数据.xlsx".getBytes("utf-8"),"iso-8859-1");
        headers.setContentDispositionFormData("attachment",fileName);
        return new ResponseEntity(byteArrayOutputStream.toByteArray(),headers, HttpStatus.OK);
    }
}
