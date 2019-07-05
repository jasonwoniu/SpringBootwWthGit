package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        //它会启动springboot程序，启动spring容器，启动内嵌的tomcat服务器
        SpringApplication.run(DemoApplication.class, args);
    }
}
