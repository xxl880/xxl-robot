package com.xxl.robot.dto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Api(tags="微信实体类")
@Data
public class RobotWechartDto {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value="当前页码，默认是第一页 ")
    private int pageIndex;
    @ApiModelProperty(value="每页显示的记录数，默认是10 ，设置为“-1”表示不进行分页（分页无效）")
    private int pageSize;

    private Long id;
    @ApiModelProperty(value="机器人编号")
    private String robotCode;
    @ApiModelProperty(value="内容")
    private String content;
    @ApiModelProperty(value="开关")
    private Byte enabled;
    @ApiModelProperty(value="会话时间")
    private Date createDate;
    @ApiModelProperty(value="更新时间")
    private Date updateDate;


}
