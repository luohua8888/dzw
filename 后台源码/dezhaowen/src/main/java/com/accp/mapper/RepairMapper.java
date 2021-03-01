package com.accp.mapper;

import com.accp.domain.*;
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
    List<MaintainHistary> selectHistray(@Param("type") String type, @Param("content")String content);
    List<MaintainHistary> selectRepairItem(@Param("type") String type,@Param("content")String content);
    List<QueryGetGoods> queryGetGoods(@Param("tab") String tab, @Param("number")String number);
    List<QueryItemRepair> queryItemRepair(@Param("tab") String tab, @Param("number")String number);
    List<Repair> selectSettleAccounts();
    List<Repair> queryRepair(String number);
    List<Repair> selectSettleAccounts2(@Param("number") String number,@Param("platename") String platename,@Param("startkd") String startkd,@Param("endkd") String endkd);
}
