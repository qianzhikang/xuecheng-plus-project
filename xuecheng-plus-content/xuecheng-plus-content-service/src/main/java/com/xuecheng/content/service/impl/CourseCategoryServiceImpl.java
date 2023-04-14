package com.xuecheng.content.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuecheng.content.model.po.CourseCategory;
import com.xuecheng.content.service.CourseCategoryService;
import com.xuecheng.content.mapper.CourseCategoryMapper;
import org.springframework.stereotype.Service;

/**
* @author qianzhikang
* @description 针对表【course_category(课程分类)】的数据库操作Service实现
* @createDate 2023-04-14 15:57:14
*/
@Service
public class CourseCategoryServiceImpl extends ServiceImpl<CourseCategoryMapper, CourseCategory>
    implements CourseCategoryService{

}




