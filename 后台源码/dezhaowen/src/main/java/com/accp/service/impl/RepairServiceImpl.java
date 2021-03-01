package com.accp.service.impl;

import com.accp.domain.Repair;
import com.accp.mapper.RepairMapper;
import com.accp.service.IRepairService;
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
public class RepairServiceImpl extends ServiceImpl<RepairMapper, Repair> implements IRepairService {
    @Autowired
    RepairMapper repairMapper;

    public List<Repair> selectSettleAccounts(){
        List<Repair> list=repairMapper.selectSettleAccounts();
        return list;
    }

    public List<Repair> selectSettleAccounts2(String number,String platename,String startkd,String endkd){
        List<Repair>  list = repairMapper.selectSettleAccounts2(number,platename,startkd,endkd);
        return list;
    }

    public List<Repair> queryRepair(String number){
        List<Repair>  list = repairMapper.queryRepair(number);
        return list;
    }
}
