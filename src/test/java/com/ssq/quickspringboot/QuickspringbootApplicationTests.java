package com.ssq.quickspringboot;

import com.ssq.quickspringboot.bean.Dog;
import com.ssq.quickspringboot.bean.Person;
import javafx.application.Application;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;


@SpringBootTest
class QuickspringbootApplicationTests {

	@Autowired
	Person person;
	@Autowired
	Dog dog;

	@Autowired
	ApplicationContext ioc;

	@Test
	void contextLoads() {

		System.out.println(person);
		System.out.println(dog);
	}

	@Test
	void helloService(){
		boolean flag = ioc.containsBean("helloService");
		System.out.println(flag);
	}

}
