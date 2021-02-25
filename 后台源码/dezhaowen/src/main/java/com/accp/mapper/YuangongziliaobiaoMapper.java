package com.accp.mapper;

import com.accp.domain.Yuangongziliaobiao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yy
 * @since 2021-02-22
 */
public interface YuangongziliaobiaoMapper extends BaseMapper<Yuangongziliaobiao> {
    boolean lizhih(@Param("id") Integer id);
}
