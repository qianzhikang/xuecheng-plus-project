package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.AddCourseDto;
import com.xuecheng.content.model.dto.CourseBaseInfoDto;
import com.xuecheng.content.model.dto.EditCourseDto;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author qianzhikang
* @description 针对表【course_base(课程基本信息)】的数据库操作Service
* @createDate 2023-04-14 15:57:14
*/
public interface CourseBaseService extends IService<CourseBase> {
    
    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);

    CourseBaseInfoDto createCourseBase(Long companyId, AddCourseDto addCourseDto);

    CourseBaseInfoDto getCourseBaseInfo(Long courseId);

    CourseBaseInfoDto updateCourseBase(Long companyId, EditCourseDto editCourseDto);

    void delectCourse(Long companyId, Long courseId);
}
