package com.example.modules.auth;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * DemoAuthApplication启动类
 * MapperScan注解扫Mapper接口
 *
 * @author libo
 */
@Slf4j
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class },scanBasePackages = {"com.example.common"})
public class DemoAuthApplication {

    public static void main(String[] args) {
        // SpringApplication.run(DemoAuthApplication.class, args);
        ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoAuthApplication.class, args);
        log.info("main run success...");
    }

}
