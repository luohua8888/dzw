package com.accp.controller;


import com.accp.domain.MaintenanceTeamClassification;
import com.accp.domain.TechnicianLevel;
import com.accp.service.IMaintenanceTeamClassificationService;
import com.accp.service.impl.MaintenanceTeamClassificationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ytang
 * @since 2021-01-27
 */
@RestController
@RequestMapping("/maintenanceTeamClassification")
public class MaintenanceTeamClassificationController {
    @Autowired
    MaintenanceTeamClassificationServiceImpl service;
    @Autowired
    MaintenanceTeamController teamController;

    @RequestMapping("find")
    public List<MaintenanceTeamClassification> find() {
        List<MaintenanceTeamClassification> list = new ArrayList<MaintenanceTeamClassification>();
        list = service.list();
        for (MaintenanceTeamClassification classification : list) {
            classification.setList(teamController.findByCid(classification.getClassificationid()));
        }
        return list;
    }
}

