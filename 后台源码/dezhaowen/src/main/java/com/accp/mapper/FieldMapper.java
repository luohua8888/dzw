package com.accp.mapper;

import com.accp.domain.Field;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author quanl
 * @since 2021-03-01
 */
public interface FieldMapper extends BaseMapper<Field> {
    boolean updateField();

    boolean updateFieldId(Integer id);
}
