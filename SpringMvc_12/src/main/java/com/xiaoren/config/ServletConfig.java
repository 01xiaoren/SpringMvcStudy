package com.xiaoren.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class ServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
    //解决乱码

    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter ach = new CharacterEncodingFilter();
        ach.setEncoding("utf-8");
        return new Filter[]{ach};
    }
}
