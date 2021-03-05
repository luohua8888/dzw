package com.accp.service.impl;

import com.accp.domain.User;
import com.accp.mapper.UserMapper;
import com.accp.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    UserMapper mapper;
    public List<User> select(Integer u1){
        return mapper.select(u1);
    }
}
