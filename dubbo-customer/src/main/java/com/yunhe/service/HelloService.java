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

    @Reference(version = "1.0.0")
    private HelloInterface helloInterface;

    public void sayHello(String name) {
        helloInterface.sayHello(name);
    }


    public String talkHello(String name) {
        return helloInterface.talkHello(name);
    }


    public Hello speakHello(String customer) {
        return helloInterface.speakHello(customer);
    }


}
