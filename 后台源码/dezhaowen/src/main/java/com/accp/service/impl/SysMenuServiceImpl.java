package com.accp.service.impl;

import com.accp.domain.SysMenu;
import com.accp.mapper.SysMenuMapper;
import com.accp.service.ISysMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yy
 * @since 2021-02-22
 */
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements ISysMenuService {
    @Autowired
    SysMenuMapper Mapper;
    public List<SysMenu> select(Integer roleid){
        List<SysMenu> ss= Mapper.select(0,roleid);
        for (SysMenu s : ss) { s.setL(false); }
        return ss;
    }

}
