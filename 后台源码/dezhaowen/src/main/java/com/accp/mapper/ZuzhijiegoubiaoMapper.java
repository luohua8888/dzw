package com.accp.mapper;

import com.accp.domain.Zuzhijiegoubiao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yy
 * @since 2021-02-22
 */
public interface ZuzhijiegoubiaoMapper extends BaseMapper<Zuzhijiegoubiao> {
    List<Zuzhijiegoubiao> find (Integer zid);
}
