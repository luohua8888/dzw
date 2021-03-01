package com.accp.service.impl;

import com.accp.domain.Zuzhijiegoubiao;
import com.accp.mapper.ZuzhijiegoubiaoMapper;
import com.accp.service.IZuzhijiegoubiaoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class ZuzhijiegoubiaoServiceImpl extends ServiceImpl<ZuzhijiegoubiaoMapper, Zuzhijiegoubiao> implements IZuzhijiegoubiaoService {
    @Autowired
    ZuzhijiegoubiaoMapper mapper;

    public List<Zuzhijiegoubiao> find(){
        return mapper.find(0);
    }
}
