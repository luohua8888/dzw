package com.accp.controller;


import com.accp.domain.MaintenanceTeam;
import com.accp.domain.MaintenanceTeamClassification;
import com.accp.domain.MaintenanceTeam;
import com.accp.service.IMaintenanceTeamService;
import com.accp.service.impl.MaintenanceTeamServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/maintenanceTeam")
public class MaintenanceTeamController {
    @Autowired
    MaintenanceTeamServiceImpl service;
    public List<MaintenanceTeam> findByCid(String classificationid){
        List<MaintenanceTeam> list = new ArrayList<MaintenanceTeam>();
        QueryWrapper<MaintenanceTeam> wrapper=new QueryWrapper<MaintenanceTeam>();
        wrapper.lambda().eq(MaintenanceTeam::getClassificationid,classificationid);
        if (service.count(wrapper) > 0) {
            list = service.list(wrapper);
        }
        return list;
    }
    public MaintenanceTeam findByTid(String teamid){
        QueryWrapper<MaintenanceTeam> wrapper=new QueryWrapper<MaintenanceTeam>();
        wrapper.lambda().eq(MaintenanceTeam::getTeamid,teamid);
        return service.getOne(wrapper);
    }
    @RequestMapping("save")
    public int save(MaintenanceTeam maintenanceTeam) {
        int count = 0;
        QueryWrapper<MaintenanceTeam> wrapper = new QueryWrapper<MaintenanceTeam>();
        wrapper.lambda().eq(MaintenanceTeam::getTeamid, maintenanceTeam.getTeamid());
        if (maintenanceTeam.getTeamid().equals(maintenanceTeam.getReteamid())||service.count(wrapper) == 0) {
            boolean bool;
            if (maintenanceTeam.getReteamid() != null) {
                wrapper.clear();
                wrapper.lambda().eq(MaintenanceTeam::getTeamid, maintenanceTeam.getReteamid());
                bool = service.update(maintenanceTeam, wrapper);
            } else {
                bool = service.save(maintenanceTeam);
            }
            return  count =bool ? 1 : 0;
        } else {
            return -1;
        }
    }

    @RequestMapping("del")
    public boolean del(String reteamid){
        QueryWrapper<MaintenanceTeam> wrapper = new QueryWrapper<MaintenanceTeam>();
        wrapper.lambda().eq(MaintenanceTeam::getTeamid,reteamid);
        return service.remove(wrapper);
    }
}

