package com.example.school.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@ConditionalOnClass({ SqlSessionFactory.class, SqlSessionFactoryBean.class, MybatisAutoConfiguration.class })
@MapperScan(MybatisConfiguration.BASE_MAPPER_PACKAGE)
public class MybatisConfiguration {

    Logger logger = Logger.getLogger(getClass());

    protected static final String BASE_MAPPER_PACKAGE = "com.example.school.dao";

    @PostConstruct
    public void init() {
        logger.info("加载" + BASE_MAPPER_PACKAGE + "路径下的Mapper");
    }

}
