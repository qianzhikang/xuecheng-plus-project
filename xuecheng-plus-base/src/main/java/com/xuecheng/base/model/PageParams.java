package com.xuecheng.base.model;

import lombok.Data;
import lombok.ToString;

/**
 * @Description 通用分页参数
 * @Date 2023-04-14-16-01
 * @Author qianzhikang
 */
@Data
@ToString
public class PageParams {

    //当前页码
    private Long pageNo = 1L;

    //每页记录数默认值
    private Long pageSize =10L;

    public PageParams(){

    }

    public PageParams(long pageNo,long pageSize){
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }
}
