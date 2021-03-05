package com.accp.mapper;

import com.accp.domain.User;
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
public interface UserMapper extends BaseMapper<User> {
    List<User> select(@Param("u1") Integer u1);
}
