package com.accp.controller;


import com.accp.domain.Firmgrade;
import com.accp.service.IFirmgradeService;
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
@RequestMapping("/firmgrade")
public class FirmgradeController {
    @Autowired
    IFirmgradeService firmgradeService;

    public Firmgrade findById(int firmgradeid){
        return firmgradeService.getById(firmgradeid);
    }

    @RequestMapping("find")
    public List<Firmgrade> find(){
        return firmgradeService.list();
    }
}

