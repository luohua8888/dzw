package com.accp.service.impl;

import com.accp.domain.Customer;
import com.accp.mapper.CustomerMapper;
import com.accp.service.ICustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yy
 * @since 2021-02-22
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements ICustomerService {

}
