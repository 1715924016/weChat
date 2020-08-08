package com.weChat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;


// 当前项目启动类
@SpringBootApplication // spring boot 支持 移动应用的注解
// 当前启动类所扫描文件位置，当有SpringBootApplication注解时需要注意此注解的使用
@ComponentScan("com.weChat.*")
// 扫描 Mapper 范围定义
@MapperScan("com.weChat.mapper")
public class Application {

    // 启动类主方法 - 启动方法就是其本身（及其方法内引用、关联的方法模块）
    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

    }
}
