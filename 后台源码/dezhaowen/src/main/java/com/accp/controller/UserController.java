package com.accp.controller;


import com.accp.domain.User;
import com.accp.service.impl.UserServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/user")
public class UserController<list> {
    @Autowired
    UserServiceImpl service;

    @PostMapping//登录
    public User login(User u, HttpSession session){
        if(u.getUser()!=null&&u.getPwd()!=null){
            QueryWrapper<User> queryWrapper=new QueryWrapper<>();
            queryWrapper.eq("user",u.getUser()).eq("pwd",u.getPwd());
            List<User> list= service.list(queryWrapper);
            User user= list.get(0);
            if(user!=null){
                session.setAttribute("User", user);
                user.setU2(session.getId());
                System.out.println(user);
                return user;
            }
            return null;
        }
        return null;
    }
    @GetMapping//查询
    public List<User> query(){
        return service.list();
    }

    @PostMapping("/like")//模块查询
    public List<User> likelist(String name){
            QueryWrapper<User> queryWrapper = new QueryWrapper<>();
            queryWrapper.like("miaoshu", name);
            List<User> list = service.list(queryWrapper);
        return list;
    }

    @PostMapping("/xz")//新增
    public int add(User u){
        if(u!=null){
            boolean b= service.save(u);
            if(b){
                return 1;
            }
            return 2;
        }
        return 3;
    }
    @PostMapping("/xg")//修改
    public int update(User user){
        if(user!=null){
            QueryWrapper<User> queryWrapper=new QueryWrapper<>();
            queryWrapper.eq("u1",user.getU1());
            boolean b=service.update(user,queryWrapper);
            if(b){
                return 1;
            }
            return 2;
        }
        return 3;
    }
    @PostMapping("/sc")//删除
    public int delete(Integer id){
        if(id!=null) {
            QueryWrapper<User> queryWrapper=new QueryWrapper<>();
            queryWrapper.eq("u1",id);
            boolean b= service.remove(queryWrapper);
            if(b){
                return 1;
            }
            return 2;
        }
        return 3;
    }

    @GetMapping("sys/{u1}")
    public List<User> quanx(@PathVariable Integer u1){
        return service.select(u1);
    }
}

