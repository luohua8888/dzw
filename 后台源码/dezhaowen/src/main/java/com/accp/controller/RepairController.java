package com.accp.controller;


import com.accp.domain.*;
import com.accp.mapper.CarMapper;
import com.accp.mapper.CompletedMapper;
import com.accp.mapper.RepairMapper;
import com.accp.service.*;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
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
@RequestMapping("/repair")
public class RepairController {
    @Autowired
    RepairMapper repairMapper;
    @Autowired
    ICarService carService;
    @Autowired
    CarMapper carMapper;
    @Autowired
    IRepairService repairService;
    @Autowired
    IYuangongziliaobiaoService yuangongziliaobiaoService;
    @Autowired
    IWeixiubiaoService  weixiubiaoService;
    @Autowired
    IMaintenanceTeamService maintenanceTeamService;
    @Autowired
    IItemRepairService itemRepairService;
    @Autowired
    IGooddataService gooddataService;
    @Autowired
    IGetgoodService getgoodService;
    @Autowired
    IEwitemService ewitemService;
    @Autowired
    IRescueService rescueService;
    @Autowired
    CompletedMapper comMapper;
    @Autowired
    ICompletedService completedService;
    //`item_repair`.wjid修改为varchar(20)

    @RequestMapping("/rollBackRepair")
    @ResponseBody
    public int rollBackRepair(String number){
        Repair repair=new Repair();
        repair.setStatus("进行中");
        repair.setNumber(number);
        int a;
        if(repairService.updateById(repair)){
            a=1;
        }else{
            a=0;
        }
        return a;
    }
    @RequestMapping("/queryCom")
    @ResponseBody
    public int queryCom(String number){
        QueryWrapper qw=new QueryWrapper<Completed>();
        qw.eq("wjid",number);
        List<Completed> list=completedService.list(qw);
        if(list.size()==0) {
            return 0;
        }else {
            return list.get(0).getCount();
        }

    }
    @RequestMapping("/addCom")
    @ResponseBody
    public int queryCom(@RequestBody Completed com){
        Repair repair=new Repair();
        if(com.getYesOrno()==1) {

            String date1=com.getNowtime().toString();
            String date2;
            if(com.getPredicttime()!=null) {
                date2=com.getPredicttime().toString();
            }else {
                Date date=new Date();
                date2=date.toString();
            }
            int dd=date1.compareTo(date2);
            System.out.println("时间比较"+dd);
            if(dd>0) {
                repair.setStatus("超时完工");
                repair.setNumber(com.getWjid());
                repair.setNowworkDate(com.getNowtime());
                repairService.updateById(repair);

            }else {
                repair.setStatus("完工");
                repair.setNumber(com.getWjid());
                repair.setNowworkDate(com.getNowtime());
                repairService.updateById(repair);
            }
            QueryWrapper qw=new QueryWrapper<Completed>();
            qw.eq("wjid",com.getWjid());
            completedService.remove(qw);
            completedService.save(com);
        }else {
            QueryWrapper qw=new QueryWrapper<Completed>();
            qw.eq("wjid",com.getWjid());
            completedService.remove(qw);
            completedService.save(com);
        }
        return 0;
    }
    @RequestMapping("/queryEwitem")
    @ResponseBody
    public List<Ewitem> queryEwitem(String number){
        QueryWrapper qw=new QueryWrapper<Ewitem>();
        qw.eq("repairid",number);
        return ewitemService.list(qw);
    }
    @RequestMapping("/queryItemRepair")
    @ResponseBody
    public List<QueryItemRepair> queryItemRepair(String tab,String number){

        return repairMapper.queryItemRepair(tab,number);
    }
    @RequestMapping("/queryGetGoods")
    @ResponseBody
    public List<QueryGetGoods> queryGetGoods(String tab,String number){

        return repairMapper.queryGetGoods(tab,number);
    }
    @RequestMapping("/queryRepair")
    @ResponseBody
    public Repair queryRepair(String number){

        return repairService.getById(number);
    }
    @RequestMapping("/selectJunGong")
    @ResponseBody
    public List<JunGong> selectJunGong(String tj,String date1,String date2,String number,String carnumber,String carnumber1){
        return comMapper.selectJunGong(tj, date1, date2, number, carnumber, carnumber1);
    }
    @RequestMapping("/addRescue")
    @ResponseBody
    public boolean addRescue(@RequestBody Rescue rescue){
        rescue.setWorktime(rescue.getNowdate());
//        repair.setFault(repair.getState());
//        repair.setFaultreasult(repair.getState());
//        repair.setOrderTime(repair.getBefor());
        return rescueService.save(rescue);
    }
    @RequestMapping("/selectRepairItem")
    @ResponseBody
    public List<MaintainHistary> selectRepairItem(String type,String content){

        return repairMapper.selectRepairItem(type,content);
    }
    @RequestMapping("/addEwitem")
    @ResponseBody
    public int addEwitem(@RequestBody List<Ewitem> list){
        for (int i = 0; i < list.size(); i++) {
            ewitemService.save(list.get(i));
        }
        return 1;
    }
    @RequestMapping("/addGetgood")
    @ResponseBody
    public int addGetgood(@RequestBody List<Getgood> list){
        for (int i = 0; i < list.size(); i++) {
            getgoodService.save(list.get(i));
        }
        return 1;
    }
    @RequestMapping("/selectGoodById")
    @ResponseBody
    public Gooddata selectGoodById(String id){

        return gooddataService.getById(id);
    }
    @RequestMapping("/selectAllCommodity")
    @ResponseBody
    public List<Gooddata> selectAllCommodity(){

        return gooddataService.list();
    }
    @RequestMapping("/addItemRepair")
    @ResponseBody
    public int addItemRepair(@RequestBody List<ItemRepair> list){
        for (int i = 0; i < list.size(); i++) {
            itemRepairService.save(list.get(i));
        }
        return 1;
    }
    @RequestMapping("/selectAll")
    @ResponseBody
    public List<MaintenanceTeam> selectAll(){
        return maintenanceTeamService.list();
    }
    @RequestMapping("/selectById")
    @ResponseBody
    public Weixiubiao selectById(Integer id){

        return weixiubiaoService.getById(id);
    }
    @RequestMapping("/selectAllItem")
    @ResponseBody
    public List<Weixiubiao> selectAllItem(){

        return weixiubiaoService.list();
    }
    @RequestMapping("/selectAllStaff")
    @ResponseBody
    public List<Yuangongziliaobiao> selectAllStaff() {

        return yuangongziliaobiaoService.list();
    }
    @RequestMapping("/addRepair")
    @ResponseBody
    public Boolean addRepair(@RequestBody Repair repair){
        System.out.println(repair);
        repair.setFault(repair.getState());
        repair.setFaultreasult(repair.getState());
        repair.setOrderTime(repair.getBefor());
        return repairService.save(repair);
    }
    @RequestMapping("/selectCarInfo")
    @ResponseBody
    public Carinfo selectCarinfo(String carNumber){
        System.out.println("车牌号"+carNumber);
        return carMapper.selectCarInfo(carNumber);
    }
    @RequestMapping("/selectClientAndCar")
    @ResponseBody
    public ClientAndCar selectClientAndCar(String carnumber){
        System.out.println(carnumber);
        return carMapper.selectClientAndCar(carnumber);
    }
    @RequestMapping("/selectAllCar")
    @ResponseBody
    public List<Car> selectAllCar(){

        return carService.list();
    }
    @RequestMapping("/selectRepairAndRescue")
    @ResponseBody
    public List<Repair> selectRepairAndResuce(String type, String content, String cpc){
        return  repairMapper.selectRepairAndRescue(type,content,cpc);
    }

    @RequestMapping("/selectHistary")
    @ResponseBody
    public List<MaintainHistary> selectHistary(String type, String content){
        System.out.println(type);
        return repairMapper.selectHistray(type, content);
    }
}

