package com.xuecheng.content.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description 修改信息dto
 * @Date 2023-04-17-14-31
 * @Author qianzhikang
 */
@Data
@ApiModel(value="EditCourseDto", description="修改课程基本信息")
public class EditCourseDto extends AddCourseDto {

    @ApiModelProperty(value = "课程id", required = true)
    private Long id;
}
