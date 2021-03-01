package com.accp.controller;


import java.util.UUID;

import com.accp.domain.*;
import com.accp.service.impl.*;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.xmlbeans.impl.xpath.XQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
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

    @Value("${file.upload.filepath}")
    String fileUpload;

    @Autowired
    PinpaichexingServiceImpl pservice;

    @Autowired
    ChexingdingyibiaoServiceImpl cservice;

    @Autowired
    JinkouguochangServiceImpl jservice;

    @Autowired
    FadongjipinpaibiaoServiceImpl engineService;

    @Autowired
    FirmServiceImpl fservice;


    //查看品牌车型
    @GetMapping("/find")
    public List<Pinpaichexing> findall(String chaxun) {
        QueryWrapper<Pinpaichexing> query = new QueryWrapper<>();
        if (chaxun != null && chaxun.length() > 0) {
            query.lambda().like(Pinpaichexing::getPname, chaxun).or().like(Pinpaichexing::getPid, chaxun).or().like(Pinpaichexing::getShouzimu, chaxun);
        }
        List<Pinpaichexing> list = pservice.list(query);
        return list;
    }

    //查看车型定义
    @GetMapping("/carfind/{pid}")
    public List<Chexingdingyibiao> carfind(@PathVariable("pid") Integer pid, String cxun) {
        Pinpaichexing plist = pservice.getById(pid);
        QueryWrapper<Chexingdingyibiao> query = new QueryWrapper<>();
        if (cxun != null && cxun.length() > 0) {
            query.lambda().and(i -> i.like(Chexingdingyibiao::getCheid, cxun).or().like(Chexingdingyibiao::getCname, cxun));
        }
        if (pid != null) {
            query.lambda().eq(Chexingdingyibiao::getCid, pid);
        }
        List<Chexingdingyibiao> list = cservice.list(query);
        if (list.size() <= 0) {
            list = new ArrayList<>();
            list.add(new Chexingdingyibiao());
        }
        list.get(0).setPing(plist);
        System.out.println(list);
        return list;
    }

    //添加品牌
    @PostMapping("/padd")
    public Boolean add(Pinpaichexing engine) {
        System.out.println(engine + "111");
        return pservice.save(engine);
    }

    //修改发动机
    @PostMapping("/pupdate")
    public Boolean pupdate(Pinpaichexing engine) {
        System.out.println(engine);
        return pservice.updateById(engine);
    }

    //删除发动机
    @GetMapping("/remove/{pid}")
    public String remove(@PathVariable("pid") Integer pid) {
        System.out.println(pid + "aaaa");
        boolean result = pservice.removeById(pid);
        if (result) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

    //进口国产查询
    @GetMapping("/jkgcfind")
    public List<Jinkouguochang> jkgcfind() {
        return jservice.list();
    }

    //查看所有发动机品牌
    @GetMapping("/fdjfind")
    public List<Fadongjipinpaibiao> fdjfind() {
        System.out.println("111111");
        return engineService.list();
    }

    //车型新增文件上传
    @RequestMapping("/upload")
    public String upload(MultipartFile file) {
        String uuid = UUID.randomUUID().toString();
        String fileName = file.getOriginalFilename();
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        File f = new File(fileUpload + uuid + suffix);
        try {
            file.transferTo(f);
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return uuid + suffix;
    }

    //车型新增
    @RequestMapping("/chexinadd")
    public Boolean chexinadd(Chexingdingyibiao stu) {
        return cservice.save(stu);
    }
    //按id查询车型定义表
    @GetMapping("/chexingByid/{cheid}")
    public Chexingdingyibiao chexingByid(@PathVariable("cheid") Integer cheid) {

        return cservice.getById(cheid);
    }


    //车型修改文件上传
    @RequestMapping("/updateupload")
    public String updateupload(MultipartFile file) {
        String uuid = UUID.randomUUID().toString();
        String fileName = file.getOriginalFilename();
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        File f = new File(fileUpload + uuid + suffix);
        try {
            file.transferTo(f);
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return uuid + suffix;
    }

    //车型修改
    @RequestMapping("/chexinupdate")
    public Boolean chexinupdate(@RequestBody Chexingdingyibiao stu) {
        System.out.println("aaaa");
        return cservice.updateById(stu);
    }
    //车型删除
    @PostMapping("/chexinremove/{cheid}")
    public String chexinremove(@PathVariable("cheid") Integer cheid){
        boolean result = cservice.removeById(cheid);
        if(result){
            return "删除成功";
        }else{
            return  "删除失败";
        }
    }

    //索赔厂商查询
    @GetMapping("/spcs")
    public List<Firm> spcs() {
        return fservice.list();
    }

}

