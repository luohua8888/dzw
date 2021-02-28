package com.accp.controller;


import com.accp.domain.*;
import com.accp.service.impl.*;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yy
 * @since 2021-02-22
 */
@RestController
@RequestMapping("/weixiubiao")
public class WeixiubiaoController {

    @Autowired
    FadongjipinpaibiaoServiceImpl fservice;

    @Autowired
    ChexingdingyibiaoServiceImpl cservice;

    @Autowired
    PinpaichexingServiceImpl pservice;

    @Autowired
    WeixiubiaoServiceImpl wservice;

    @Autowired
    EarningServiceImpl eervice;
    //查看所有发动机品牌
    @GetMapping("/findall")
    public Map<String, Object> findall(){
        List<Fadongjipinpaibiao> flist=fservice.list();
        List<Pinpaichexing> plist=pservice.list();
        Map<String,Object> map = new HashMap<>();
        map.put("flist",flist);
        map.put("plist",plist);
        return  map;
    }

    //查看车型定义
    @GetMapping("/weixiufind/{cxun}")
    public List<Weixiubiao> carfind(@PathVariable String cxun,Integer chaxun) {
        System.out.print(cxun);
       QueryWrapper<Weixiubiao> query=new QueryWrapper<>();
        if(cxun!=null&&cxun.length()>0&&!cxun.equals("0")){
            query.lambda().eq(Weixiubiao::getXiangmuleibie,cxun);
        }
        if(chaxun!=null){
            query.lambda().like(Weixiubiao::getWid,chaxun);
        }
       List<Weixiubiao> list=wservice.list(query);
        return  list;
    }
    //维修接车新增
    @RequestMapping("/weixiuadd")
    public Boolean chexinadd(Weixiubiao stu) {
        return wservice.save(stu);
    }

    //查看所有收入种类
    @GetMapping("/shou")
    public List<Earning> shou(){
        return  eervice.list();
    }

    //按id查询维修数据
    @GetMapping("/wxfindByid/{wid}")
    public Weixiubiao chexingByid(@PathVariable("wid") Integer wid) {

        return wservice.getById(wid);
    }

    //修改维修数据
    @PostMapping("/weixiuupdate")
    public Boolean update( @RequestBody Weixiubiao engine){
        System.out.println(engine+"111");
        return  wservice.updateById(engine);
    }

    //删除维修数据
    @PostMapping("/wxremove/{fid}")
    public String remove(@PathVariable("fid") Integer fid){
        boolean result = wservice.removeById(fid);
        if(result){
            return "删除成功";
        }else{
            return  "删除失败";
        }

    }

    @RequestMapping("/downloadEcxel/{chaxun}")
    public ResponseEntity<byte []> downloadEcxel(@PathVariable Integer chaxun) throws IOException {
        QueryWrapper<Weixiubiao> query=new QueryWrapper<>();
        query.lambda().like(Weixiubiao::getWid,chaxun);
        List<Weixiubiao> s=wservice.list(query);

        Workbook book=new XSSFWorkbook();

        Sheet sheet=book.createSheet();

        Row rowTitle = sheet.createRow(0);
        Cell ypositionsTilte = rowTitle.createCell(0);
        Cell bnameTilte = rowTitle.createCell(1);
        Cell yidTilte = rowTitle.createCell(2);
        Cell ynameTilte = rowTitle.createCell(3);
        Cell ysexTilte = rowTitle.createCell(4);
        Cell ypositionTilte = rowTitle.createCell(5);
        Cell y2Tilte = rowTitle.createCell(6);
        Cell ynameTilte1 = rowTitle.createCell(7);
        Cell ysexTilte2= rowTitle.createCell(8);
        Cell ypositionTilte3 = rowTitle.createCell(9);
        Cell y2Tilte4 = rowTitle.createCell(10);

        ypositionsTilte.setCellValue("项目编码");
        bnameTilte.setCellValue("项目名称");
        yidTilte.setCellValue("收入种类");
        yidTilte.setCellValue("项目类别");
        ynameTilte.setCellValue("备注");
        ypositionTilte.setCellValue("标准价");
        ysexTilte.setCellValue("会员价");
        y2Tilte.setCellValue("vip价");
        ynameTilte1.setCellValue("协议价");
        ysexTilte2.setCellValue("索赔价");
        ypositionTilte3.setCellValue("保险价");
        y2Tilte4.setCellValue("售价按");

        if(s!=null){
            for (int i = 0; i < s.size(); i++) {
                Weixiubiao Weixiubiao=s.get(i);
                Row rowTitlevalue = sheet.createRow(i+1);
                Cell ypositionsTiltevalue = rowTitlevalue.createCell(0);
                Cell bnameTiltevalue = rowTitlevalue.createCell(1);
                Cell yidTiltevalue = rowTitlevalue.createCell(2);
                Cell ynameTiltevalue = rowTitlevalue.createCell(3);
                Cell ysexTiltevalue = rowTitlevalue.createCell(4);
                Cell ypositionTiltevalue = rowTitlevalue.createCell(5);
                Cell y2Tiltevalue = rowTitlevalue.createCell(6);
                Cell ynameTilte1value = rowTitlevalue.createCell(7);
                Cell ysexTilte2value= rowTitlevalue.createCell(8);
                Cell ypositionTilte3value = rowTitlevalue.createCell(9);
                Cell y2Tilte4value = rowTitlevalue.createCell(10);

                ypositionsTiltevalue.setCellValue(Weixiubiao.getWid());
                bnameTiltevalue.setCellValue(Weixiubiao.getWname());
                yidTiltevalue.setCellValue(Weixiubiao.getShourujizhong());
                yidTiltevalue.setCellValue(Weixiubiao.getXiangmuleibie());
                ynameTiltevalue.setCellValue(Weixiubiao.getBeizhu());
                ypositionTiltevalue.setCellValue(Weixiubiao.getBzj());
                ysexTiltevalue.setCellValue(Weixiubiao.getHyj());
                y2Tiltevalue.setCellValue(Weixiubiao.getVipj());
                ynameTilte1value.setCellValue(Weixiubiao.getXyj());
                ysexTilte2value.setCellValue(Weixiubiao.getSpj());
                ypositionTilte3value.setCellValue(Weixiubiao.getPxj());
                y2Tilte4value.setCellValue(Weixiubiao.getSj());
            }
        }

        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        book.write(byteArrayOutputStream);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        String fileName = new String("维修接车导出数据.xlsx".getBytes("utf-8"),"iso-8859-1");
        headers.setContentDispositionFormData("attachment",fileName);
        return new ResponseEntity(byteArrayOutputStream.toByteArray(),headers, HttpStatus.OK);
    }
    @RequestMapping("jgxg")
    public boolean jgxg(Weixiubiao weixiubiao){
        return wservice.updateById(weixiubiao);
    }
}

