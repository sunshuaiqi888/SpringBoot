package com.ssq.quickspringboot;

import com.ssq.quickspringboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class QuickspringbootApplicationTests {

	@Autowired
	Person person;
	@Test
	void contextLoads() {

		System.out.println(person);
	}

}
