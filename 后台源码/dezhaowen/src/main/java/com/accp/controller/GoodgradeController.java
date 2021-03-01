package com.accp.controller;


import com.accp.domain.Goodgrade;
import com.accp.service.IGoodgradeService;
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
@RequestMapping("/goodgrade")
public class GoodgradeController {
    @Autowired
    IGoodgradeService goodgradeService;

    @RequestMapping("find")
    public List<Goodgrade> find(){
        return goodgradeService.list();
    }
    public Goodgrade findById(Integer id){
        return goodgradeService.getById(id);
    }
}

