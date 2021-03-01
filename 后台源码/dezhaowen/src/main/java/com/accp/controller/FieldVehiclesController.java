package com.accp.controller;


import com.accp.domain.FieldVehicles;
import com.accp.domain.FieldVehicles;
import com.accp.service.impl.FieldVehiclesServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
@RequestMapping("/fieldVehicles")
public class FieldVehiclesController {
    @Autowired
    FieldVehiclesServiceImpl service;
    @Autowired
    MaintenanceTeamController teamController;

    @RequestMapping("find")
    public List<FieldVehicles> find(){
        List<FieldVehicles> vehiclesList=service.list();
        for (FieldVehicles v:
                vehiclesList) {
            v.setMaintenanceTeam(teamController.findByTid(v.getTeamid()));
        }
        return vehiclesList;
    }
    @RequestMapping("save")
    public int save(@RequestBody FieldVehicles fieldVehicles) {
        int count = 0;
        QueryWrapper<FieldVehicles> wrapper = new QueryWrapper<FieldVehicles>();
        wrapper.lambda().eq(FieldVehicles::getCarnumber, fieldVehicles.getCarnumber());
        if (fieldVehicles.getCarnumber().equals(fieldVehicles.getRecarnumber())||service.count(wrapper) == 0) {
            boolean bool;
            if (fieldVehicles.getRecarnumber() != null) {
                wrapper.clear();
                wrapper.lambda().eq(FieldVehicles::getCarnumber, fieldVehicles.getRecarnumber());
                bool = service.update(fieldVehicles, wrapper);
            } else {
                bool = service.save(fieldVehicles);
            }
            return  count =bool ? 1 : 0;
        } else {
            return -1;
        }
    }

    @RequestMapping("del")
    public boolean del(String recarnumber){
        QueryWrapper<FieldVehicles> wrapper = new QueryWrapper<FieldVehicles>();
        wrapper.lambda().eq(FieldVehicles::getCarnumber,recarnumber);
        return service.remove(wrapper);
    }
}

