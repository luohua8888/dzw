package com.accp.mapper;

import com.accp.domain.Lizhiyuanyingbiao;
import com.accp.domain.Yuangongziliaobiao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yy
 * @since 2021-02-22
 */
public interface LizhiyuanyingbiaoMapper extends BaseMapper<Lizhiyuanyingbiao> {
    boolean lizhixz(Yuangongziliaobiao stu);
}
