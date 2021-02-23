package com.accp.controller;


import com.accp.domain.Repair;
import com.accp.mapper.RepairMapper;
import com.accp.service.IRepairService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @RequestMapping("/selectRepairAndRescue")
    @ResponseBody
    public List<Repair> selectRepairAndResuce(String type, String content, String cpc){
        return  repairMapper.selectRepairAndRescue(type,content,cpc);
    }
}

