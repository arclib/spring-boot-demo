package com.example.demo.auth.controller;

import com.example.demo.common.core.reponse.Response;
import com.example.demo.common.opeation.log.aspect.ApiOperationLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author arcli
 */
@RestController
public class TestController {
    @ApiOperationLog(description = "测试接口")
    @GetMapping("/test")
    public Response<String> test() {
        return Response.success("Hello123456789, 犬小哈专栏");
    }
    @PostMapping("/test2")
    @ApiOperationLog(description = "测试接口2")
    public Response<User> test2(@RequestBody User user) {
        return Response.success(user);
    }
}