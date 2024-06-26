package com.it.controller;

import com.it.interceptors.MyInterceptor1;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.MappedInterceptor;

@Component
public class MywebMvcConfig implements WebMvcConfigurer {
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        //开启莫热门的servlet解析器
        configurer.enable();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加一个拦截器并配置拦截路径
        registry.addInterceptor(new MyInterceptor1()).addPathPatterns("/**");




    }
}
