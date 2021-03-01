package com.accp.controller;

import com.accp.domain.Car;
import com.accp.domain.Cashier;
import com.accp.domain.Repair;
import com.accp.service.impl.CarServiceImpl;
import com.accp.service.impl.CashierServiceImpl;
import com.accp.service.impl.RepairServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/settlementCenter")
public class JszxController {
    @Autowired
    RepairServiceImpl rs;
    @Autowired
    CashierServiceImpl cs;



    @RequestMapping("/selectSettleAccounts")
    public List<Repair> selectSettleAccounts(String number,String platename,String startkd,String endkd){
        List<Repair> list = rs.selectSettleAccounts2(number,platename,startkd,endkd);
        return list;
    }

    // 新增结账
    @PostMapping("/addCashier")
    @ResponseBody
    public Integer addCashier(@RequestBody Cashier record) {
        return cs.addCashier(record);
    }

    @RequestMapping("/selectFinished")
    public List<Repair> selectFinished(){
        List<Cashier> clist=cs.selectAllInfo();
        List<Repair> rlist=rs.selectSettleAccounts();
        List<Repair> lastlist=new ArrayList<Repair>();
        for(int i=0;i<rlist.size();i++) {
            for(int j=0;j<clist.size();j++) {
                if(rlist.get(i).getNumber().equals(clist.get(j).getNumber())) {
                    lastlist.add(rlist.get(i));
                    break;
                }
            }
        }
        for(int i=0;i<lastlist.size();i++) {
            if(i==0) {
                lastlist.get(i).setCheck(true);
            }else {
                lastlist.get(i).setCheck(false);
            }
        }
        return lastlist;
    }

    @RequestMapping("/selectUnfinished")
    public List<Repair> selectUnfinished(){
        List<Cashier> clist=cs.selectAllInfo();
        List<Repair> rlist=rs.selectSettleAccounts();
        List<Repair> lastlist=new ArrayList<Repair>();
        for(int i=0;i<rlist.size();i++) {
            for(int j=0;j<clist.size();j++) {
                if(rlist.get(i).getNumber().equals(clist.get(j).getNumber())) {
                    break;
                }
                if(j==clist.size()-1) {
                    lastlist.add(rlist.get(i));
                }
            }
        }
        for(int i=0;i<lastlist.size();i++) {
            if(i==0) {
                lastlist.get(i).setCheck(true);
            }else {
                lastlist.get(i).setCheck(false);
            }
        }
        return lastlist;
    }

    @RequestMapping("/selectdjlxwx")
    public List<Repair> selectdjlxwx(){
        List<Cashier> clist=cs.selectAllInfo();
        List<Repair> rlist=rs.selectSettleAccounts();
        List<Repair> lastlist=new ArrayList<Repair>();
        for(int i=0;i<rlist.size();i++) {
            for(int j=0;j<clist.size();j++) {
                if(rlist.get(i).getWtype().equals("维修")) {
                    lastlist.add(rlist.get(i));
                    break;
                }
            }
        }
        for(int i=0;i<lastlist.size();i++) {
            if(i==0) {
                lastlist.get(i).setCheck(true);
            }else {
                lastlist.get(i).setCheck(false);
            }
        }
        return lastlist;
    }

    @RequestMapping("/selectdjlxjy")
    public List<Repair> selectdjlxjy(){
        List<Cashier> clist=cs.selectAllInfo();
        List<Repair> rlist=rs.selectSettleAccounts();
        List<Repair> lastlist=new ArrayList<Repair>();
        for(int i=0;i<rlist.size();i++) {
            for(int j=0;j<clist.size();j++) {
                if(rlist.get(i).getWtype().equals("救援")) {
                    lastlist.add(rlist.get(i));
                    break;
                }
            }
        }
        for(int i=0;i<lastlist.size();i++) {
            if(i==0) {
                lastlist.get(i).setCheck(true);
            }else {
                lastlist.get(i).setCheck(false);
            }
        }
        return lastlist;
    }

    @RequestMapping("/selectywlx")
    public List<Repair> selectywlx(){
        List<Cashier> clist=cs.selectAllInfo();
        List<Repair> rlist=rs.selectSettleAccounts();
        List<Repair> lastlist=new ArrayList<Repair>();
        for(int i=0;i<rlist.size();i++) {
            for(int j=0;j<clist.size();j++) {
                if(rlist.get(i).getCarbrandname().equals("中国重汽")) {
                    lastlist.add(rlist.get(i));
                    break;
                }
            }
        }
        for(int i=0;i<lastlist.size();i++) {
            if(i==0) {
                lastlist.get(i).setCheck(true);
            }else {
                lastlist.get(i).setCheck(false);
            }
        }
        return lastlist;
    }

