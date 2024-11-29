# spring-boot-demo



## todo



**demo-common**     
- [x] common-core
- [x] common-operation-log-spring-boot-starter      
- [x] common-jackson-spring-boot-start   
- [ ] common-dao   
- [ ] 
**demo-modules**   
- [ ] demo-auth
- [ ] demo-kafka 

#### 基于 HTML 样式

<div style="display:none">
这是一段被注释掉的文字123
</div>

这是一段没有被注释的文字 123

## common-core
项目中的通用模块例如  
工具类的封装  
这个包是所有项目都要依赖的通用依赖   
时间工具类
json工具类
通用注解

## demo-kafka
参考
简单案例
https://blog.csdn.net/weixin_48968553/article/details/143826457
带回调的案例
https://cloud.tencent.com/developer/article/2036877














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

