package com.example.web;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
@SpringBootApplication(scanBasePackages={"com.example","com.demo"})
@MapperScan(value = {"com.example.permission.dao","com.example.role.dao","com.demo.user.center.dao.","com.example.web.dao"})
public class WebCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebCenterApplication.class, args);
    }

}

