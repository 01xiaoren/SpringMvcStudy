package com.xiaoren.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.xiaoren.controller","com.xiaoren.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
/**
 * //实现WebMvcConfigurer接口可以简化开发，"但具有一定的侵入性"
 * public class SpringMvcConfig implements WebMvcConfigurer {
 *
 * @Autowired
 * private ProjectInterceptor projectInterceptor;
 * @Override
 * public void addInterceptors(InterceptorRegistry registry) {
 * //配置多拦截器
 * registry.addInterceptor(projectInterceptor).addPathPatterns("/books","/books/*");
 * registry.addInterceptor(projectInterceptor2).addPathPatterns("/books","/books/*");
 * }
 */