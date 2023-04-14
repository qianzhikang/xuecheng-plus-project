package com.xuecheng.content.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuecheng.content.model.po.CourseTeacher;
import com.xuecheng.content.service.CourseTeacherService;
import com.xuecheng.content.mapper.CourseTeacherMapper;
import org.springframework.stereotype.Service;

/**
* @author qianzhikang
* @description 针对表【course_teacher(课程-教师关系表)】的数据库操作Service实现
* @createDate 2023-04-14 15:57:14
*/
@Service
public class CourseTeacherServiceImpl extends ServiceImpl<CourseTeacherMapper, CourseTeacher>
    implements CourseTeacherService{

}




