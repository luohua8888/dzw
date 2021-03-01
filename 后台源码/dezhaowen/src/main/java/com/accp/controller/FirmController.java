package com.accp.controller;


import com.accp.domain.Firm;
import com.accp.domain.Linkman;
import com.accp.service.IFirmService;
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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequestMapping("/firm")
public class FirmController {
    @Autowired
    IFirmService firmService;
    @Autowired
    FirmtypeController firmtypeController;
    @Autowired
    FirmgradeController firmgradeController;
    @Autowired
    PaymentController paymentController;
    @Autowired
    LinkmanController linkmanController;

    @RequestMapping("find")
    public List<Firm> find(Integer[] id){
        List<Firm> list=new ArrayList<>();
        if(id!=null&&id.length>0){
            QueryWrapper<Firm> wrapper=new QueryWrapper<>();
            wrapper.lambda().in(Firm::getFirmtypeid,id);
            list=firmService.list(wrapper);
        }else{
            list=firmService.list();
        }
        for (Firm firm :
                list) {
            firm.setPayment(paymentController.findById(firm.getPaymentid()));
            firm.setFirmgrade(firmgradeController.findById(firm.getFirmgradeid()));
            firm.setFirmtype(firmtypeController.findById(firm.getFirmtypeid()));
            firm.setLinkman(linkmanController.findById(firm.getLinkmanid()));
        }
        return list;
    }

    @RequestMapping("add")
    @Transactional(rollbackFor=Exception.class)
    public boolean add(@RequestBody Firm firm){
        linkmanController.add(firm.getLinkman());
        firm.setLinkmanid(firm.getLinkman().getLinkmanid());
        boolean b=firmService.save(firm);
        return b;
    }
    @RequestMapping("update")
    @Transactional(rollbackFor=Exception.class)
    public boolean update(@RequestBody Firm firm){
        linkmanController.update(firm.getLinkman());
        firm.setLinkmanid(firm.getLinkman().getLinkmanid());
        boolean b=firmService.updateById(firm);
        return b;
    }
    @RequestMapping("del")
    @Transactional(rollbackFor=Exception.class)
    public boolean update(Integer firmid,Integer linkman){
        linkmanController.remove(linkman);
        boolean b=firmService.removeById(firmid);
        return b;
    }

