package com.accp.controller;


import com.accp.domain.TeamWeight;
import com.accp.domain.TeamWeight;
import com.accp.service.impl.TeamWeightServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/teamWeight")
public class TeamWeightController {

    @Autowired
    TeamWeightServiceImpl service;

    @RequestMapping("find")
    public List<TeamWeight> find(){
        return service.list();
    }
    @RequestMapping("save")
    public int save(TeamWeight teamWeight) {
        int count = 0;
        QueryWrapper<TeamWeight> wrapper = new QueryWrapper<TeamWeight>();
        wrapper.lambda().eq(TeamWeight::getTeamid, teamWeight.getTeamid());
        if (teamWeight.getTeamid().equals(teamWeight.getReteamid())||service.count(wrapper) == 0) {
            boolean bool;
            if (teamWeight.getReteamid() != null) {
                wrapper.clear();
                wrapper.lambda().eq(TeamWeight::getTeamid, teamWeight.getReteamid());
                bool = service.update(teamWeight, wrapper);
            } else {
                bool = service.save(teamWeight);
            }
            return  count =bool ? 1 : 0;
        } else {
            return -1;
        }
    }

    @RequestMapping("del")
    public boolean del(String teamid){
        QueryWrapper<TeamWeight> wrapper = new QueryWrapper<TeamWeight>();
        wrapper.lambda().eq(TeamWeight::getTeamid,teamid);
        return service.remove(wrapper);
    }
}

