package com.accp.controller;


import com.accp.domain.Ycfc;
import com.accp.service.IYcfcService;
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
@RequestMapping("/ycfc")
public class YcfcController {
    @Autowired
    IYcfcService ycfcService;

    @RequestMapping("find")
    public List<Ycfc> find(){
        return ycfcService.list();
    }
    public Ycfc findById(Integer id){
        return ycfcService.getById(id);
    }
}

