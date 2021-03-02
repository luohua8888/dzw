package com.accp.controller;


import com.accp.domain.Car;
import com.accp.domain.Customer;
import com.accp.domain.Ziduan;
import com.accp.domain.Ziduan;
import com.accp.mapper.ZiduanMapper;
import com.accp.service.*;
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
 * @author yy
 * @since 2021-02-22
 */
@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    ICarService carService;
    @Autowired
    ICarbrandService carbrandService;
    @Autowired
    IChexingdingyibiaoService chexingdingyibiaoService;
    @Autowired
    IFadongjipinpaibiaoService fadongjipinpaibiaoService;
    @Autowired
    ICicompanyService cicompanyService;
    @Autowired
    IMlicompanyService mlicompanyService;
    @Autowired
    IOiltypeService oiltypeService;
    @Autowired
    ICaraffiliationService caraffiliationService;
    @Autowired
    ICustomerService customerService;
    @Autowired
    ICustomertypeService customertypeService;
    @Autowired
    IYuangongziliaobiaoService yuangongziliaobiaoService;
    @Autowired
    IZiduanService ziduanService;
    @Autowired
    ZiduanMapper ziduanMapper;

    @RequestMapping("/find")
    public List<Car> find(){
        List<Car> list=carService.list();
        for (Car car:list) {
            car.setCarbrand(carbrandService.getById(car.getCarbrandid()));
            car.setChexingdingyibiao(chexingdingyibiaoService.getById(car.getCarbrandid()));
            car.setCaraffiliation(caraffiliationService.getById(car.getCaraffiliationid()));
            car.setFadongjipinpaibiao(fadongjipinpaibiaoService.getById(car.getEngineid()));
            car.setCicompany(cicompanyService.getById(car.getCicompanyid()));
            car.setMlicompany(mlicompanyService.getById(car.getMlicompanyid()));
            car.setOiltype(oiltypeService.getById(car.getOiltypeid()));
        }
        return  list;
    }
    @RequestMapping("/finc")
    public  List<Customer> finc(@RequestBody Car car){
        QueryWrapper<Customer> query=new QueryWrapper<>();
        query.eq("customernum",car.getCustomernum());
        List<Customer> list=customerService.list(query);
        for (Customer customer:list) {
            if (customer.getCustomertypeid()!=null){
                Integer id=Integer.valueOf(customer.getCustomertypeid());
                System.out.print(id);
                customer.setCustomertype(customertypeService.getById(id));
            }
            if (customer.getCounselorid()!=null) {
                Integer yid=customer.getCounselorid();
                customer.setYuan(yuangongziliaobiaoService.getById(yid));
            }

        }
        return list;
    }
    @RequestMapping("/downloadExcel")
    public ResponseEntity<byte []> downloadExcel(Car car) throws IOException {
        QueryWrapper<Car> query=new QueryWrapper<>();
        List<Car> list=carService.list();
        for (Car car1:list) {
            car1.setCarbrand(carbrandService.getById(car.getCarbrandid()));
            car1.setChexingdingyibiao(chexingdingyibiaoService.getById(car.getCarbrandid()));
            car1.setCaraffiliation(caraffiliationService.getById(car.getCaraffiliationid()));
            car1.setFadongjipinpaibiao(fadongjipinpaibiaoService.getById(car.getEngineid()));
            car1.setCicompany(cicompanyService.getById(car.getCicompanyid()));
            car1.setMlicompany(mlicompanyService.getById(car.getMlicompanyid()));
            car1.setOiltype(oiltypeService.getById(car.getOiltypeid()));
            System.out.println("品牌"+car1);
        }

        Workbook book=new XSSFWorkbook();
        Sheet sheet=book.createSheet();
        Row rowTitle=sheet.createRow(0);
        Cell carnum=rowTitle.createCell(0);
        Cell carpp=rowTitle.createCell(1);
        Cell clxh=rowTitle.createCell(2);
        Cell cardriver=rowTitle.createCell(3);
        Cell cardriverphone=rowTitle.createCell(4);
        Cell carbirthday=rowTitle.createCell(5);
        Cell cargs=rowTitle.createCell(6);
        Cell carjz=rowTitle.createCell(7);
        Cell carcj=rowTitle.createCell(8);
        Cell carfdj=rowTitle.createCell(9);
        Cell fdjpp=rowTitle.createCell(10);
        Cell clnk=rowTitle.createCell(11);
        Cell lc=rowTitle.createCell(12);
        Cell zz=rowTitle.createCell(13);
        Cell cx=rowTitle.createCell(14);
        Cell gmrq=rowTitle.createCell(15);
        Cell sprq=rowTitle.createCell(16);
        Cell cjdq=rowTitle.createCell(17);
        Cell jqx=rowTitle.createCell(18);
        Cell jqxdq=rowTitle.createCell(19);
        Cell sy=rowTitle.createCell(20);
        Cell sydq=rowTitle.createCell(21);
        Cell wotou=rowTitle.createCell(22);
        Cell ewrq=rowTitle.createCell(23);
        Cell rylb=rowTitle.createCell(24);
        Cell xclc=rowTitle.createCell(25);
        Cell xcby=rowTitle.createCell(26);
        Cell hym=rowTitle.createCell(27);
        carnum.setCellValue("车牌号码");
        carpp.setCellValue("车辆品牌");
        clxh.setCellValue("车辆型号");
        cardriver.setCellValue("驾驶员");
        cardriverphone.setCellValue("驾驶员电话");
        carbirthday.setCellValue("出生日期");
        cargs.setCellValue("车辆归属");
        carjz.setCellValue("驾证到期");
        carcj.setCellValue("车架号");
        carfdj.setCellValue("发动机号");
        fdjpp.setCellValue("发动机品牌号");
        clnk.setCellValue("车辆年款");
        lc.setCellValue("里程");
        zz.setCellValue("载重");
        cx.setCellValue("车系");
        gmrq.setCellValue("购买日期");
        sprq.setCellValue("上牌日期");
        cjdq.setCellValue("车检到期");
        jqx.setCellValue("交强险保险公司");
        jqxdq.setCellValue("交强险到期");
        sy.setCellValue("商业保险公司");
        sydq.setCellValue("商业险到期");
        wotou.setCellValue("在我投保投车");
        ewrq.setCellValue("二维日期");
        rylb.setCellValue("燃油类别");
        xclc.setCellValue("下次保养里程");
        xcby.setCellValue("下次保养日期");
        hym.setCellValue("会员码");
        if(list!=null){
            for (int i=1;i<=list.size();i++){
                Car c=list.get(i-1);
                Row rowValue=sheet.createRow(i);
                Cell carnumv=rowValue.createCell(0);
                Cell carppv=rowValue.createCell(1);
                Cell clxhv=rowValue.createCell(2);
                Cell cardriverv=rowValue.createCell(3);
                Cell cardriverphonev=rowValue.createCell(4);
                Cell carbirthdayv=rowValue.createCell(5);
                Cell cargsv=rowValue.createCell(6);
                Cell carjzv=rowValue.createCell(7);
                Cell carcjv=rowValue.createCell(8);
                Cell carfdjv=rowValue.createCell(9);
                Cell fdjppv=rowValue.createCell(10);
                Cell clnkv=rowValue.createCell(11);
                Cell lcv=rowValue.createCell(12);
                Cell zzv=rowValue.createCell(13);
                Cell cxv=rowValue.createCell(14);
                Cell gmrqv=rowValue.createCell(15);
                Cell sprqv=rowValue.createCell(16);
                Cell cjdqv=rowValue.createCell(17);
                Cell jqxv=rowValue.createCell(18);
                Cell jqxdqv=rowValue.createCell(19);
                Cell syv=rowValue.createCell(20);
                Cell sydqv=rowValue.createCell(21);
                Cell wotouv=rowValue.createCell(22);
                Cell ewrqv=rowValue.createCell(23);
                Cell rylbv=rowValue.createCell(24);
                Cell xclcv=rowValue.createCell(25);
                Cell xcbyv=rowValue.createCell(26);
                Cell hymv=rowValue.createCell(27);
                if(c.getPlatename()!=null){
                    carnumv.setCellValue(c.getPlatename());
                }else{
                    carnumv.setCellValue("");
                }
                if(c.getCarbrand()!=null){
                    carppv.setCellValue(c.getCarbrand().getBrandname());
                }else{
                    carppv.setCellValue("");
                }

                clxhv.setCellValue("");
                if(c.getDriver()!=null){
                    cardriverv.setCellValue(c.getDriver());
                }else{
                    cardriverv.setCellValue("");
                }
                if(c.getDriverphone()!=null){
                    cardriverphonev.setCellValue(c.getDriverphone());
                }else{
                    cardriverphonev.setCellValue("");
                }
                if(c.getBirthday()!=null){
                    carbirthdayv.setCellValue(c.getBirthday());
                }else{
                    carbirthdayv.setCellValue("");
                }
                if(c.getCaraffiliation()!=null){
                    cargsv.setCellValue(c.getCaraffiliation().getCaraffiliation());
                }else{
                    cargsv.setCellValue("");
                }
                if(c.getDrivingouttime()!=null){
                    carjzv.setCellValue(c.getDrivingouttime());
                }else{
                    carjzv.setCellValue("");
                }
                if(c.getFramnum()!=null){
                    carcjv.setCellValue(c.getFramnum());
                }else{
                    carcjv.setCellValue("");
                }
                if(c.getEnginenum()!=null){
                    carfdjv.setCellValue(c.getEnginenum());
                }else{
                    carfdjv.setCellValue("");
                }
                if(c.getFadongjipinpaibiao()!=null){
                    fdjppv.setCellValue(c.getFadongjipinpaibiao().getFname());
                }else{
                    fdjppv.setCellValue("");
                }
                if(c.getCarnyear()!=null){
                    clnkv.setCellValue(c.getCarnyear());
                }else{
                    clnkv.setCellValue("");
                }

                if(c.getMileage()!=null){
                    lcv.setCellValue(c.getMileage());
                }else{
                    lcv.setCellValue("");
                }
                if(c.getLoad()!=null){
                    zzv.setCellValue(c.getLoad());
                }else{
                    zzv.setCellValue("");
                }
                if(c.getCarseries()!=null){
                    cxv.setCellValue(c.getCarseries());
                }else{
                    cxv.setCellValue("");
                }
                if(c.getBuytime()!=null){
                    gmrqv.setCellValue(c.getBuytime());
                }else{
                    gmrqv.setCellValue("");
                }
                if(c.getUptime()!=null){
                    sprqv.setCellValue(c.getUptime());
                }else{
                    sprqv.setCellValue("");
                }
                if(c.getCarouttime()!=null){
                    cjdqv.setCellValue(c.getCarouttime());
                }else{
                    cjdqv.setCellValue("");
                }
                if(c.getMlicompany()!=null){
                    jqxv.setCellValue(c.getMlicompany().getMlicompany());
                }else{
                    jqxv.setCellValue("");
                }
                if(c.getMliouttime()!=null){
                    jqxdqv.setCellValue(c.getMliouttime());
                }else{
                    jqxdqv.setCellValue("");
                }
                if(c.getCicompany()!=null){
                    syv.setCellValue(c.getCicompany().getCicompany());
                }else{
                    syv.setCellValue("");
                }
                if(c.getCiouttime()!=null){
                    sydqv.setCellValue(c.getCiouttime());
                }else{
                    sydqv.setCellValue("");
                }
                if(c.getMytoucar()!=null){
                    wotouv.setCellValue(c.getMytoucar());
                }else{
                    wotouv.setCellValue("");
                }
                if(c.getTwotime()!=null){
                    ewrqv.setCellValue(c.getTwotime());
                }else{
                    ewrqv.setCellValue("");
                }
                if(c.getOiltype()!=null){
                    rylbv.setCellValue(c.getOiltype().getOiltype());
                }else{
                    rylbv.setCellValue("");
                }
                if(c.getNextmileage()!=null){
                    xclcv.setCellValue(c.getNextmileage());
                }else{
                    xclcv.setCellValue("");
                }
                if(c.getNextupkeeptime()!=null){
                    xcbyv.setCellValue(c.getNextupkeeptime());
                }else{
                    xcbyv.setCellValue("");
                }
                if(c.getMembernum()!=null){
                    hymv.setCellValue(c.getMembernum());
                }else{
                    hymv.setCellValue("");
                }

            }
        }
        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        book.write(byteArrayOutputStream);
        HttpHeaders headers=new HttpHeaders();
        //设置响应内容为文件流模式
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        String fileName=new String("车辆导出数据".getBytes("utf-8"),"iso-8859-1");
        headers.setContentDispositionFormData("attachment",fileName);
        return new ResponseEntity(byteArrayOutputStream.toByteArray(),headers, HttpStatus.OK);
    }
    @RequestMapping("/sada")
    public List<Ziduan> findziduan(){
        return ziduanService.list();
    }
    @RequestMapping("/cxzd")
    public List<Ziduan> finaa(){
        QueryWrapper<Ziduan> query=new QueryWrapper<>();
        query.eq("display",1);
        return ziduanService.list(query);
    }
    @RequestMapping("/qdd")
    public Boolean upto(@RequestBody List<Integer> list){
        ziduanMapper.upda();
        for (Integer i:list) {
            ziduanMapper.upto(i);
        }
        return true;
    }
}

