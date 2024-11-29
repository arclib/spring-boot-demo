package com.example.modules.auth.controller;

import com.example.common.core.reponse.Response;
import com.example.common.opeation.log.aspect.ApiOperationLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

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

    @PostMapping("/test3")
    @ApiOperationLog(description = "测试接口3")
    public Response<User> test2() {
        User user = new User().builder().nickName("test3").updateTime(new Date()).build();
        return Response.success(user);
    }

    @GetMapping("/test3")
    @ApiOperationLog(description = "测试接口3")
    public Response test3() {
        return Response.success(test33());
    }

   private String test33(){
        String test = "";

       try {
           test = "test";
       } finally {

       }

       return test;
    }
}