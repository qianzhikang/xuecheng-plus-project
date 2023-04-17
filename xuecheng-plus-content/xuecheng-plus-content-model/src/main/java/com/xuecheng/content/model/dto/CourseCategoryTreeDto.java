package com.xuecheng.content.model.dto;

import com.xuecheng.content.model.po.CourseCategory;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Description 课程分类分级
 * @Date 2023-04-17-13-08
 * @Author qianzhikang
 */
@Data
public class CourseCategoryTreeDto extends CourseCategory implements Serializable {
    /**
     * 下级节点
     */
    private List<CourseCategoryTreeDto> childrenTreeNodes;
}
