package com.accp.mapper;

import com.accp.domain.Bumenbiao;
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
public interface BumenbiaoMapper extends BaseMapper<Bumenbiao> {
    List<Bumenbiao> bu();
    List<Bumenbiao> bu1();
    List<Bumenbiao> bu2(@Param("id") Integer id);
}
