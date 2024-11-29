// package com.example.demo.auth.congfig;
//
// import org.springframework.context.annotation.Bean;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.web.SecurityFilterChain;
//
//
// /**
//  * 3配置类
//  * @author lib
//  * @since 2024/11/15
//  */
//
// @EnableWebSecurity
// public class WebSecurityConfig {
//     /**
//      * 安全过滤器，配置 URL 的安全配置
//      * <p>
//      * anyRequest          |   匹配所有请求路径
//      * access              |   SpringEl表达式结果为true时可以访问
//      * anonymous           |   匿名可以访问
//      * denyAll             |   用户不能访问
//      * fullyAuthenticated  |   用户完全认证可以访问（非remember-me下自动登录）
//      * hasAnyAuthority     |   如果有参数，参数表示权限，则其中任何一个权限可以访问
//      * hasAnyRole          |   如果有参数，参数表示角色，则其中任何一个角色可以访问
//      * hasAuthority        |   如果有参数，参数表示权限，则其权限可以访问
//      * hasIpAddress        |   如果有参数，参数表示IP地址，如果用户IP和参数匹配，则可以访问
//      * hasRole             |   如果有参数，参数表示角色，则其角色可以访问
//      * permitAll           |   用户可以任意访问
//      * rememberMe          |   允许通过remember-me登录的用户访问
//      * authenticated       |   用户登录后可访问
//      */
//     @Bean
//     SecurityFilterChain defaultSecurityFilterChain(HttpSecurity httpSecurity) throws Exception {
//         httpSecurity
//                 // 开启跨域
// //                .cors().and()
//                 // 禁用CSRF，因为不使用 session,前后端分离项目不需要
//                 .csrf().disable()
//                 // 禁用session,前后端分离项目基于token不需要
//                 .sessionManagement(AbstractHttpConfigurer::disable)
//                 .authorizeRequests(
//                         authorizeRequests -> authorizeRequests.antMatchers("/toLogin").permitAll()
//                                 .anyRequest().authenticated()
//                 );
//         return httpSecurity.build();
//     }
//
//     @Bean
//     public PasswordEncoder passwordEncoder() {
//         return new BCryptPasswordEncoder();
//     }
// }
