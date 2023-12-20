package com.wen.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * projectName: b2c-store
 * Author:Wen Xie
 * description: 用户服务的启动类
 */
@MapperScan(basePackages = "com.wen.user.mapper")
@SpringBootApplication
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
}
