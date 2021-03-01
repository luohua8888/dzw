package com.accp.controller;


import com.accp.domain.Linkman;
import com.accp.service.ILinkmanService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
@RequestMapping("/linkman")
public class LinkmanController {

    @Autowired
    ILinkmanService linkmanService;

    public Linkman findById(int linkmanid){
        return linkmanService.getById(linkmanid);
    }

    public boolean add(Linkman linkman){
        return  linkmanService.save(linkman);
    }

    public boolean update(Linkman linkman) {
        return linkmanService.updateById(linkman);
    }

    public boolean remove(Integer linkmanid) {
        return linkmanService.removeById(linkmanid);
    }
    public List<Integer> findId(QueryWrapper<Linkman> wrapper){
        List<Linkman> list=linkmanService.list(wrapper);
        List<Integer> id=new ArrayList<>();
        for (Linkman linkman :
                list) {
            id.add(linkman.getLinkmanid());
        }
        return id;
    }
}

