package com.accp.mapper;

import com.accp.domain.Repair;
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
public interface RepairMapper extends BaseMapper<Repair> {
    List<Repair> selectRepairAndRescue(@Param("type") String type, @Param("content")String content, @Param("cpc")String cpc);
}
