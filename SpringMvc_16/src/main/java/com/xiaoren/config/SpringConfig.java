package com.xiaoren.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.xiaoren.service")
@PropertySource("classpath:Jdbc.properties")
@EnableTransactionManagement//事务记载
@Import({JdbcConfig.class, MybatisConfig.class})
public class SpringConfig {
}
