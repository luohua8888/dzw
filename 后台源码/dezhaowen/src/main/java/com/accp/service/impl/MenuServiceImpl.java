package com.accp.service.impl;

import com.accp.domain.Menu;
import com.accp.mapper.MenuMapper;
import com.accp.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单表 服务实现类
 * </p>
 *
 * @author ytang
 * @since 2021-02-26
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
