package com.accp.mapper;

import com.accp.domain.Car;
import com.accp.domain.Carinfo;
import com.accp.domain.ClientAndCar;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yy
 * @since 2021-02-22
 */
public interface CarMapper extends BaseMapper<Car> {
    ClientAndCar selectClientAndCar(String carNumber);
    Carinfo selectCarInfo(String carNumber);
}
