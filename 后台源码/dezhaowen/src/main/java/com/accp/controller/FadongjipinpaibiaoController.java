package com.accp.controller;


import com.accp.domain.Fadongjipinpaibiao;
import com.accp.domain.Yuangongziliaobiao;
import com.accp.service.impl.FadongjipinpaibiaoServiceImpl;
import org.apache.catalina.Engine;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xpath.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ytang
 * @since 2021-02-16
 */
@RestController
@RequestMapping("/fadongjipinpaibiao")
public class FadongjipinpaibiaoController {

    @Autowired
    FadongjipinpaibiaoServiceImpl engineService;

    //查看所有发动机品牌
    @GetMapping("/findall")
    public List<Fadongjipinpaibiao> findall(){
        return  engineService.list();
    }

    //添加发动机品牌
    @PostMapping("/add")
    public Boolean add( @RequestBody Fadongjipinpaibiao engine){
        System.out.println(engine+"111");
        return  engineService.save(engine);
    }

    //删除发动机
    @GetMapping("/remove/{fid}")
    public String remove(@PathVariable("fid") Integer fid){
        boolean result = engineService.removeById(fid);
        if(result){
            return "删除成功";
        }else{
            return  "删除失败";
        }
    }


    //查询单个
    @GetMapping("/findbyid/{fid}")
    public Fadongjipinpaibiao findbyid(@PathVariable("fid")  Integer fid){
        System.out.println(engineService.getById(fid));
        return engineService.getById(fid);
    }

    @PostMapping("/update")
    public Boolean update( @RequestBody Fadongjipinpaibiao engine){
        System.out.println(engine+"111");
        return  engineService.updateById(engine);
    }

    @RequestMapping("/downloadEcxel")
    public ResponseEntity<byte []> downloadEcxel() throws IOException {
        List<Fadongjipinpaibiao> s= engineService.list();

        Workbook book=new XSSFWorkbook();
        Sheet sheet=book.createSheet();
        Row rowTile=sheet.createRow(0);
        Cell id=rowTile.createCell(0);
        Cell name=rowTile.createCell(0);
        id.setCellValue("发动机品牌编码");
        name.setCellValue("发动机品牌名称");

        if(s!=null){
            for (int i = 0; i < s.size(); i++) {
                Fadongjipinpaibiao fdjvalue=s.get(i);
                Row rowTilevalue=sheet.createRow(i+1);
                Cell idvalue=rowTilevalue.createCell(1);
                Cell namevalue=rowTilevalue.createCell(2);
                idvalue.setCellValue(fdjvalue.getFid());
                namevalue.setCellValue(fdjvalue.getFname());
            }
        }

        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        book.write(byteArrayOutputStream);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        String fileName = new String("发动机导出数据.xlsx".getBytes("utf-8"),"iso-8859-1");
        headers.setContentDispositionFormData("attachment",fileName);
        return new ResponseEntity(byteArrayOutputStream.toByteArray(),headers, HttpStatus.OK);
    }
}

