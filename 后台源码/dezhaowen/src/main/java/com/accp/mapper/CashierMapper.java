package com.accp.mapper;

import com.accp.domain.Cashier;
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
public interface CashierMapper extends BaseMapper<Cashier> {
    List<Cashier> selectByExample();

    int insertjz(Cashier record);
    List<Cashier> selectByxianjin();
    List<Cashier> selectByguazhang();
    List<Cashier> selectBykucun();
    List<Cashier> selectByjrjs();
    List<Cashier> selectByjrkc();
}
