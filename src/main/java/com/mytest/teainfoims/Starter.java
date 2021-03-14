package com.mytest.teainfoims;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/1/23
 *
 *
 */
@SpringBootApplication
@MapperScan(basePackages = "com.mytest.teainfoims.dao")
@EnableAsync
public class Starter {
    public static void main(String[] args) {
        SpringApplication.run(Starter.class,args);
    }
}