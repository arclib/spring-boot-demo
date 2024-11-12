package com.example.demo.common.core.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
/**
 * JSON 工具类
 * private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();: 创建了一个私有的静态不可变的 ObjectMapper 实例，ObjectMapper 是 Jackson 库中用于序列化和反序列化 JSON 的核心类。
 * static { ... }: 这是一个静态初始化块，用于在类加载时执行一些初始化操作。在这里，OBJECT_MAPPER 被配置以在反序列化时忽略未知属性和在序列化时忽略空的 Java Bean 属性，并且注册了一个 JavaTimeModule 模块，用于解决 LocalDateTime 类型的序列化问题。
 * public static String toJsonString(Object obj) { ... }: 这是一个公共静态方法，用于将给定的 Java 对象序列化为 JSON 字符串。它接受一个 Object 类型的参数 obj，并使用 OBJECT_MAPPER 将其转换为 JSON 字符串并返回。
 * @SneakyThrows: 这是 Lombok 提供的一个注解，用于简化异常处理。它会将被标注的方法中的受检异常转换为不受检异常，使得代码看起来更加简洁。
 */
public class JsonUtils {

    private static ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    /**
     *  将对象转换为 JSON 字符串
     * @param obj
     * @return
     *
     */
    @SneakyThrows
    public static String toJsonString(Object obj) {
       return OBJECT_MAPPER.writeValueAsString(obj);
    }

    /**
     * 初始化：统一使用 Spring Boot 个性化配置的 ObjectMapper
     *
     * @param objectMapper
     */
    public static void init(ObjectMapper objectMapper) {
        OBJECT_MAPPER = objectMapper;
    }
}