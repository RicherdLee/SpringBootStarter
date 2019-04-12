package com.yunhe.service;

import com.alibaba.dubbo.config.annotation.Reference;
import interfaces.HelloInterface;
import org.springframework.stereotype.Service;
import pojo.Hello;

/**
 * Created by lihao on 2019/4/10.
 */
@Service
public class HelloService {

    @Reference(version = "1.0.0", group = "service1")
    private HelloInterface helloInterface1;


    @Reference(version = "1.0.0", group = "service2")
    private HelloInterface helloInterface2;

    public void sayHello(String name) {
        helloInterface1.sayHello(name);
    }


    public String talkHello(String name) {
        return helloInterface1.talkHello(name);
    }


    public Hello speakHello(String customer) {
        switch (customer) {
            case "service2":
                return helloInterface2.speakHello(customer);
            default:
                return helloInterface1.speakHello(customer);

        }
    }


}
