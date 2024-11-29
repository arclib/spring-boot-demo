package com.example.common.dao.config;

import com.ulisesbocchio.jasyptspringboot.encryptor.DefaultLazyEncryptor;
import org.jasypt.encryption.StringEncryptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement
@Configuration
@MapperScan("com.example.**.mapper*")// 扫描 Mapper 文件夹
public class MybatisPlusConfig {

    public static void main(String[] args) {
        StringEncryptor stringEncryptor = new DefaultLazyEncryptor(new StandardEnvironment());
        System.setProperty("jasypt.encryptor.password", "123");
        String encrypt = stringEncryptor.encrypt("as123*&");
        String decrypt = stringEncryptor.decrypt(encrypt);
        System.out.println("加密： " + encrypt);
        System.out.println("解密： " + decrypt);


    }
}
