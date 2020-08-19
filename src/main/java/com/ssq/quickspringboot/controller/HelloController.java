package com.ssq.quickspringboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//这个类下的所有返回数据是json
@RestController
public class HelloController {

    @Value("${person.last-name}")
    private String name;

    @RequestMapping("/hello")
    public String helloWorld(){
        return "Hello quick spring boot"+name;
    }
}
