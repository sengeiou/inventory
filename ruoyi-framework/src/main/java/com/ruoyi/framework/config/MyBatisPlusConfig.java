package com.ruoyi.framework.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2021-6-21.
 */
@Configuration
@Component
@MapperScan("com.ruoyi.system.mapper")
public class MyBatisPlusConfig
{

}
