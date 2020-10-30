package com.example.demo;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Map;


@Aspect
public class MyAspect implements ApplicationContextAware {

    private Map<String, Object> container;
    private ApplicationContext applicationContext;

    public MyAspect(Map<String, Object> container) {
        this.container = container;
        System.out.println(toString());
    }

    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public Map<String, Object> getContainer() {
        return container;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public String toString() {
        return "MyAspect(container=" + this.getContainer() + ", applicationContext=" + this.getApplicationContext() + ")";
    }


}
