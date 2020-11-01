package com.ssq.quickspringboot.config;

import com.ssq.quickspringboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * 配置文件类，留着后期使用
 *
 * @Configuration 指明当前类是一个配置类，用来替代spring的配置文件
 */
@Configuration
public class MyConfig {

    //将方法的返回值添加到容器中，容器中这个组件的id就是方法名
//    @Bean
//    public HelloService helloServiceTest(){
//        Map<Long, String> users = Collections.synchronizedMap(new HashMap<Long, String>());
//        System.out.println("======组件已添加进容器======");
//        return new HelloService();
//    }
}
