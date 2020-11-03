package com.ssq.quickspringboot;

import com.ssq.quickspringboot.bean.Dog;
import com.ssq.quickspringboot.bean.Person;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;


@SpringBootTest
public class QuickspringbootApplicationTests {

	@Autowired
	Person person;
	@Autowired
	Dog dog;

	@Autowired
	ApplicationContext ioc;

	@Test
	public void contextLoads() {

		System.out.println(person);
		System.out.println(dog);
	}


}
