package com.xuecheng;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description 启动入口
 * @Date 2023-04-14-16-13
 * @Author qianzhikang
 */
@SpringBootApplication
@EnableSwagger2Doc
public class ContentApplication {
    public static void main(String[] args) {
        SpringApplication.run(ContentApplication.class, args);
    }
}