    @RequestMapping("/selectywlx2")
    public List<Repair> selectywlx2(){
        List<Cashier> clist=cs.selectAllInfo();
        List<Repair> rlist=rs.selectSettleAccounts();
        List<Repair> lastlist=new ArrayList<Repair>();
        for(int i=0;i<rlist.size();i++) {
            for(int j=0;j<clist.size();j++) {
                if(rlist.get(i).getCarbrandname().equals("陕汽重卡")) {
                    lastlist.add(rlist.get(i));
                    break;
                }
            }
        }
        for(int i=0;i<lastlist.size();i++) {
            if(i==0) {
                lastlist.get(i).setCheck(true);
            }else {
                lastlist.get(i).setCheck(false);
            }
        }
        return lastlist;
    }

    @RequestMapping("/selectywlx3")
    public List<Repair> selectywlx3(){
        List<Cashier> clist=cs.selectAllInfo();
        List<Repair> rlist=rs.selectSettleAccounts();
        List<Repair> lastlist=new ArrayList<Repair>();
        for(int i=0;i<rlist.size();i++) {
            for(int j=0;j<clist.size();j++) {
                if(rlist.get(i).getCarbrandname().equals("中国一汽")) {
                    lastlist.add(rlist.get(i));
                    break;
                }
            }
        }
        for(int i=0;i<lastlist.size();i++) {
            if(i==0) {
                lastlist.get(i).setCheck(true);
            }else {
                lastlist.get(i).setCheck(false);
            }
        }
        return lastlist;
    }

    @RequestMapping("/selectywlx4")
    public List<Repair> selectywlx4(){
        List<Cashier> clist=cs.selectAllInfo();
        List<Repair> rlist=rs.selectSettleAccounts();
        List<Repair> lastlist=new ArrayList<Repair>();
        for(int i=0;i<rlist.size();i++) {
            for(int j=0;j<clist.size();j++) {
                if(rlist.get(i).getCarbrandname().equals("上汽红岩")) {
                    lastlist.add(rlist.get(i));
                    break;
                }
            }
        }
        for(int i=0;i<lastlist.size();i++) {
            if(i==0) {
                lastlist.get(i).setCheck(true);
            }else {
                lastlist.get(i).setCheck(false);
            }
        }
        return lastlist;
    }

    @RequestMapping("/selectywlx5")
    public List<Repair> selectywlx5(){
        List<Cashier> clist=cs.selectAllInfo();
        List<Repair> rlist=rs.selectSettleAccounts();
        List<Repair> lastlist=new ArrayList<Repair>();
        for(int i=0;i<rlist.size();i++) {
            for(int j=0;j<clist.size();j++) {
                if(rlist.get(i).getCarbrandname().equals("其他重型车")) {
                    lastlist.add(rlist.get(i));
                    break;
                }
            }
        }
        for(int i=0;i<lastlist.size();i++) {
            if(i==0) {
                lastlist.get(i).setCheck(true);
            }else {
                lastlist.get(i).setCheck(false);
            }
        }
        return lastlist;
    }

    @RequestMapping("/selectywlx6")
    public List<Repair> selectywlx6(){
        List<Cashier> clist=cs.selectAllInfo();
        List<Repair> rlist=rs.selectSettleAccounts();
        List<Repair> lastlist=new ArrayList<Repair>();
        for(int i=0;i<rlist.size();i++) {
            for(int j=0;j<clist.size();j++) {
                if(rlist.get(i).getCarbrandname().equals("中轻型车")) {
                    lastlist.add(rlist.get(i));
                    break;
                }
            }
        }
        for(int i=0;i<lastlist.size();i++) {
            if(i==0) {
                lastlist.get(i).setCheck(true);
            }else {
                lastlist.get(i).setCheck(false);
            }
        }
        return lastlist;
    }

    @RequestMapping("/selectywlx7")
    public List<Repair> selectywlx7(){
        List<Cashier> clist=cs.selectAllInfo();
        List<Repair> rlist=rs.selectSettleAccounts();
        List<Repair> lastlist=new ArrayList<Repair>();
        for(int i=0;i<rlist.size();i++) {
            for(int j=0;j<clist.size();j++) {
                if(rlist.get(i).getCarbrandname().equals("其他")) {
                    lastlist.add(rlist.get(i));
                    break;
                }
            }
        }
        for(int i=0;i<lastlist.size();i++) {
            if(i==0) {
                lastlist.get(i).setCheck(true);
            }else {
                lastlist.get(i).setCheck(false);
            }
        }
        return lastlist;
    }

}
