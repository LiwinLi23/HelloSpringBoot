package com.example.liwinli;

import com.example.liwinli.com.example.liwinli.bean.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class HelloSpringBootApplicationTests {
	@Autowired
	Person person;

	Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	ApplicationContext applicationContext;

	@Test
	void testConfiguration() {
		boolean b = applicationContext.containsBean("getHelloService");
		System.out.println(b);
	}

	@Test
	void contextLoads() {
		System.out.print(person);
	}

	@Test
	void testSlf4j() {
		logger.trace("This is trace log"); logger.debug("This is debug log");
		logger.info("This is info log"); logger.warn("This is warn log"); logger.error("This is error log");
	}
}
