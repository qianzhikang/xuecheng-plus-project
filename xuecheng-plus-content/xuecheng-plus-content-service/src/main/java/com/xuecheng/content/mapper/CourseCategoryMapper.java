package com.xuecheng.content.mapper;

import com.xuecheng.content.model.dto.CourseCategoryTreeDto;
import com.xuecheng.content.model.po.CourseCategory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author qianzhikang
* @description 针对表【course_category(课程分类)】的数据库操作Mapper
* @createDate 2023-04-14 15:57:14
* @Entity com.xuecheng.content.model.po.CourseCategory
*/
public interface CourseCategoryMapper extends BaseMapper<CourseCategory> {


    List<CourseCategoryTreeDto> selectTreeNodes(String id);
}




