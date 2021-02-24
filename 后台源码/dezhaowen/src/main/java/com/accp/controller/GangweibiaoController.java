package com.accp.controller;


import com.accp.domain.Gangweibiao;
import com.accp.service.IGangweibiaoService;
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
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/gangweibiao")
public class GangweibiaoController {
    @Autowired
    IGangweibiaoService service;

    @RequestMapping("/find")
    public List<Gangweibiao> queryAll(){
        return service.list();
    }

    @RequestMapping("/add")
    public boolean add(Gangweibiao post){
        return service.save(post);
    }

    @RequestMapping("/findById/{id}")
    public Gangweibiao queryId(@PathVariable("id") Integer id){
        return service.getById(id);
    }

    @RequestMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        return service.removeById(id);
    }

    @RequestMapping("/update")
    public boolean update(Gangweibiao post){
        return service.updateById(post);
    }

    @RequestMapping("/downloadExcel")
    public ResponseEntity<byte []> downloadExcel() throws IOException {
        List<Gangweibiao> list =  service.list();
        Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet();

        Row rowTitle = sheet.createRow(0);
        Cell gidTilte = rowTitle.createCell(0);
        Cell gnameTilte = rowTitle.createCell(1);

        gidTilte.setCellValue("岗位编码");
        gnameTilte.setCellValue("岗位名称");
        if(list!=null){
            for (int i = 1; i < list.size(); i++){
                Gangweibiao xsdjValue = list.get(i);
                Row rowValue = sheet.createRow(i);
                Cell gidValue = rowValue.createCell(0);
                Cell gnameValue = rowValue.createCell(1);

                gidValue.setCellValue(xsdjValue.getGid());
                gnameValue.setCellValue(xsdjValue.getGname());
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        book.write(byteArrayOutputStream);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        String fileName = new String("岗位定义导出数据.xlsx".getBytes("utf-8"),"iso-8859-1");
        headers.setContentDispositionFormData("attachment",fileName);
        return new ResponseEntity(byteArrayOutputStream.toByteArray(),headers, HttpStatus.OK);
    }

}

