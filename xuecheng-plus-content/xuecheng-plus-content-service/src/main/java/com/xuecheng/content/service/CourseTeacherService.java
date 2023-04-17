package com.xuecheng.content.service;

import com.xuecheng.content.model.po.CourseTeacher;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author qianzhikang
* @description 针对表【course_teacher(课程-教师关系表)】的数据库操作Service
* @createDate 2023-04-14 15:57:14
*/
public interface CourseTeacherService extends IService<CourseTeacher> {
    List<CourseTeacher> getCourseTeacherList(Long courseId);

    CourseTeacher saveCourseTeacher(CourseTeacher courseTeacher);

    void deleteCourseTeacher(Long courseId, Long teacherId);
}
