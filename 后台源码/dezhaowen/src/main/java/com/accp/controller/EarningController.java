package com.accp.controller;


import com.accp.domain.Earning;
import com.accp.service.IEarningService;
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
@RequestMapping("/earning")
public class EarningController {
    @Autowired
    IEarningService earningService;

    @RequestMapping("find")
    public List<Earning> find(){
        return  earningService.list();
    }
    public Earning findById(Integer id){
        return earningService.getById(id);
    }
}

