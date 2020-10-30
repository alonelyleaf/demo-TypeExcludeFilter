package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.Map;

@Configuration
public class MyConfiguration {

    @Resource
    private Map<String, Object> consumerContainer;

    @Bean
    public MyAspect myAspect() {
        return new MyAspect(this.consumerContainer);
    }
}
