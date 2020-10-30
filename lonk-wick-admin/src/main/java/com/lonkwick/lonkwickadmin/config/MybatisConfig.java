package com.lonkwick.lonkwickadmin.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan({"com.lonkwick.lonkwickadmin.mapper","com.lonkwick.lonkwickadmin.dao"})
public class MybatisConfig {

}
