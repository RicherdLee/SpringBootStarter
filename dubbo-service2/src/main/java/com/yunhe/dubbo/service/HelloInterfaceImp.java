package com.yunhe.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import interfaces.HelloInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import pojo.Hello;

/**
 * Created by lihao on 2019/4/10.
 */
@Service(version = "1.0.0", group = "service2")
@Component
public class HelloInterfaceImp implements HelloInterface {

    @Value("${dubbo.application.name}")
    private String dubboApplicationName;


    @Override
    public void sayHello(String name) {
        System.out.println("Say Hello " + name);
    }

    @Override
    public String talkHello(String name) {
        return "Say Hello " + dubboApplicationName + " " + name;
    }

    @Override
    public Hello speakHello(String customer) {
        Hello hello = new Hello();
        hello.setCustomer(customer);
        hello.setService(dubboApplicationName);
        return hello;
    }
}
