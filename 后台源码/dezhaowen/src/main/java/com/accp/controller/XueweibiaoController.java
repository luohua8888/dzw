package com.accp.controller;


import com.accp.domain.*;
import com.accp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("/xueweibiao")
public class XueweibiaoController {
    @Autowired
    IXueweibiaoService xservice;
    @Autowired
    IKaihuyinhangbiaoService kservice;
    @Autowired
    IXuelibiaoService xlservice;
    @Autowired
    IBiyexuexiaobiaoService bservice;
    @Autowired
    IHunyingzhuangtaibiaoService hservice;
    @Autowired
    IMingzubiaoService mservice;
    @Autowired
    IJiguanbiaoService jservice;
    @Autowired
    IZhuanyezigebiaoService zservice;
    @Autowired
    IChengshibiaoService cservice;
    @Autowired
    IGangweibiaoService gservice;
    @Autowired
    IBumenbiaoService buservice;
    @Autowired
    IMendianfenleibiaoService menservice;

    @RequestMapping("/findByBankId/{bankid}")
    public Kaihuyinhangbiao findByBankId(@PathVariable("bankid") Integer bankid){
        return kservice.getById(bankid);
    }

    @RequestMapping("/findBank")
    public List<Kaihuyinhangbiao> findBank(){
        return kservice.list();
    }

    @RequestMapping("/find1")
    public List<Xueweibiao> find1(){
        return xservice.list();
    }

    @RequestMapping("/find2")
    public List<Xuelibiao> find2(){
        return xlservice.list();
    }

    @RequestMapping("/find3")
    public List<Biyexuexiaobiao> find3(){
        return bservice.list();
    }

    @RequestMapping("/find4")
    public List<Hunyingzhuangtaibiao> find4(){
        return hservice.list();
    }

    @RequestMapping("/find5")
    public List<Mingzubiao> find5(){
        return mservice.list();
    }

    @RequestMapping("/find6")
    public List<Jiguanbiao> find6(){
        return jservice.list();
    }

    @RequestMapping("/find7")
    public List<Zhuanyezigebiao> find7(){
        return zservice.list();
    }

    @RequestMapping("/find8")
    public List<Chengshibiao> find8(){
        return cservice.list();
    }

    @RequestMapping("/find9")
    public List<Gangweibiao> find9(){
        return gservice.list();
    }

    @RequestMapping("/find10")
    public List<Bumenbiao> find10(){
        return buservice.list();
    }

    @RequestMapping("/find11")
    public List<Mendianfenleibiao> find11(){
        return menservice.list();
    }

}

