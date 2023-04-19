package com.xuecheng.content.service;

import com.xuecheng.content.model.dto.BindTeachplanMediaDto;
import com.xuecheng.content.model.dto.SaveTeachplanDto;
import com.xuecheng.content.model.dto.TeachplanDto;
import com.xuecheng.content.model.po.Teachplan;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xuecheng.content.model.po.TeachplanMedia;

import java.util.List;

/**
* @author qianzhikang
* @description 针对表【teachplan(课程计划)】的数据库操作Service
* @createDate 2023-04-14 15:57:14
*/
public interface TeachplanService extends IService<Teachplan> {

    List<TeachplanDto> findTeachplanTree(Long courseId);

    void saveTeachplan(SaveTeachplanDto teachplanDto);

    void deleteTeachplan(Long teachplanId);

    void orderByTeachplan(String moveType, Long teachplanId);

   TeachplanMedia associationMedia(BindTeachplanMediaDto bindTeachplanMediaDto);
}
