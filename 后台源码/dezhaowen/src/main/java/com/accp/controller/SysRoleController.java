package com.accp.controller;


import com.accp.domain.SysRole;
import com.accp.domain.SysRoleMenu;
import com.accp.service.impl.SysRoleMenuServiceImpl;
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
        @Autowired
        SysRoleMenuServiceImpl servicem;

        @PostMapping//登录
        public SysRole login(SysRole s, HttpSession session) {
                if (s.getRole2() != null && s.getRole1() != null) {
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
        @GetMapping//查询所有角色
        public List<SysRole> find(){
                return service.list();
        }
        @PostMapping("/xz")//新增角色
        public int xz(SysRole ss){ boolean b=service.save(ss);
              if(b) {
                    return 1;
              }
              return 2;
        }
        @PostMapping("/sc")//删除
        public int sc(Integer id){ boolean b=service.removeById(id);
                QueryWrapper<SysRoleMenu> queryWrapper=new QueryWrapper<>();
                queryWrapper.eq("role_id",id);
                servicem.remove(queryWrapper);
                if(b){
                        return 1;
                }else{
                 return 2;
                }
        }

        @PostMapping("/xg")
        public int xg(SysRole sys){
              boolean b = service.updateById(sys);
              if(b){
                      return 1;
              }else{
                      return 2;
              }
        }
}

