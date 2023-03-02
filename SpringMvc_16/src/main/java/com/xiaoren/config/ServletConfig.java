package com.xiaoren.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class ServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }


    /***
     * 解决字符串乱码问题
     */


    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter act = new CharacterEncodingFilter();
        act.setEncoding("utf8");//字符编码utf8
        return new Filter[]{};
    }
}
