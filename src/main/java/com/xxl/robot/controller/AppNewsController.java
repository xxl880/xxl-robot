package com.xxl.robot.controller;

import com.xxl.common.response.BaseResponse;
import com.xxl.robot.constants.PhoneConstants;
import com.xxl.robot.service.AppNewsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/app/news")
@Api(tags = "app-新闻控制器")
public class AppNewsController {
    @Autowired
    private AppNewsService appNewsService;



    //************************一种类型：签到********************************************************
    @GetMapping("start")
    @ApiOperation("1-签到")
    public BaseResponse start() {
        appNewsService.start("phone001");
        appNewsService.start("phone002");
        appNewsService.start("phone003");
        appNewsService.start("phone0031");
        appNewsService.start("phone0032");
        appNewsService.start("phone0033");
        appNewsService.start("phone0034");
        appNewsService.start("phone0035");

        return BaseResponse.newSuccess();
    }


    //************************二种类型：分段（一次性收取，睡觉收取，吃饭，喝水，打卡，种菜，分享，游戏，充电，步行收取）*****************************************
    @GetMapping("section1")
    @ApiOperation("2.1-早上8:00-9:00 （一次性收取，睡觉收取，吃饭，喝水，打卡，种菜，分享，游戏，充电）")
    public BaseResponse section1() {
        appNewsService.section1("phone001");
        appNewsService.section1("phone002");
        appNewsService.section1("phone003");
        appNewsService.section1("phone0031");
        appNewsService.section1("phone0032");
        appNewsService.section1("phone0033");
        appNewsService.section1("phone0034");
        appNewsService.section1("phone0035");

        return BaseResponse.newSuccess();
    }

    @GetMapping("section2")
    @ApiOperation("2.2-中午11：00-12:00（吃饭，喝水，打卡，种菜，分享，游戏，充电）")
    public BaseResponse section2() {
        appNewsService.section2("phone001");
        appNewsService.section2("phone002");
        appNewsService.section2("phone003");
        appNewsService.section2("phone0031");
        appNewsService.section2("phone0032");
        appNewsService.section2("phone0033");
        appNewsService.section2("phone0034");
        appNewsService.section2("phone0035");
        return BaseResponse.newSuccess();
    }

    @GetMapping("section3")
    @ApiOperation("2.3-下午19：00-20：00（吃饭，喝水，打卡，种菜，分享，游戏，充电）")
    public BaseResponse section3() {
        appNewsService.section3("phone001");
        appNewsService.section3("phone002");
        appNewsService.section3("phone003");
        appNewsService.section3("phone0031");
        appNewsService.section3("phone0032");
        appNewsService.section3("phone0033");
        appNewsService.section3("phone0034");
        appNewsService.section3("phone0035");
        return BaseResponse.newSuccess();
    }

    @GetMapping("section4")
    @ApiOperation("2.4-晚上23：00-24：00（睡觉打卡，吃饭，喝水，打卡，种菜，分享，游戏，充电，步行收取）")
    public BaseResponse section4() {
        appNewsService.section4("phone001");
        appNewsService.section4("phone002");
        appNewsService.section4("phone003");
        appNewsService.section4("phone0031");
        appNewsService.section4("phone0032");
        appNewsService.section4("phone0033");
        appNewsService.section4("phone0034");
        appNewsService.section4("phone0035");
        return BaseResponse.newSuccess();
    }


    //*************************三种类型：循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)********************************************************
    @GetMapping("circulate1")
    @ApiOperation("3.1-循环收取金币大于200金币")
    public BaseResponse circulate1() {
        appNewsService.circulate1("phone001");
        appNewsService.circulate1("phone002");
        appNewsService.circulate1("phone003");
        appNewsService.circulate1("phone0031");
        appNewsService.circulate1("phone0032");
        appNewsService.circulate1("phone0033");
        appNewsService.circulate1("phone0034");
        appNewsService.circulate1("phone0035");
        return BaseResponse.newSuccess();
    }


    @GetMapping("circulate2")
    @ApiOperation("3.2-循环收取金币小于200金币")
    public BaseResponse circulate2() {

        return BaseResponse.newSuccess();
    }



}
