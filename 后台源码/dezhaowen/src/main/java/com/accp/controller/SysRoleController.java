package com.accp.controller;


import com.accp.domain.SysRole;
import com.accp.service.impl.SysRoleServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
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
@RequestMapping("/sysRole")
public class SysRoleController {
        @Autowired
        SysRoleServiceImpl service;
        @PostMapping
        public SysRole login(SysRole s, HttpSession session) {
                if (s.getRoleName() != null && s.getRole1() != null) {
                        QueryWrapper<SysRole> qw = new QueryWrapper<>();
                        qw.eq("role_name", s.getRoleName());
                        qw.eq("role1", s.getRole1());
                        List<SysRole> list = service.list(qw);
                        SysRole sys = list.get(0);
                        if (sys != null) {
                                session.setAttribute("SysRole", sys);
                                System.out.println(sys);
                                return sys;
                        }
                } else {
                        return null;
                }
                return null;
        }
        @GetMapping
        public List<SysRole> find(){
                return service.list();
        }
}

