package com.yunhe.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo() //开启dubbo
public class DubboService1Application {

    public static void main(String[] args) {
        SpringApplication.run(DubboService1Application.class, args);
    }

}
