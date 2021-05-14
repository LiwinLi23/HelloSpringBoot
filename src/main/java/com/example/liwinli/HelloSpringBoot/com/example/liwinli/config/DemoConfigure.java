package com.example.liwinli.HelloSpringBoot.com.example.liwinli.config;

import com.example.liwinli.HelloSpringBoot.com.example.liwinli.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfigure {
    @Bean
    public HelloService getHelloService() {
        System.out.println("配置类为容器中添加了组件HelloService");
        return new HelloService();
    }
}
