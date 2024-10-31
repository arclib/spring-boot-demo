package com.example.demo.auth.controller;

import com.example.demo.common.core.reponse.Response;
import com.example.demo.common.opeation.log.aspect.ApiOperationLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author arcli
 */
@RestController
public class TestController {
    @ApiOperationLog(description = "测试接口")
    @GetMapping("/test")
    public Response<String> test() {
        return Response.success("Hello123, 犬小哈专栏");
    }
    @GetMapping("/test2")
    @ApiOperationLog(description = "测试接口2")
    public Response<User> test2() {
        return Response.success(User.builder()
                .nickName("犬小哈")
                .createTime(LocalDateTime.now()).updateTime(new Date())
                .build());
    }
}