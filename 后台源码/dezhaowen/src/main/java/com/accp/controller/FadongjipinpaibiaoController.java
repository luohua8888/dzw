package com.accp.controller;


import com.accp.domain.Fadongjipinpaibiao;
import com.accp.service.impl.FadongjipinpaibiaoServiceImpl;
import org.apache.catalina.Engine;
import org.apache.xpath.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ytang
 * @since 2021-02-16
 */
@RestController
@RequestMapping("/fadongjipinpaibiao")
public class FadongjipinpaibiaoController {

    @Autowired
    FadongjipinpaibiaoServiceImpl engineService;

    //查看所有发动机品牌
    @GetMapping("/findall")
    public List<Fadongjipinpaibiao> findall(){
        return  engineService.list();
    }

    //添加发动机品牌
    @PostMapping("/add")
    public Boolean add( @RequestBody Fadongjipinpaibiao engine){
        System.out.println(engine+"111");
        return  engineService.save(engine);
    }

    //删除发动机
    @GetMapping("/remove/{fid}")
    public String remove(@PathVariable("fid") Integer fid){
        boolean result = engineService.removeById(fid);
        if(result){
            return "删除成功";
        }else{
            return  "删除失败";
        }
    }


    //查询单个
    @GetMapping("/findbyid/{fid}")
    public Fadongjipinpaibiao findbyid(@PathVariable("fid")  Integer fid){
        System.out.println(engineService.getById(fid));
        return engineService.getById(fid);
    }

    @PostMapping("/update")
    public Boolean update( @RequestBody Fadongjipinpaibiao engine){
        System.out.println(engine+"111");
        return  engineService.updateById(engine);
    }
}

