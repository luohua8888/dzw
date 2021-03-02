package com.accp.controller;


import com.accp.domain.Firm;
import com.accp.domain.Gooddata;
import com.accp.service.IGooddataService;
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
 *  前端控制器
 * </p>
 *
 * @author yy
 * @since 2021-02-22
 */
@RestController
@RequestMapping("/gooddata")
public class GooddataController {
    @Autowired
    IGooddataService gooddataService;
    @Autowired
    NumunitController numunitController;
    @Autowired
    EarningController earningController;
    @Autowired
    FirmController firmController;
    @Autowired
    YcfcController ycfcController;
    @Autowired
    GoodaddressController goodaddressController;
    @Autowired
    GoodbrandController goodbrandController;
    @Autowired
    GoodbigkindController goodbigkindController;
    @Autowired
    GoodgradeController goodgradeController;
    @Autowired
    PaytoController paytoController;


    @RequestMapping("findById")
    public List<Gooddata> findById(Integer[] id){
        QueryWrapper<Gooddata> wrapper=new QueryWrapper<>();
        if(id!=null){
            wrapper.lambda().in(Gooddata::getGood1,id);
        }
        List<Gooddata> gooddata=new ArrayList<>();
        gooddata=gooddataService.list(wrapper);
        for (Gooddata g:
                gooddata) {
            g.setNumunit(numunitController.findById(g.getNumunitid()));
            g.setEarning(earningController.findById(g.getEarningid()));
            g.setFirm(firmController.findById(g.getFirmid()));
            g.setYcfc(ycfcController.findById(g.getYcfcid()));
            g.setGoodaddress(goodaddressController.findById(g.getGoodaddressid()));
            g.setGoodbigkind(goodbigkindController.findById(g.getGoodbigkindid()));
            g.setGoodgrade(goodgradeController.findById(g.getGoodgradeid()));
            g.setGoodbrand(goodbrandController.findById(g.getGoodbrandid()));
            g.setPayto(paytoController.findById(g.getPaytoid()));
        }
        return  gooddata;
    }

