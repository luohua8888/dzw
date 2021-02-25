package com.accp.controller;


import com.accp.domain.TechnicianLevel;
import com.accp.service.ITechnicianLevelService;
import com.accp.service.impl.TechnicianLevelServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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
@RequestMapping("/technicianLevel")
public class TechnicianLevelController {
    @Autowired
    TechnicianLevelServiceImpl iTechnicianLevelService;

    @RequestMapping("find")
    public List<TechnicianLevel> find() {
        List<TechnicianLevel> list = new ArrayList<TechnicianLevel>();
        list = iTechnicianLevelService.list();
        return list;
    }
    public TechnicianLevel findByLid(String levelid){
        QueryWrapper<TechnicianLevel> wrapper = new QueryWrapper<TechnicianLevel>();
        wrapper.lambda().eq(TechnicianLevel::getLevelid,levelid);
        return iTechnicianLevelService.getOne(wrapper);
    }

    @RequestMapping("save")
    public int save(TechnicianLevel technicianLevel, String relevelid) {
        int count = 0;
        QueryWrapper<TechnicianLevel> wrapper = new QueryWrapper<TechnicianLevel>();
        wrapper.lambda().eq(TechnicianLevel::getLevelid, technicianLevel.getLevelid());
        if (technicianLevel.getLevelid().equals(relevelid)||iTechnicianLevelService.count(wrapper) == 0) {
            boolean bool;
            if (relevelid != null) {
                wrapper.clear();
                wrapper.lambda().eq(TechnicianLevel::getLevelid, relevelid);
                bool = iTechnicianLevelService.update(technicianLevel, wrapper);
            } else {
                bool = iTechnicianLevelService.save(technicianLevel);
            }
            return  count =bool ? 1 : 0;
        } else {
            return -1;
        }
    }

    @RequestMapping("del")
    public boolean del(String relevelid){
        QueryWrapper<TechnicianLevel> wrapper = new QueryWrapper<TechnicianLevel>();
        wrapper.lambda().eq(TechnicianLevel::getLevelid,relevelid);
        return iTechnicianLevelService.remove(wrapper);
    }
}

