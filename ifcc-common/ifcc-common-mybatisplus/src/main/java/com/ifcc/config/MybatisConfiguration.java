package com.ifcc.config;

import com.ifcc.inteceptor.SqlBeautyInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 引用展示具体sql的插件SqlBeautyInterceptor
 */
@Configuration
public class MybatisConfiguration {

    @Bean
    @ConditionalOnProperty(name = {"sql.beauty.show"},havingValue = "true" ,matchIfMissing = true)
    public SqlBeautyInterceptor sqlBeautyInterceptor(){
      return   new SqlBeautyInterceptor();
    }
}
