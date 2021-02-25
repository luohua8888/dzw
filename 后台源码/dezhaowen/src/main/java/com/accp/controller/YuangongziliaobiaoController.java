package com.accp.controller;


import com.accp.domain.*;
import com.accp.service.*;
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
@RequestMapping("/yuangongziliaobiao")
public class YuangongziliaobiaoController {
    @Autowired
    IYuangongziliaobiaoService services;
    @Autowired
    IGangweibiaoService service;
    @Autowired
    IJiguanbiaoService jservice;
    @Autowired
    IMingzubiaoService mservice;
    @Autowired
    IHunyingzhuangtaibiaoService hservice;
    @Autowired
    IXuelibiaoService xservice;
    @Autowired
    IBiyexuexiaobiaoService bservice;
    @Autowired
    IZhuanyezigebiaoService zservice;
    @Autowired
    IXueweibiaoService xwservice;
    @Autowired
    IYuangongziliaobiaoService yservice;
    @Autowired
    IBumenbiaoService buservice;
    @Autowired
    IZuzhijiegoubiaoService zzservice;
    @Autowired
    IChengshibiaoService cservice;

    @RequestMapping("/gfind")
    public List<Gangweibiao> queryAll1(){
        return service.list();
    }
    @RequestMapping("/jfind")
    public List<Jiguanbiao> queryAll2(){
        return jservice.list();
    }
    @RequestMapping("/mfind")
    public List<Mingzubiao> queryAll3(){
        return mservice.list();
    }
    @RequestMapping("/hfind")
    public List<Hunyingzhuangtaibiao> queryAll4(){
        return hservice.list();
    }
    @RequestMapping("/xfind")
    public List<Xuelibiao> queryAll5(){
        return xservice.list();
    }
    @RequestMapping("/bfind")
    public List<Biyexuexiaobiao> queryAll6(){
        return bservice.list();
    }
    @RequestMapping("/zfind")
    public List<Zhuanyezigebiao> queryAll7(){
        return zservice.list();
    }
    @RequestMapping("/xwfind")
    public List<Xueweibiao> queryAll8(){
        return xwservice.list();
    }
    @RequestMapping("/bufind")
    public List<Bumenbiao> buFind(){
        List<Bumenbiao> list=buservice.list();
        return list;
    }
    @RequestMapping("/yuanfind")
    public List<Yuangongziliaobiao> yuanFind(){
        return yservice.list();
    }
    @RequestMapping("/downloadExcel")
    public ResponseEntity<byte []> downloadExcel() throws IOException {
        List<Yuangongziliaobiao> list =  services.list();
        Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet();

        Row rowTitle = sheet.createRow(0);
        Cell ypositionTilte = rowTitle.createCell(0);
        Cell bidTilte = rowTitle.createCell(1);
        Cell yidTilte = rowTitle.createCell(2);
        Cell ynameTilte = rowTitle.createCell(3);
        Cell yjnameTilte = rowTitle.createCell(4);
        Cell yjphoneTilte = rowTitle.createCell(5);
        Cell yphoneTilte = rowTitle.createCell(6);
        Cell emailTilte = rowTitle.createCell(7);

        ypositionTilte.setCellValue("所在门店");
        bidTilte.setCellValue("部门");
        yidTilte.setCellValue("员工编号");
        ynameTilte.setCellValue("姓名");
        yjnameTilte.setCellValue("分机/段号");
        yjphoneTilte.setCellValue("直机");
        yphoneTilte.setCellValue("手机");
        emailTilte.setCellValue("邮箱");
        if(list!=null){
            for (int i = 1; i < list.size(); i++){
                Yuangongziliaobiao xsdjValue = list.get(i);
                Row rowValue = sheet.createRow(i);
                Cell ypositionValue = rowValue.createCell(0);
                Cell bidValue = rowValue.createCell(1);
                Cell yidValue = rowValue.createCell(2);
                Cell ynameValue = rowValue.createCell(3);
                Cell yjnameValue = rowValue.createCell(4);
                Cell yjphoneValue = rowValue.createCell(5);
                Cell yphoneValue = rowValue.createCell(6);
                Cell emailValue = rowValue.createCell(7);

                ypositionValue.setCellValue(xsdjValue.getYposition());
                bidValue.setCellValue(xsdjValue.getBid());
                yidValue.setCellValue(xsdjValue.getYid());
                ynameValue.setCellValue(xsdjValue.getYname());
                yjnameValue.setCellValue(xsdjValue.getYjname());
                yjphoneValue.setCellValue(xsdjValue.getYjphone());
                yphoneValue.setCellValue(xsdjValue.getYphone());
                emailValue.setCellValue(xsdjValue.getEmail());
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        book.write(byteArrayOutputStream);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        String fileName = new String("通讯名录导出数据.xlsx".getBytes("utf-8"),"iso-8859-1");
        headers.setContentDispositionFormData("attachment",fileName);
        return new ResponseEntity(byteArrayOutputStream.toByteArray(),headers, HttpStatus.OK);
    }
}

