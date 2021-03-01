package com.accp.controller;


import com.accp.domain.Firmtype;
import com.accp.service.IFirmtypeService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yy
 * @since 2021-02-22
 */
@RestController
@RequestMapping("/firmtype")
public class FirmtypeController {
    @Autowired
    IFirmtypeService firmtypeService;

    @RequestMapping("find")
    public List<Firmtype> find(){
        List<Firmtype> list=new ArrayList<>();
        QueryWrapper<Firmtype> wrapper=new QueryWrapper<>();
        wrapper.lambda().eq(Firmtype::getDadid,0);
        list=firmtypeService.list(wrapper);
        for (Firmtype firmtype :list) {
            wrapper.clear();
            wrapper.lambda().eq(Firmtype::getDadid,firmtype.getFirmtypeid());
            firmtype.setChildren(firmtypeService.list(wrapper));
        }
        return list;
    }
    public Firmtype findById(int firmtypeid){
        return firmtypeService.getById(firmtypeid);
    }
}

