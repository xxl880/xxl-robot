package com.xxl.robot.service;

import com.xxl.common.service.IBaseService;
import com.xxl.robot.dto.RobotWechartDto;

/**
 * 
 * 微信服务接口类接口
 */
public interface RobotWechartService extends IBaseService<RobotWechartDto> {

    /**
     * 启用/禁用
     * @param id
     * @return
     */
    int doEnabled(Long id);


}
