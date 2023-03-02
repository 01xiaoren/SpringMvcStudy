package com.xiaoren.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MybatisConfig {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean sql = new SqlSessionFactoryBean();
        sql.setDataSource(dataSource);
        sql.setTypeAliasesPackage("com.xiaoren.domain");
        return sql;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer (){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.xiaoren.dao");
        return msc;
    }
}
