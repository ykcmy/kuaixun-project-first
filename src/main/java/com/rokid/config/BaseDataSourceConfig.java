package com.rokid.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * 〈数据源配置〉
 *
 * @author yangkai
 * @create 2018/2/28
 * @since 1.0.0
 */
@Configuration
@MapperScan(basePackages = "springboot.model.base",sqlSessionTemplateRef = "baseSqlSessionTemplate")
public class BaseDataSourceConfig {
    @Bean(name="baseDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.base")
    @Primary
    public DataSource setDataSource(){
        return DataSourceBuilder.create().build();
    }
}