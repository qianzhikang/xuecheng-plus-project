package com.xuecheng.content.mapper;

import com.xuecheng.content.model.dto.TeachplanDto;
import com.xuecheng.content.model.po.Teachplan;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author qianzhikang
* @description 针对表【teachplan(课程计划)】的数据库操作Mapper
* @createDate 2023-04-14 15:57:14
* @Entity com.xuecheng.content.model.po.Teachplan
*/
public interface TeachplanMapper extends BaseMapper<Teachplan> {

    List<TeachplanDto> selectTreeNodes(long courseId);
}




