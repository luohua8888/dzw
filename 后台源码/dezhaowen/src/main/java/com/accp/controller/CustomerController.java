package com.accp.controller;


import com.accp.domain.*;
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
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    ICustomerService service;
    @Autowired
    ICustomertypeService serv;
    @Autowired
    IYuangongziliaobiaoService ser;
    @Autowired
    ICarService cservice;
    @Autowired
    IFadongjipinpaibiaoService fservice;
    @Autowired
    ICaraffiliationService cservic;
    @Autowired
    IChexingdingyibiaoService chservice;
    @Autowired
    ICarbrandService carservice;
    @Autowired
    ICicompanyService ciservice;
    @Autowired
    IMlicompanyService mlservice;
    @Autowired
    IOiltypeService oservice;
    @Autowired
    IZuzhijiegoubiaoService zuzhiservice;
    @Autowired
    IYuangongziliaobiaoService ygservice;
    @Autowired
    IMlicompanyService mservice;
    @Autowired
    ICicompanyService cicservice;
    @Autowired
    IPlatenumberService plservice;
    @Autowired
    IZiduanService ziduanService;
    @Autowired
    ZiduanMapper ziduanMapper;

    @RequestMapping("/cus")
    public List<Customer> find(){
        List<Customer> list=service.list();
        for (Customer customer:list) {
            if (customer.getCustomertypeid()!=null){
                Integer id=Integer.valueOf(customer.getCustomertypeid());
                System.out.print(id);
                customer.setCustomertype(serv.getById(id));
            }
            if (customer.getCounselorid()!=null) {
                Integer yid=customer.getCounselorid();
                customer.setYuan(ser.getById(yid));
            }
        }
        return list;
    }
    @RequestMapping("/cuss")
    public List<Car> findBy(@RequestBody Customer customer){
        QueryWrapper<Car> query=new QueryWrapper<>();
        query.eq("customernum",customer.getCustomernum());
        List<Car> list=cservice.list(query);
        for (Car car:list) {
            car.setCarbrand(carservice.getById(car.getCarbrandid()));
            car.setChexingdingyibiao(chservice.getById(car.getCarbrandid()));
            car.setCaraffiliation(cservic.getById(car.getCaraffiliationid()));
            car.setFadongjipinpaibiao(fservice.getById(car.getEngineid()));
            car.setCicompany(ciservice.getById(car.getCicompanyid()));
            car.setMlicompany(mlservice.getById(car.getMlicompanyid()));
            car.setOiltype(oservice.getById(car.getOiltypeid()));
        }

        return list;
    }
    @RequestMapping("/cud")
    public List<Zuzhijiegoubiao> findBumen(){
        List<Zuzhijiegoubiao> list=zuzhiservice.list();
        return list;
    }
    @RequestMapping("/cuds/{zid}")
    public List<Yuangongziliaobiao> findyuan(@PathVariable("zid") Integer zid){
        QueryWrapper<Yuangongziliaobiao> query=new QueryWrapper<>();
        query.eq("bid",zid);
        List<Yuangongziliaobiao> list=ygservice.list(query);
        return list;
    }
    @RequestMapping("/insert")
    public Boolean insert(@RequestBody Customer customer){
        System.out.println(customer.getCounselorid());
        return service.save(customer);
    }
    @RequestMapping("/update")
    public Boolean update(@RequestBody Customer customer){
        System.out.println("ss");
        return service.updateById(customer);
    }
    @RequestMapping("/downloadExcel")
    public ResponseEntity<byte []> downloadExcel(Customer customer) throws IOException {
        QueryWrapper<Customer> query=new QueryWrapper<>();
        List<Customer> list=service.list();
        for (Customer customer1:list) {
            if (customer1.getCustomertypeid()!=null){
                Integer id=Integer.valueOf(customer1.getCustomertypeid());
                System.out.print(id);
                customer1.setCustomertype(serv.getById(id));
            }
            if (customer1.getCounselorid()!=null) {
                Integer yid=customer1.getCounselorid();
                customer1.setYuan(ser.getById(yid));
            }
        }

        Workbook book=new XSSFWorkbook();
        Sheet sheet=book.createSheet();
        Row rowTitle=sheet.createRow(0);
        Cell customerNum=rowTitle.createCell(0);
        Cell customerYname=rowTitle.createCell(1);
        Cell customerAddress=rowTitle.createCell(2);
        Cell customerLinkman=rowTitle.createCell(3);
        Cell customerPhone=rowTitle.createCell(4);
        Cell customerBirthday=rowTitle.createCell(5);
        Cell customertype=rowTitle.createCell(6);
        Cell customerNumber=rowTitle.createCell(7);
        Cell customerJointime=rowTitle.createCell(8);
        Cell customerOuttime=rowTitle.createCell(9);
        Cell customerRemark=rowTitle.createCell(10);
        Cell customerFiling=rowTitle.createCell(11);
        Cell customerCounselor=rowTitle.createCell(12);
        Cell customerYphonenumber=rowTitle.createCell(13);
        Cell customerPaytime=rowTitle.createCell(14);
        Cell customerPayment=rowTitle.createCell(15);
        Cell customerIntegral=rowTitle.createCell(16);
        Cell customerEarnest=rowTitle.createCell(17);
        Cell customerProvince=rowTitle.createCell(18);
        Cell customerCity=rowTitle.createCell(19);
        Cell customerArea=rowTitle.createCell(20);
        Cell customerPaytest=rowTitle.createCell(21);
        Cell customerRegisterphone=rowTitle.createCell(22);
        Cell customerDesportbank=rowTitle.createCell(23);
        Cell customerBankaccount=rowTitle.createCell(24);
        Cell customerRegisteraddress=rowTitle.createCell(25);
        Cell customerOtherone=rowTitle.createCell(26);
        Cell customerOthertwo=rowTitle.createCell(27);
        Cell customerOtherthree=rowTitle.createCell(28);
        Cell customerOtherfour=rowTitle.createCell(29);
        customerNum.setCellValue("客户编码");
        customerYname.setCellValue("客户名称");
        customerAddress.setCellValue("详细地址");
        customerLinkman.setCellValue("联系人");
        customerPhone.setCellValue("手机");
        customerBirthday.setCellValue("客户生日");
        customertype.setCellValue("客户类别");
        customerNumber.setCellValue("会员卡号");
        customerJointime.setCellValue("入会日期");
        customerOuttime.setCellValue("会员到期");
        customerRemark.setCellValue("备注");
        customerFiling.setCellValue("建档日期");
        customerCounselor.setCellValue("服务顾问");
        customerYphonenumber.setCellValue("业务员电话");
        customerPaytime.setCellValue("账期");
        customerPayment.setCellValue("挂账额度");
        customerIntegral.setCellValue("累计积分");
        customerEarnest.setCellValue("定金金额");
        customerProvince.setCellValue("客户省");
        customerCity.setCellValue("客户市");
        customerArea.setCellValue("客户区");
        customerPaytest.setCellValue("纳税人识别号");
        customerRegisterphone.setCellValue("注册电话");
        customerDesportbank.setCellValue("开户银行");
        customerBankaccount.setCellValue("银行账号");
        customerRegisteraddress.setCellValue("注册地址");
        customerOtherone.setCellValue("其他一");
        customerOthertwo.setCellValue("其他二");
        customerOtherthree.setCellValue("其他三");
        customerOtherfour.setCellValue("其他四");
        if(list!=null){
            for (int i=1;i<=list.size();i++){
                Customer c=list.get(i-1);
                Row rowValue=sheet.createRow(i);
                Cell customerValue=rowValue.createCell(0);
                Cell customerValueValue=rowValue.createCell(1);
                Cell customerAddressValue=rowValue.createCell(2);
                Cell customerLinkmanValue=rowValue.createCell(3);
                Cell customerPhoneValue=rowValue.createCell(4);
                Cell customerBirthdayValue=rowValue.createCell(5);
                Cell customertypeValue=rowValue.createCell(6);
                Cell customerNumberValue=rowValue.createCell(7);
                Cell customerJointimeValue=rowValue.createCell(8);
                Cell customerOuttimeValue=rowValue.createCell(9);
                Cell customerRemarkValue=rowValue.createCell(10);
                Cell customerFilingValue=rowValue.createCell(11);
                Cell customerCounselorValue=rowValue.createCell(12);
                Cell customerYphonenumberValue=rowValue.createCell(13);
                Cell customerPaytimeValue=rowValue.createCell(14);
                Cell customerPaymentValue=rowValue.createCell(15);
                Cell customerIntegralValue=rowValue.createCell(16);
                Cell customerEarnestValue=rowValue.createCell(17);
                Cell customerProvinceValue=rowValue.createCell(18);
                Cell customerCityValue=rowValue.createCell(19);
                Cell customerAreaValue=rowValue.createCell(20);
                Cell customerPaytestValue=rowValue.createCell(21);
                Cell customerRegisterphoneValue=rowValue.createCell(22);
                Cell customerDesportbankValue=rowValue.createCell(23);
                Cell customerBankaccountValue=rowValue.createCell(24);
                Cell customerRegisteraddressValue=rowValue.createCell(25);
                Cell customerOtheroneValue=rowValue.createCell(26);
                Cell customerOthertwoValue=rowValue.createCell(27);
                Cell customerOtherthreeValue=rowValue.createCell(28);
                Cell customerOtherfourValue=rowValue.createCell(29);
                customerValue.setCellValue(c.getCustomernum());
                customerValueValue.setCellValue(c.getCustomername());
                customerAddressValue.setCellValue(c.getCustomeraddress());
                customerLinkmanValue.setCellValue(c.getLinkman());
                customerPhoneValue.setCellValue(c.getPhone());
                customerBirthdayValue.setCellValue(c.getBirthday());
                if(c.getCustomertype()!=null){
                    customertypeValue.setCellValue(c.getCustomertype().getCustomertype());
                }else{
                    customertypeValue.setCellValue("");
                }
                customerNumberValue.setCellValue(c.getCustomernumber());
                customerJointimeValue.setCellValue(c.getJointime());
                customerOuttimeValue.setCellValue(c.getOuttime());
                customerRemarkValue.setCellValue(c.getRemark());
                customerFilingValue.setCellValue(c.getFiling());
                if(c.getYuan()!=null){
                    customerCounselorValue.setCellValue(c.getYuan().getYname());
                }else{
                    customerCounselorValue.setCellValue("");
                }
                if(c.getYuan()!=null){
                    customerYphonenumberValue.setCellValue(c.getYuan().getYphonenumber());
                }else{
                    customerYphonenumberValue.setCellValue("");
                }
                if(c.getPaytime()!=null){
                    customerPaytimeValue.setCellValue(c.getPaytime());
                }else{
                    customerPaytimeValue.setCellValue("");
                }
                if(c.getPayment()!=null){
                    customerPaymentValue.setCellValue(c.getPayment());
                }else{
                    customerPaymentValue.setCellValue("");
                }
                if(c.getIntegral()!=null){
                    customerIntegralValue.setCellValue(c.getIntegral());
                }else{
                    customerIntegralValue.setCellValue("");
                }
                if(c.getEarnest()!=null){
                    customerEarnestValue.setCellValue(c.getEarnest());
                }else{
                    customerEarnestValue.setCellValue("");
                }
                customerProvinceValue.setCellValue("省");
                customerCityValue.setCellValue("市");
                customerAreaValue.setCellValue("区");
                if(c.getPaytest()!=null){
                    customerPaytestValue.setCellValue(c.getPaytest());
                }else{
                    customerPaytestValue.setCellValue("");
                }
                if(c.getRegisterphone()!=null){
                    customerRegisterphoneValue.setCellValue(c.getRegisterphone());
                }else{
                    customerRegisterphoneValue.setCellValue("");
                }
                if(c.getDesportbank()!=null){
                    customerDesportbankValue.setCellValue(c.getDesportbank());
                }else{
                    customerDesportbankValue.setCellValue("");
                }
                if(c.getBankaccount()!=null){
                    customerBankaccountValue.setCellValue(c.getBankaccount());
                }else{
                    customerBankaccountValue.setCellValue("");
                }
                if(c.getRegisteraddress()!=null){
                    customerRegisteraddressValue.setCellValue(c.getRegisteraddress());
                }else{
                    customerRegisteraddressValue.setCellValue("");
                }
                if(c.getOtherone()!=null){
                    customerOtheroneValue.setCellValue(c.getOtherone());
                }else{
                    customerOtheroneValue.setCellValue("");
                }
                if(c.getOthertwo()!=null){
                    customerOthertwoValue.setCellValue(c.getOthertwo());
                }else{
                    customerOthertwoValue.setCellValue("");
                }
                if(c.getOtherthree()!=null){
                    customerOtherthreeValue.setCellValue(c.getOtherthree());
                }else{
                    customerOtherthreeValue.setCellValue("");
                }
                if(c.getOtherfour()!=null){
                    customerOtherfourValue.setCellValue(c.getOtherfour());
                }else{
                    customerOtherfourValue.setCellValue("");
                }
            }
        }
        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        book.write(byteArrayOutputStream);
        HttpHeaders headers=new HttpHeaders();
        //设置响应内容为文件流模式
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        String fileName=new String("顾客导出数据".getBytes("utf-8"),"iso-8859-1");
        headers.setContentDispositionFormData("attachment",fileName);
        return new ResponseEntity(byteArrayOutputStream.toByteArray(),headers, HttpStatus.OK);
    }
    @RequestMapping("/jqx")
    public List<Mlicompany> findM(){
        return mservice.list();
    }
    @RequestMapping("/syx")
    public List<Cicompany> findCi(){
        return cicservice.list();
    }
    @RequestMapping("/fdj")
    public  List<Fadongjipinpaibiao> findfa(){
        return fservice.list();
    }
    @RequestMapping("/clgs")
    public List<Caraffiliation> findcara(){
        return cservic.list();
    }
    @RequestMapping("/p")
    public List<Platenumber> findPla(){
        return plservice.list();
    }
    @RequestMapping("/clgd")
    public Boolean inss(@RequestBody Customer customer){
        return service.save(customer);
    }
    @RequestMapping("/clgy")
    public Boolean insd(Car car){
        System.out.println(car);
        return cservice.save(car);
    }
    @RequestMapping("/ryl")
    public  List<Oiltype> findoil(){
        return oservice.list();
    }
    @RequestMapping("/op")
    public  List<Customer> findcus(){
        return service.list();
    }
    @RequestMapping("/cbc")
    public  Boolean insertCar(@RequestBody Car car){
        return cservice.updateById(car);
    }
    @RequestMapping("/sada")
    public List<Ziduan> findziduan(){
        return ziduanService.list();
    }
    @RequestMapping("/cxzd")
    public  List<Ziduan> findzid(){
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
    @RequestMapping("/ddd")
    public  Boolean uzzz( Car car){
        System.out.println(car);
        return cservice.save(car);
    }
    @RequestMapping("/remove/{customernum}")
    public  Boolean remove(@PathVariable("customernum") String customernum){

        return service.removeById(customernum);
    }
}

