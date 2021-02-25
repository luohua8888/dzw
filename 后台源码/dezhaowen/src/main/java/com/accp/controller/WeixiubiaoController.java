package com.accp.controller;


import com.accp.domain.Fadongjipinpaibiao;
import com.accp.domain.Pinpaichexing;
import com.accp.domain.Weixiubiao;
import com.accp.service.impl.ChexingdingyibiaoServiceImpl;
import com.accp.service.impl.FadongjipinpaibiaoServiceImpl;
import com.accp.service.impl.PinpaichexingServiceImpl;
import com.accp.service.impl.WeixiubiaoServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yy
 * @since 2021-02-22
 */
@RestController
@RequestMapping("/weixiubiao")
public class WeixiubiaoController {

    @Autowired
    FadongjipinpaibiaoServiceImpl fservice;

    @Autowired
    ChexingdingyibiaoServiceImpl cservice;

    @Autowired
    PinpaichexingServiceImpl pservice;

    @Autowired
    WeixiubiaoServiceImpl wservice;
    //查看所有发动机品牌
    @GetMapping("/findall")
    public Map<String, Object> findall(){
        List<Fadongjipinpaibiao> flist=fservice.list();
        List<Pinpaichexing> plist=pservice.list();
        Map<String,Object> map = new HashMap<>();
        map.put("flist",flist);
        map.put("plist",plist);
        return  map;
    }

    //查看车型定义
    @GetMapping("/weixiufind/{cxun}")
    public List<Weixiubiao> carfind(@PathVariable String cxun,Integer chaxun) {
        System.out.print(cxun);
       QueryWrapper<Weixiubiao> query=new QueryWrapper<>();
        if(cxun!=null&&cxun.length()>0&&!cxun.equals("0")){
            query.lambda().eq(Weixiubiao::getXiangmuleibie,cxun);
        }
        if(chaxun!=null){
            query.lambda().like(Weixiubiao::getWid,chaxun);
        }
       List<Weixiubiao> list=wservice.list(query);
        return  list;
    }

    

}

