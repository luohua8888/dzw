package com.accp.mapper;

import com.accp.domain.Completed;
import com.accp.domain.JunGong;
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
public interface CompletedMapper extends BaseMapper<Completed> {
    List<JunGong> selectJunGong(@Param("tj") String tj, @Param("date1") String date1, @Param("date2") String date2, @Param("number") String number, @Param("carnumber") String carnumber, @Param("carnumber1") String carnumber1);
}
