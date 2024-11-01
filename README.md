# spring-boot-demo



## todo


| 状态 | 项目                                                                                               | 简述                     |
|:--:|:-------------------------------------------------------------------------------------------------|:-----------------------|
| ✅  | [common-core](demo-common/common-core)                                                           | [通用核心模块](#common-core) |
| ✅  | [common-operation-log-spring-boot-starter](demo-common/common-operation-log-spring-boot-starter) | [spring-boot-start](#spring-boot-start) |
|    |







## common-core
项目中的通用模块例如  
工具类的封装  
这个包是所有项目都要依赖的通用依赖   
时间工具类
json工具类
通用注解





## spring-boot-start
之前如何自动配置    
配置位置    
src/java/resources/META-INF/spring.factories    
Spring Boot 3.0以前都兼容在spring.factories里配置，2.7及以上推荐AutoConfiguration.imports机制
配合 @Configuration(Spring Boot 2.7以下推荐) 


Spring Boot 2.4
AutoConfiguration.imports机制
配置位置
src/java/resources/META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports
配合 @Configuration(Spring Boot 2.4 -2.6推荐) 或 @AutoConfiguration(Spring Boot 2.7及以上推荐)

>Spring Boot 2.4 引入AutoConfiguration.imports机制
>
>org.springframework.boot.autoconfigure.AutoConfiguration.imports
>
>Spring Boot 2.7 引入@AutoConfiguration并推荐使用AutoConfiguration.imports机制
>
>Spring Boot 3.0 移除了 spring.factories 的自动配置支持
>
