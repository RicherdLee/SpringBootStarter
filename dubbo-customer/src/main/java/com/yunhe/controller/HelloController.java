package com.yunhe.controller;

import com.yunhe.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pojo.Hello;

/**
 * Created by lihao on 2019/4/10.
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello() {
        String name = "server1";
        helloService.sayHello(name);
        return name;
    }


    @GetMapping("/talk")

    public String talkHello(@RequestParam("name") String name) {
        return helloService.talkHello(name);
    }


    @GetMapping("/speak")

    public Hello speakHello(@RequestParam("name") String name) {
        return helloService.speakHello(name);
    }
}
