package com.accp.mapper;

import com.accp.domain.Ziduana;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yy
 * @since 2021-03-08
 */
public interface ZiduanaMapper extends BaseMapper<Ziduana> {
    int upda();
    int upto(Integer id);
}
