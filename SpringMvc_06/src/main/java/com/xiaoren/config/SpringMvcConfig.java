package com.xiaoren.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xiaoren")
//这里的功能是开启json数据类型自动转换
//主要是开启SpringMvc多项功能
@EnableWebMvc
public class SpringMvcConfig {
}
