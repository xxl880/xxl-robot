package com.xxl.robot.entity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Api(tags="推广实体类")
@Data
@Entity
@Table(name="robot_popularize")
public class RobotPopularize {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @Id
    private Long id;
    @ApiModelProperty(value="服务类型")
    private String serviceType;
    @ApiModelProperty(value="商家")
    private String business;
    @ApiModelProperty(value="推广链接")
    private String promotionLinks;
    @ApiModelProperty(value="推广语1")
    private String popularize1;
    @ApiModelProperty(value="推广语2")
    private String popularize2;
    @ApiModelProperty(value="推广语3")
    private String popularize3;
    @ApiModelProperty(value="推广语4")
    private String popularize4;
    @ApiModelProperty(value="推广语5")
    private String popularize5;
    @ApiModelProperty(value="推广语6")
    private String popularize6;
    @ApiModelProperty(value="开关")
    private Byte enabled;


}
