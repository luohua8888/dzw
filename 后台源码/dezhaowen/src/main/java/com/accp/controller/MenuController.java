package com.accp.controller;


import com.accp.domain.Menu;
import com.accp.service.IMenuService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 菜单表 前端控制器
 * </p>
 *
 * @author ytang
 * @since 2021-02-26
 */
@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    IMenuService menuService;

    @RequestMapping("find")
    public List<Menu> find(){
        List<Menu> menus=new ArrayList<>();
        QueryWrapper<Menu> wrapper=new QueryWrapper<>();
        wrapper.lambda().eq(Menu::getFmid,0);
        menus=menuService.list(wrapper);
        dg(menus,null);
        return menus;
    }
    @RequestMapping("findByText")
    public List<Menu> findByText(String where){
        List<Menu> menus=new ArrayList<>();
        QueryWrapper<Menu> wrapper=new QueryWrapper<>();
        wrapper.lambda().eq(Menu::getFmid,0);
        if(where!=null){
            wrapper.lambda().and(i->i.like(Menu::getMenuid,where).or().like(Menu::getMenuname,where));
        }
        menus=menuService.list(wrapper);
        dg(menus,where);
        return menus;
    }

    public void dg(List<Menu> menus,String where){
        for (Menu menu:
                menus) {
            QueryWrapper<Menu> wrapper=new QueryWrapper<>();
            wrapper.lambda().eq(Menu::getFmid,menu.getMenuid());
            if(where!=null){
                wrapper.lambda().and(i->i.like(Menu::getMenuid,where).or().like(Menu::getMenuname,where));
            }
            menu.setChildren(menuService.list(wrapper));
            if(menu.getChildren()!=null&&menu.getChildren().size()>0){
                dg(menu.getChildren(),where);
            }
        }
    }
}

