package com.xuecheng.content.service;

import com.xuecheng.content.model.dto.CoursePreviewDto;
import com.xuecheng.content.model.po.CoursePublish;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author qianzhikang
* @description 针对表【course_publish(课程发布)】的数据库操作Service
* @createDate 2023-04-14 15:57:14
*/
public interface CoursePublishService extends IService<CoursePublish> {
    /**
     * @description 获取课程预览信息
     * @param courseId 课程id
     * @return com.xuecheng.content.model.dto.CoursePreviewDto
     */
    CoursePreviewDto getCoursePreviewInfo(Long courseId);

}
