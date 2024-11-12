package com.example.demo.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * DemoAuthApplication启动类
 * MapperScan注解扫Mapper接口
 *
 * @author libo
 */
@SpringBootApplication
@MapperScan("com.example.demo.auth.dao")
public class DemoAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoAuthApplication.class, args);
    }

}
