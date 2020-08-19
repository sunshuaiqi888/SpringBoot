package com.ssq.quickspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 *@SpringBootApplication 标注一个主程序类，说明这是一个sprongboot应用
 */
//@ImportResource(locations = "classpath:bean.xml")  springboot推荐使用注解配置
@SpringBootApplication
public class QuickspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickspringbootApplication.class, args);
	}

}
