package com.xxl.robot.service;

import com.xxl.common.service.IBaseService;
import com.xxl.robot.dto.CarDriverDto;
import com.xxl.robot.dto.CarSourceDto;
import com.xxl.robot.entity.CarSource;

/**
 * 
 * 汽车源数据服务接口类接口
 */
public interface CarSourceService extends IBaseService<CarSourceDto> {

    int doEnabled(Long id);

}