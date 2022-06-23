package com.steven.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/*
    主程序类 main class ,项目入口
    这个注解：@SpringBootApplication: 这是一个springboot应用
 */
//@SpringBootApplication(scanBasePackages = "com.steven")

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {

        // 1. SpringApplication.run 返回了一个IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        // 2. 查看容器里面的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println("组件名称->"+name);
        }
    }
}
