package com.xiaoren.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xiaoren.controller")
@EnableWebMvc//启动mvc的辅助功能这里主要是转换json对象
public class SpringMvcConfig {
}
