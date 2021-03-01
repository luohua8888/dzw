package com.accp.mapper;

import com.accp.domain.Yuangongziliaobiao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author quanl
 * @since 2021-03-01
 */
public interface YuangongziliaobiaoMapper extends BaseMapper<Yuangongziliaobiao> {
    boolean lizhih(@Param("id") Integer id);
}
