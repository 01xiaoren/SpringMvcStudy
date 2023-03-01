package com.xiaoren.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

//web容器配置类
public class ServletConfig extends AbstractDispatcherServletInitializer {

    //加载springmvc配置类，产生springmvc容器（本质还是spring容器）
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        //初始化WebApplicationContext对象
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        //加载Spring配置类
        context.register(SpringMvcConfig.class);
        return context;
    }

    //mvc控制请求的映射路径
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    //加载Spring配置
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
