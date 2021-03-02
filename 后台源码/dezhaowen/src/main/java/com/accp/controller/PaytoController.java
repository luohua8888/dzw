package com.accp.controller;


import com.accp.domain.Payto;
import com.accp.service.IPaytoService;
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
@RequestMapping("/payto")
public class PaytoController {

    @Autowired
    IPaytoService paytoService;

    @RequestMapping("find")
    public List<Payto> find(){
        return paytoService.list();
    }
    public Payto findById(Integer paytoid) {
        return paytoService.getById(paytoid);
    }
}

