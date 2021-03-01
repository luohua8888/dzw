package com.accp.controller;


import com.accp.domain.Goodbigkind;
import com.accp.service.IGoodbigkindService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/goodbigkind")
public class GoodbigkindController {
    @Autowired
    IGoodbigkindService goodbigkindService;

    @RequestMapping("find")
    public List<Goodbigkind> find(){
        return goodbigkindService.list();
    }
    public Goodbigkind findById(Integer id){
        return goodbigkindService.getById(id);
    }
}

