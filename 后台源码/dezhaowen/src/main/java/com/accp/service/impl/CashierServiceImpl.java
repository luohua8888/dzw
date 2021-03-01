package com.accp.service.impl;

import com.accp.domain.Cashier;
import com.accp.mapper.CashierMapper;
import com.accp.service.ICashierService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yy
 * @since 2021-02-22
 */
@Service
public class CashierServiceImpl extends ServiceImpl<CashierMapper, Cashier> implements ICashierService {
    @Autowired
    CashierMapper ac;
    /**
     * 新增一条结账数据
     * @return
     */
    public Integer addCashier(Cashier record){
        return ac.insertjz(record);
    }
    public List<Cashier> selectAllInfo(){
        List<Cashier> list=ac.selectByExample();
        return list;
    }
}
