package com.zhujun.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.sql.Time;

@Configuration
public class WebConfigure implements WebMvcConfigurer {

    private final LogInterceptor logInterceptor;

    private final TimeInterceptor timeInterceptor;

    public WebConfigure(LogInterceptor logInterceptor, TimeInterceptor timeInterceptor) {
        this.logInterceptor = logInterceptor;
        this.timeInterceptor = timeInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(logInterceptor);
        registry.addInterceptor(timeInterceptor);
    }
}
