package com.accp.controller;


import com.accp.domain.Yuangongziliaobiao;
import com.accp.domain.Zuzhijiegoubiao;
import com.accp.service.IYuangongziliaobiaoService;
import com.accp.service.impl.ZuzhijiegoubiaoServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequestMapping("/zuzhijiegoubiao")
public class ZuzhijiegoubiaoController {
    @Autowired
    ZuzhijiegoubiaoServiceImpl o;
    @Autowired
    IYuangongziliaobiaoService sdservice;

    @RequestMapping("/remove")
    public boolean remove(Integer id){
        return o.removeById(id);
    }

    @RequestMapping("/update")
    public boolean update(Zuzhijiegoubiao or){
        return o.updateById(or);
    }

    @RequestMapping("/inserts")
    public boolean insert(Zuzhijiegoubiao or){
        return o.save(or);
    }

    @RequestMapping("/insert")
    public boolean insert(Yuangongziliaobiao s){
        return sdservice.save(s);
    }

    @RequestMapping("/updates")
    public boolean update(@RequestBody Yuangongziliaobiao s){
        return sdservice.updateById(s);
    }

    @RequestMapping("/removeId")
    public boolean removeId(Integer id){
        return sdservice.removeById(id);
    }

    @RequestMapping("/query")
    public List<Yuangongziliaobiao> query(){
        return sdservice.list();
    }

    @RequestMapping("/findByIds/{id}")
    public List<Yuangongziliaobiao> findByIds(@PathVariable("id") Integer id){
        QueryWrapper<Yuangongziliaobiao> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("reserved5",id);
        return sdservice.list(queryWrapper);
    }

    @RequestMapping("/find")
    public List<Zuzhijiegoubiao> findByAll(String name){
        QueryWrapper<Zuzhijiegoubiao> stu=new QueryWrapper<>();
        if(name!=null&&name.length()>0){
            stu.lambda().like(Zuzhijiegoubiao::getZid,name).or().like(Zuzhijiegoubiao::getZname,name);
        }
        return o.list(stu);
    }

    @RequestMapping("/findId")
    public List<Zuzhijiegoubiao> findId(){
        return o.find();
    }
}

