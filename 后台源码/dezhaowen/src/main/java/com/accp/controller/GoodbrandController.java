package com.accp.controller;


import com.accp.domain.Goodbrand;
import com.accp.service.IGoodbrandService;
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
@RequestMapping("/goodbrand")
public class GoodbrandController {
    @Autowired
    IGoodbrandService goodbrandService;

    @RequestMapping("find")
    public List<Goodbrand> find(){
        return goodbrandService.list();
    }
    public Goodbrand findById(Integer id){
        return goodbrandService.getById(id);
    }
}

