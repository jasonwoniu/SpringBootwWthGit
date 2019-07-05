package com.example.demo.config;

import com.example.demo.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //需要拦截的路径
        String[] addPathPatterns = {
                "/hellojsp"
        };
        //不需要的拦截路径
        String[] excludePathPatterns = {
                "/hello/boot"
        };
        //可以将添加拦截的路径和不需要拦截的路径都写在一行上。
        registry.addInterceptor(new MyInterceptor()).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);
    }
}
