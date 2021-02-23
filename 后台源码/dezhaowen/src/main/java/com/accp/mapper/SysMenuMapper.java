package com.accp.mapper;

import com.accp.domain.SysMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yy
 * @since 2021-02-22
 */
public interface SysMenuMapper extends BaseMapper<SysMenu> {
    List<SysMenu> select(@Param("id") Integer id, @Param("roleid") Integer roleid);
}
