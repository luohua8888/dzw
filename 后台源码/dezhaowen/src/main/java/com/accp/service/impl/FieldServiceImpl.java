package com.accp.service.impl;

import com.accp.domain.Field;
import com.accp.mapper.FieldMapper;
import com.accp.service.IFieldService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author quanl
 * @since 2021-03-01
 */
@Service
public class FieldServiceImpl extends ServiceImpl<FieldMapper, Field> implements IFieldService {
    @Autowired
    FieldMapper mapper;

    public boolean updateField(){
        return mapper.updateField();
    }

    public boolean updateFieldId(Integer id){
        return mapper.updateFieldId(id);
    }
}
