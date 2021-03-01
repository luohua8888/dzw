package com.accp.controller;


import com.accp.domain.SysRoleMenu;
import com.accp.service.impl.SysRoleMenuServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yy
 * @since 2021-02-22
 */
@RestController
@RequestMapping("/sysRoleMenu")
public class SysRoleMenuController {
    @Autowired
    SysRoleMenuServiceImpl service;
    @PostMapping("/{roleId}")
    public int find(@PathVariable("roleId") Integer roleId ,String [] array){
        if(roleId!=null&&array!=null){
            QueryWrapper<SysRoleMenu> queryWrapper=new QueryWrapper<>();
            queryWrapper.eq("role_id",roleId);
            service.remove(queryWrapper);
            for(String in : array){
                SysRoleMenu srm=new SysRoleMenu();
                srm.setRoleId(roleId);
                srm.setMenuId(Integer.valueOf(in));
                service.save(srm);
            }
            return 1;
        }
        return 2;
    }
}

