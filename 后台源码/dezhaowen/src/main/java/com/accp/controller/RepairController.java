package com.accp.controller;


import com.accp.domain.*;
import com.accp.mapper.CarMapper;
import com.accp.mapper.RepairMapper;
import com.accp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
    //`item_repair`.wjid修改为varchar(20)

    @RequestMapping("/selectRepairItem")
    @ResponseBody
    public List<MaintainHistary> selectRepairItem(String type,String content){

        return repairService.selectRepairItem(type, content);
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

