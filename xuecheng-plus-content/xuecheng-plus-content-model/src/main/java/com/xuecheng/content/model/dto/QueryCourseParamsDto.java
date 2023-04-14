package com.xuecheng.content.model.dto;

import lombok.Data;
import lombok.ToString;

/**
 * @Description 课程查询接口
 * @Date 2023-04-14-16-07
 * @Author qianzhikang
 */
@Data
@ToString
public class QueryCourseParamsDto {

    //审核状态
    private String auditStatus;
    //课程名称
    private String courseName;
    //发布状态
    private String publishStatus;

}
