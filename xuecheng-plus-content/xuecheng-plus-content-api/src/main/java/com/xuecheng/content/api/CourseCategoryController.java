package com.xuecheng.content.api;

import com.xuecheng.content.model.dto.CourseCategoryTreeDto;
import com.xuecheng.content.service.CourseCategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description 课程分类信息
 * @Date 2023-04-17-13-10
 * @Author qianzhikang
 */
@RestController
public class CourseCategoryController {
    @Resource
    private CourseCategoryService courseCategoryService;
    @GetMapping("/course-category/tree-nodes")
    public List<CourseCategoryTreeDto> queryTreeNodes(){
        return courseCategoryService.queryTreeNodes("1");
    }
}
