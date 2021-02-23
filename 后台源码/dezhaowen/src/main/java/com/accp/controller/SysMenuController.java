package com.accp.controller;


import com.accp.domain.SysMenu;
import com.accp.service.impl.SysMenuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
@RequestMapping("/sysMenu")
public class SysMenuController {
    @Autowired
    SysMenuServiceImpl  service;

    @GetMapping("/{roleid}")
    public List<SysMenu> findss(@PathVariable Integer roleid){
        return service.select(roleid);
    }
}

