package com.accp.controller;


import com.accp.domain.Chexingdingyibiao;
import com.accp.domain.Fadongjipinpaibiao;
import com.accp.domain.Jinkouguochang;
import com.accp.domain.Pinpaichexing;
import com.accp.service.impl.ChexingdingyibiaoServiceImpl;
import com.accp.service.impl.JinkouguochangServiceImpl;
import com.accp.service.impl.PinpaichexingServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.xmlbeans.impl.xpath.XQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
@RequestMapping("/chexingdingyibiao")
public class ChexingdingyibiaoController {

    @Autowired
    PinpaichexingServiceImpl pservice;

    @Autowired
    ChexingdingyibiaoServiceImpl cservice;

    @Autowired
    JinkouguochangServiceImpl jservice;

    //查看品牌车型
    @GetMapping("/find")
    public List<Pinpaichexing> findall(String chaxun){
        QueryWrapper<Pinpaichexing> query=new QueryWrapper<>();
        if(chaxun!=null && chaxun.length()>0){
            query.lambda().like(Pinpaichexing::getPname,chaxun).or().like(Pinpaichexing::getPid,chaxun).or().like(Pinpaichexing::getShouzimu,chaxun);
        }
        List<Pinpaichexing> list=pservice.list(query);
        return  list;
    }

    //查看车型定义
    @GetMapping("/carfind/{pid}")
    public List<Chexingdingyibiao> carfind(@PathVariable("pid") Integer pid,String cxun){
        Pinpaichexing plist=pservice.getById(pid);
        QueryWrapper<Chexingdingyibiao> query=new QueryWrapper<>();
        if(cxun!=null && cxun.length()>0){
            query.lambda().and(i->i.like(Chexingdingyibiao::getCheid,cxun).or().like(Chexingdingyibiao::getCname,cxun));
        }
        if(pid!=null){
            query.lambda().eq(Chexingdingyibiao::getCid,pid);
        }
        List<Chexingdingyibiao> list=cservice.list(query);
        if(list.size()<=0){
            list=new ArrayList<>();
            list.add(new Chexingdingyibiao());
        }
        list.get(0).setPing(plist);
        System.out.println(list);
        return  list;
    }

    //添加品牌
    @PostMapping("/padd")
    public Boolean add( Pinpaichexing engine){
        System.out.println(engine+"111");
        return  pservice.save(engine);
    }

    //修改发动机
    @PostMapping("/pupdate")
    public Boolean pupdate( Pinpaichexing engine){
        System.out.println(engine);
        return  pservice.updateById(engine);
    }

    //删除发动机
    @GetMapping("/remove/{pid}")
    public String remove(@PathVariable("pid") Integer pid){
        System.out.println(pid+"aaaa");
        boolean result = pservice.removeById(pid);
        if(result){
            return "删除成功";
        }else{
            return  "删除失败";
        }
    }

    //车型新增
    @PostMapping("/cheadd")
    public Boolean cheadd(Chexingdingyibiao engine){
        System.out.println(engine+"111");
        return  cservice.save(engine);
    }

    //进口国产查询
    @GetMapping("/jkgcfind")
    public List<Jinkouguochang> jkgcfind(){
        return  jservice.list();
    }

}

