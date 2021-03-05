package com.accp.controller;


import com.accp.domain.UserRole;
import com.accp.service.impl.UserRoleServiceImpl;
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
 * @since 2021-03-04
 */
@RestController
@RequestMapping("/userRole")
public class UserRoleController {
    @Autowired
    UserRoleServiceImpl service;

    @PostMapping("/{u1}")
    public int shouquan(@PathVariable("u1") Integer u1,String [] array){
        if(u1!=null&&array!=null){
            QueryWrapper<UserRole> queryWrapper=new QueryWrapper<>();
            queryWrapper.eq("userid",u1);
            service.remove(queryWrapper);
            for (String s:array){
                UserRole user=new UserRole();
                user.setUserid(u1);
                user.setRoleid(Integer.valueOf(s));
                service.save(user);
            }
            return 1;
        }
        return 2;
    }
}