    @RequestMapping("insert")
    public boolean insert(Gooddata gooddata){
        return gooddataService.save(gooddata);
    }
    @RequestMapping("update")
    public boolean update(Gooddata gooddata){
        return gooddataService.updateById(gooddata);
    }
    @RequestMapping("del")
    public boolean del(Integer id){
        return gooddataService.removeById(id);
    }
    @RequestMapping("findByWhere")
    public List<Gooddata> findByWhere(Gooddata gooddata){
        List<Gooddata> gooddata1=new ArrayList<>();
        QueryWrapper<Gooddata> wrapper=new QueryWrapper<>();
        if(gooddata.getGoodnum()!=null&&gooddata.getGoodnum().length()>0){
            wrapper.lambda().or().like(Gooddata::getGoodnum,gooddata.getGoodnum());
        }
        if(gooddata.getGoodname()!=null&&gooddata.getGoodname().length()>0){
            wrapper.lambda().or().like(Gooddata::getGoodname,gooddata.getGoodname());
        }
        if(gooddata.getGoodbrandid()!=null){
            wrapper.lambda().or().eq(Gooddata::getGoodbrandid,gooddata.getGoodbrandid());
        }
        if(gooddata.getFitcartype()!=null&&gooddata.getFitcartype().length()>0){
            wrapper.lambda().or().like(Gooddata::getFitcartype,gooddata.getFitcartype());
        }
        if(gooddata.getGoodbigkindid()!=null){
            wrapper.lambda().or().eq(Gooddata::getGoodbigkindid,gooddata.getGoodbigkindid());
        }
        if(gooddata.getEarningid()!=null){
            wrapper.lambda().or().eq(Gooddata::getEarningid,gooddata.getEarningid());
        }
        if(gooddata.getYcfcid()!=null){
            wrapper.lambda().or().eq(Gooddata::getYcfcid,gooddata.getYcfcid());
        }
        if(gooddata.getGoodgradeid()!=null){
            wrapper.lambda().or().eq(Gooddata::getGoodgradeid,gooddata.getGoodgradeid());
        }
        if(gooddata.getGoodaddressid()!=null){
            wrapper.lambda().or().eq(Gooddata::getGoodaddressid,gooddata.getGoodaddressid());
        }
        if(gooddata.getFirmid()!=null){
            wrapper.lambda().or().eq(Gooddata::getFirmid,gooddata.getFirmid());
        }
        if(gooddata.getYcnum()!=null&&gooddata.getYcnum().length()>0){
            wrapper.lambda().or().like(Gooddata::getYcnum,gooddata.getYcnum());
        }
        if(gooddata.getTxnum()!=null&&gooddata.getTxnum().length()>0){
            wrapper.lambda().or().like(Gooddata::getTxnum,gooddata.getTxnum());
        }
        if(gooddata.getPacking()!=null&&gooddata.getPacking().length()>0){
            wrapper.lambda().or().like(Gooddata::getPacking,gooddata.getPacking());
        }
        if(gooddata.getVolume()!=null&&gooddata.getVolume().length()>0){
            wrapper.lambda().or().like(Gooddata::getVolume,gooddata.getVolume());
        }
        if(gooddata.getRoughweight()!=null&&gooddata.getRoughweight().length()>0){
            wrapper.lambda().or().like(Gooddata::getRoughweight,gooddata.getRoughweight());
        }
        if(gooddata.getSuttle()!=null&&gooddata.getGoodnum().length()>0){
            wrapper.lambda().or().like(Gooddata::getGoodnum,gooddata.getGoodnum());
        }
        gooddata1=gooddataService.list(wrapper);
        for (Gooddata g:
                gooddata1) {
            g.setNumunit(numunitController.findById(g.getNumunitid()));
            g.setEarning(earningController.findById(g.getEarningid()));
            g.setFirm(firmController.findById(g.getFirmid()));
            g.setYcfc(ycfcController.findById(g.getYcfcid()));
            g.setGoodaddress(goodaddressController.findById(g.getGoodaddressid()));
            g.setGoodbigkind(goodbigkindController.findById(g.getGoodbigkindid()));
            g.setGoodgrade(goodgradeController.findById(g.getGoodgradeid()));
            g.setGoodbrand(goodbrandController.findById(g.getGoodbrandid()));
            g.setPayto(paytoController.findById(g.getPaytoid()));
        }
        return gooddata1;
    }
    @RequestMapping("down")
    public ResponseEntity<byte []> down() throws IOException {
        List<Gooddata> list=this.findById(null);
        Workbook workbook=new XSSFWorkbook();
        Sheet rows=workbook.createSheet();
        Row row=rows.createRow(0);

        Cell md=row.createCell(0);
        Cell photoname=row.createCell(1);
        Cell goodnum=row.createCell(2);
        Cell goodname=row.createCell(3);
        Cell goodbrand=row.createCell(4);
        Cell fitcartype=row.createCell(5);
        Cell numunit=row.createCell(6);
        Cell goodbigkind=row.createCell(7);
        Cell earning=row.createCell(8);
        Cell ycfc=row.createCell(9);
        Cell goodgrade=row.createCell(10);
        Cell goodaddress=row.createCell(11);
        Cell firm=row.createCell(12);
        Cell ycnum=row.createCell(13);
        Cell txnum=row.createCell(14);
        Cell packing=row.createCell(15);
        Cell volume=row.createCell(16);
        Cell roughweight=row.createCell(17);
        Cell suttle=row.createCell(18);
        Cell raprate=row.createCell(19);
        Cell exchange=row.createCell(20);
        Cell payto=row.createCell(21);

        md.setCellValue("登记门店");
        photoname.setCellValue("照片名");
        goodnum.setCellValue("商品编码");
        goodname.setCellValue("商品名称");
        goodbrand.setCellValue("商品品牌");
        fitcartype.setCellValue("适用车型");
        numunit.setCellValue("数量单位");
        goodbigkind.setCellValue("商品大类");
        earning.setCellValue("收入分类");
        ycfc.setCellValue("原厂副厂");
        goodgrade.setCellValue("商品等级");
        goodaddress.setCellValue("商品产地");
        firm.setCellValue("厂商名称");
        ycnum.setCellValue("原厂编码");
        txnum.setCellValue("条形码");
        packing.setCellValue("包装规格");
        volume.setCellValue("体积A");
        roughweight.setCellValue("毛重");
        suttle.setCellValue("净重");
        raprate.setCellValue("加价率");
        exchange.setCellValue("互换码");
        payto.setCellValue("售价按");

        if(list!=null){
            for (int i=1;i<=list.size();i++){
                Gooddata gooddata=list.get(i-1);
                Row rowvalue=rows.createRow(i);
                Cell mdvalue=rowvalue.createCell(0);
                Cell photonamevalue=rowvalue.createCell(1);
                Cell goodnumvalue=rowvalue.createCell(2);
                Cell goodnamevalue=rowvalue.createCell(3);
                Cell goodbrandvalue=rowvalue.createCell(4);
                Cell fitcartypevalue=rowvalue.createCell(5);
                Cell numunitvalue=rowvalue.createCell(6);
                Cell goodbigkindvalue=rowvalue.createCell(7);
                Cell earningvalue=rowvalue.createCell(8);
                Cell ycfcvalue=rowvalue.createCell(9);
                Cell goodgradevalue=rowvalue.createCell(10);
                Cell goodaddressvalue=rowvalue.createCell(11);
                Cell firmvalue=rowvalue.createCell(12);
                Cell ycnumvalue=rowvalue.createCell(13);
                Cell txnumvalue=rowvalue.createCell(14);
                Cell packingvalue=rowvalue.createCell(15);
                Cell volumevalue=rowvalue.createCell(16);
                Cell roughweightvalue=rowvalue.createCell(17);
                Cell suttlevalue=rowvalue.createCell(18);
                Cell rapratevalue=rowvalue.createCell(19);
                Cell exchangevalue=rowvalue.createCell(20);
                Cell paytovalue=rowvalue.createCell(21);

                mdvalue.setCellValue("总厂");
                photonamevalue.setCellValue(gooddata.getPhotoname());
                goodnumvalue.setCellValue(gooddata.getGoodnum());
                goodnamevalue.setCellValue(gooddata.getGoodname());
                goodbrandvalue.setCellValue(gooddata.getGoodbrand().getGoodbrand());
                fitcartypevalue.setCellValue(gooddata.getFitcartype());
                numunitvalue.setCellValue(gooddata.getNumunit().getNumunit());
                goodbigkindvalue.setCellValue(gooddata.getGoodbigkind().getGoodbigkindtype());
                earningvalue.setCellValue(gooddata.getEarning().getEarningname());
                ycfcvalue.setCellValue(gooddata.getYcfc().getYcfc());
                goodgradevalue.setCellValue(gooddata.getGoodgrade().getGoodgrade());
                goodaddressvalue.setCellValue(gooddata.getGoodaddress().getGoodaddress());
                firmvalue.setCellValue(gooddata.getFirm().getFirmname());
                ycnumvalue.setCellValue(gooddata.getYcnum());
                txnumvalue.setCellValue(gooddata.getTxnum());
                packingvalue.setCellValue(gooddata.getPacking());
                volumevalue.setCellValue(gooddata.getVolume());
                roughweightvalue.setCellValue(gooddata.getRoughweight());
                suttlevalue.setCellValue(gooddata.getSuttle());
                rapratevalue.setCellValue(gooddata.getRaprate());
                exchangevalue.setCellValue(gooddata.getExchange());
                paytovalue.setCellValue(gooddata.getPayto().getPayto());
            }
        }
        ByteArrayOutputStream stream=new ByteArrayOutputStream();
        workbook.write(stream);
        HttpHeaders headers=new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        String name=new String("商品表.xlsx".getBytes("utf-8"),"iso-8859-1");
        headers.setContentDispositionFormData("attachment",name);
        return new ResponseEntity<byte[]>(stream.toByteArray(),headers, HttpStatus.OK);
    }
    @RequestMapping("findByText")
    public List<Gooddata> findByText(String where){
        QueryWrapper<Gooddata> wrapper=new QueryWrapper<>();
        if(where!=null){
            wrapper.lambda().like(Gooddata::getGoodnum,where).or()
                    .like(Gooddata::getGoodname,where).or()
                    .like(Gooddata::getGoodnum,where).or()
                    .like(Gooddata::getFitcartype,where);
        }
        List<Gooddata> gooddata=new ArrayList<>();
        gooddata=gooddataService.list(wrapper);
        for (Gooddata g:
                gooddata) {
            g.setNumunit(numunitController.findById(g.getNumunitid()));
            g.setEarning(earningController.findById(g.getEarningid()));
            g.setFirm(firmController.findById(g.getFirmid()));
            g.setYcfc(ycfcController.findById(g.getYcfcid()));
            g.setGoodaddress(goodaddressController.findById(g.getGoodaddressid()));
            g.setGoodbigkind(goodbigkindController.findById(g.getGoodbigkindid()));
            g.setGoodgrade(goodgradeController.findById(g.getGoodgradeid()));
            g.setGoodbrand(goodbrandController.findById(g.getGoodbrandid()));
            g.setPayto(paytoController.findById(g.getPaytoid()));
        }
        return  gooddata;
    }
}

