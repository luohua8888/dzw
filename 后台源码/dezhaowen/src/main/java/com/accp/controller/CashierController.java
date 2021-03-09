package com.accp.controller;


import com.accp.domain.Cashier;
import com.accp.mapper.CashierMapper;
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
@RequestMapping("/cashier")
public class CashierController {
    @Autowired
    CashierMapper jsmapper;

    @RequestMapping("/selectByxianjin")
    public List<Cashier> selectByxianjin(){
        return jsmapper.selectByxianjin();
    }

    @RequestMapping("/selectByguazhang")
    public List<Cashier> selectByguazhang(){
        return jsmapper.selectByguazhang();
    }

    @RequestMapping("/selectBykucun")
    public List<Cashier> selectBykucun(){
        return jsmapper.selectBykucun();
    }

    @RequestMapping("/selectByjrjs")
    public List<Cashier> selectByjrjs(){
        return jsmapper.selectByjrjs();
    }

    @RequestMapping("/selectByjrkc")
    public List<Cashier> selectByjrkc(){
        return jsmapper.selectByjrkc();
    }
}

