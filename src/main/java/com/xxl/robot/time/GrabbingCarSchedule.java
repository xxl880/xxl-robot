package com.xxl.robot.time;

import com.alibaba.fastjson.JSON;
import com.github.binarywang.java.emoji.EmojiConverter;
import com.xxl.robot.dto.CarQqDto;
import com.xxl.robot.dto.CarSourceDto;
import com.xxl.robot.entity.RobotConfig;
import com.xxl.robot.service.*;
import com.xxl.robot.tools.CrawlTools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


/**
 * 汽车租赁方面微信，QQ数据爬取
 */
@Component
public class GrabbingCarSchedule {
  private static final Logger log = LoggerFactory.getLogger(GrabbingCarSchedule.class);

    @Autowired
    private CarDriverService carDriverService;
    @Autowired
    private CarQqService carQqService;
    @Autowired
    private CarWechartService carWechartService;
    @Autowired
    private CarSourceService carSourceService;
    @Autowired
    private RobotConfigService robotConfigService;


    /**
     * todo 源始数据采集信息
     * 表示每隔3分钟获取数据一次
     * 至少大于1分钟
     */
   @Scheduled(cron = "0 0/1 * * * ?")
    public void collectSource(){
        log.info("********************collectSource()方法源始数据采集信定时器启动**************************");
        RobotConfig robotConfig = robotConfigService.getByConfigNo("39.99.210.127");
        if(null!=robotConfig&&String.valueOf(robotConfig.getEnabled()).equals("0")){
            carSourceService.analysisQQ();
        }
    }


//***********************************************业务性操作*******************************************************

    /**
     * todo qq采集信息
     * 表示每隔3分钟获取数据一次
     * 至少大于1分钟
     */
  //@Scheduled(cron = "0 0/3 * * * ?")
   public void qqCrawl(){
       log.info("********************qqProces定时器启动**************************");
       RobotConfig robotConfig = robotConfigService.getByConfigNo("39.99.210.127");
       if(null!=robotConfig&&String.valueOf(robotConfig.getEnabled()).equals("0")){
           List<String> datas = CrawlTools.QQCrawlCtrlA(6,600);
            carQqService.handleQQ(datas);

       }
   }









}

