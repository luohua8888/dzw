package com.accp.controller;


import com.accp.domain.Goodaddress;
import com.accp.service.IGoodaddressService;
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
@RequestMapping("/goodaddress")
public class GoodaddressController {
    @Autowired
    IGoodaddressService goodaddressService;

    @RequestMapping("find")
    public List<Goodaddress> find(){
        return goodaddressService.list();
    }
    public Goodaddress findById(Integer id){
        return goodaddressService.getById(id);
    }
}

