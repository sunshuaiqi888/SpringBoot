package com.ssq.quickspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//这个类下的所有返回数据是json
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String helloWorld(){
        return "Hello quick spring boot ";
    }
}
