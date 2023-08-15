package com.hong.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.hong.interceptor.Interceptor;

@Configuration
public class MVCConfig implements WebMvcConfigurer{
    @Autowired
    private Interceptor interceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // TODO Auto-generated method stub
        WebMvcConfigurer.super.addInterceptors(registry);
        registry.addInterceptor(interceptor).addPathPatterns("/**");
    }
}
