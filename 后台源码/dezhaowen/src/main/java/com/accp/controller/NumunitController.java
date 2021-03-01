package com.accp.controller;


import com.accp.domain.Numunit;
import com.accp.service.INumunitService;
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
@RequestMapping("/numunit")
public class NumunitController {
    @Autowired
    INumunitService numunitService;

    @RequestMapping("find")
    public List<Numunit> find(){
        return numunitService.list();
    }
    public Numunit findById(Integer id){
        return numunitService.getById(id);
    }
}

