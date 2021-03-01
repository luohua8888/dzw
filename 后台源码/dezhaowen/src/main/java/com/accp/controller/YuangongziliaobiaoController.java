package com.accp.controller;


import com.accp.domain.*;
import com.accp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author quanl
 * @since 2021-03-01
 */
@RestController
@RequestMapping("/yuangongziliaobiao")
public class YuangongziliaobiaoController {
    @Autowired
    IYuangongziliaobiaoService services;
    @Autowired
    IGangweibiaoService service;
    @Autowired
    IJiguanbiaoService jservice;
    @Autowired
    IMingzubiaoService mservice;
    @Autowired
    IHunyingzhuangtaibiaoService hservice;
    @Autowired
    IXuelibiaoService xservice;
    @Autowired
    IBiyexuexiaobiaoService bservice;
    @Autowired
    IZhuanyezigebiaoService zservice;
    @Autowired
    IXueweibiaoService xwservice;
    @Autowired
    IBumenbiaoService buservice;
    @Autowired
    IZuzhijiegoubiaoService zzservice;
    @Autowired
    IChengshibiaoService cservice;

    @RequestMapping("/gfind")
    public List<Gangweibiao> queryAll1(){
        return service.list();
    }
    @RequestMapping("/jfind")
    public List<Jiguanbiao> queryAll2(){
        return jservice.list();
    }
    @RequestMapping("/mfind")
    public List<Mingzubiao> queryAll3(){
        return mservice.list();
    }
    @RequestMapping("/hfind")
    public List<Hunyingzhuangtaibiao> queryAll4(){
        return hservice.list();
    }
    @RequestMapping("/xfind")
    public List<Xuelibiao> queryAll5(){
        return xservice.list();
    }
    @RequestMapping("/bfind")
    public List<Biyexuexiaobiao> queryAll6(){
        return bservice.list();
    }
    @RequestMapping("/zfind")
    public List<Zhuanyezigebiao> queryAll7(){
        return zservice.list();
    }
    @RequestMapping("/xwfind")
    public List<Xueweibiao> queryAll8(){
        return xwservice.list();
    }
    @RequestMapping("/bufind")
    public List<Bumenbiao> buFind(){
        List<Bumenbiao> list=buservice.list();
        return list;
    }
    @RequestMapping("/yuanfind")
    public List<Yuangongziliaobiao> yuanFind(){
        return services.list();
    }
}