    @RequestMapping("findByWhere")
    public List<Firm> findByWhere(String firmnum,String firmname,String address,Integer paymentid,Integer firmgradeid,String managebrand,String firmtypeid,String linkman,String telephone,String phone,String business,String remark){
        List<Firm> list=new ArrayList<>();
        QueryWrapper<Firm> wrapper=new QueryWrapper<>();
        if(firmnum!=null){
            wrapper.lambda().like(Firm::getFirmnum,firmnum);
        }
        if(firmname!=null){
            wrapper.lambda().like(Firm::getFirmname,firmname);
        }
        if(address!=null){
            wrapper.lambda().like(Firm::getAddress,address);
        }
        if(paymentid!=null){
            wrapper.lambda().eq(Firm::getPaymentid,paymentid);
        }
        if(firmgradeid!=null){
            wrapper.lambda().eq(Firm::getFirmgradeid,firmgradeid);
        }
        if(managebrand!=null){
            wrapper.lambda().like(Firm::getManagebrand,managebrand);
        }
        if(firmtypeid!=null){
            wrapper.lambda().eq(Firm::getFirmtypeid,firmtypeid);
        }
        QueryWrapper<Linkman> linkmanQueryWrapper=new QueryWrapper<>();
        if(linkman!=null){
            linkmanQueryWrapper.lambda().like(Linkman::getLinkman,linkman);
        }
        if(telephone!=null){
            linkmanQueryWrapper.lambda().like(Linkman::getTelephone,telephone);
        }
        if(phone!=null){
            linkmanQueryWrapper.lambda().like(Linkman::getPhone,phone);
        }
        List<Integer> id=linkmanController.findId(linkmanQueryWrapper);
        if(id.size()>0){
            wrapper.lambda().in(Firm::getLinkmanid,id);
        }
        if(business!=null){
            wrapper.lambda().like(Firm::getBusiness,business);
        }
        if(remark!=null){
            wrapper.lambda().like(Firm::getRemark,remark);
        }
        list=firmService.list(wrapper);
        for (Firm firm :
                list) {
            firm.setPayment(paymentController.findById(firm.getPaymentid()));
            firm.setFirmgrade(firmgradeController.findById(firm.getFirmgradeid()));
            firm.setFirmtype(firmtypeController.findById(firm.getFirmtypeid()));
            firm.setLinkman(linkmanController.findById(firm.getLinkmanid()));
        }
        return list;
    }
    @RequestMapping("down")
    public ResponseEntity<byte []> down() throws IOException {
        List<Firm> list=this.find(null);
        Workbook workbook=new XSSFWorkbook();
        Sheet rows=workbook.createSheet();
        Row row=rows.createRow(0);

        Cell firmnum=row.createCell(0);
        Cell firmname=row.createCell(1);
        Cell address=row.createCell(2);
        Cell business=row.createCell(3);
        Cell url=row.createCell(4);
        Cell openbank=row.createCell(5);
        Cell bankaccount=row.createCell(6);
        Cell paymentid=row.createCell(7);
        Cell firmgradeid=row.createCell(8);
        Cell managebrand=row.createCell(9);
        Cell firmtypeid=row.createCell(10);
        Cell linkmanid=row.createCell(11);
        Cell telephone=row.createCell(12);
        Cell phone=row.createCell(13);
        Cell email=row.createCell(14);
        Cell debttime=row.createCell(15);
        Cell remark=row.createCell(16);

        firmnum.setCellValue("厂商代码");
        firmname.setCellValue("厂商名称");
        address.setCellValue("地址");
        business.setCellValue("经营状况");
        url.setCellValue("网址");
        openbank.setCellValue("开户行");
        bankaccount.setCellValue("银行账号");
        paymentid.setCellValue("付款方式");
        firmgradeid.setCellValue("厂商等级");
        managebrand.setCellValue("经营品牌");
        firmtypeid.setCellValue("厂商类别");
        linkmanid.setCellValue("联系人");
        telephone.setCellValue("电话");
        phone.setCellValue("手机");
        email.setCellValue("Email");
        debttime.setCellValue("账期(天)");
        remark.setCellValue("备注");

        if(list!=null){
            for (int i=1;i<=list.size();i++){
                Firm firm=list.get(i-1);
                Row rowvalue=rows.createRow(i);
                Cell firmnumvalue=rowvalue.createCell(0);
                Cell firmnamevalue=rowvalue.createCell(1);
                Cell addressvalue=rowvalue.createCell(2);
                Cell businessvalue=rowvalue.createCell(3);
                Cell urlvalue=rowvalue.createCell(4);
                Cell openbankvalue=rowvalue.createCell(5);
                Cell bankaccountvalue=rowvalue.createCell(6);
                Cell paymentidvalue=rowvalue.createCell(7);
                Cell firmgradeidvalue=rowvalue.createCell(8);
                Cell managebrandvalue=rowvalue.createCell(9);
                Cell firmtypeidvalue=rowvalue.createCell(10);
                Cell linkmanidvalue=rowvalue.createCell(11);
                Cell telephonevalue=rowvalue.createCell(12);
                Cell phonevalue=rowvalue.createCell(13);
                Cell emailvalue=rowvalue.createCell(14);
                Cell debttimevalue=rowvalue.createCell(15);
                Cell remarkvalue=rowvalue.createCell(16);

                firmnumvalue.setCellValue(firm.getFirmnum());
                firmnamevalue.setCellValue(firm.getFirmname());
                addressvalue.setCellValue(firm.getAddress());
                businessvalue.setCellValue(firm.getBusiness());
                urlvalue.setCellValue(firm.getUrl());
                openbankvalue.setCellValue(firm.getOpenbank());
                bankaccountvalue.setCellValue(firm.getBankaccount());
                paymentidvalue.setCellValue(firm.getPayment().getPayment());
                firmgradeidvalue.setCellValue(firm.getFirmgrade().getFirmgrade());
                managebrandvalue.setCellValue(firm.getManagebrand());
                firmtypeidvalue.setCellValue(firm.getFirmtype().getFirmtype());
                linkmanidvalue.setCellValue(firm.getLinkman().getLinkman());
                telephonevalue.setCellValue(firm.getLinkman().getTelephone());
                phonevalue.setCellValue(firm.getLinkman().getPhone());
                emailvalue.setCellValue(firm.getLinkman().getEmail());
                debttimevalue.setCellValue(firm.getDebttime());
                remarkvalue.setCellValue(firm.getRemark());
            }
        }
        ByteArrayOutputStream stream=new ByteArrayOutputStream();
        workbook.write(stream);
        HttpHeaders headers=new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        String name=new String("厂商表.xlsx".getBytes("utf-8"),"iso-8859-1");
        headers.setContentDispositionFormData("attachment",name);
        return new ResponseEntity<byte[]>(stream.toByteArray(),headers, HttpStatus.OK);
    }

    @RequestMapping("findByText")
    public List<Firm> findByText(String text){
        QueryWrapper<Firm> wrapper=new QueryWrapper<>();
        wrapper.lambda().like(Firm::getFirmname,text);
        QueryWrapper<Linkman> linkmanQueryWrapper=new QueryWrapper<>();
        linkmanQueryWrapper.lambda().like(Linkman::getLinkman,text).or().like(Linkman::getPhone,text).or().like(Linkman::getTelephone,text);
        List<Integer> id= linkmanController.findId(linkmanQueryWrapper);
        wrapper.lambda().or().in(Firm::getLinkmanid,id);
        List<Firm> list= firmService.list(wrapper);
        for (Firm firm :
                list) {
            firm.setPayment(paymentController.findById(firm.getPaymentid()));
            firm.setFirmgrade(firmgradeController.findById(firm.getFirmgradeid()));
            firm.setFirmtype(firmtypeController.findById(firm.getFirmtypeid()));
            firm.setLinkman(linkmanController.findById(firm.getLinkmanid()));
        }
        return list;
    }
}

