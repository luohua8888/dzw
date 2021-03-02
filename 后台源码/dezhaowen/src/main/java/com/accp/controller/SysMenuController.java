package com.accp.controller;


import com.accp.domain.SysMenu;
import com.accp.service.impl.SysMenuServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/sysMenu")
public class SysMenuController {
    @Autowired
    SysMenuServiceImpl  service;

    @GetMapping("/{roleid}")
    public List<SysMenu> findss(@PathVariable Integer roleid){
        return service.select(roleid);
    }

    @GetMapping("sys/{roleid}")
    public List<SysMenu> findlo(@PathVariable Integer roleid){
        return service.select1(roleid);
    }
    @PostMapping
    public List<SysMenu> find(){
        QueryWrapper<SysMenu> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByAsc("order_num");
        return service.list(queryWrapper);
    }

    @PostMapping("/xg")
    public int update(SysMenu sys){
        boolean b= service.updateById(sys);
        if(b){
            return 1;
        }
        return 2;
    }
}

