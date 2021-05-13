package com.example.liwinli;

import com.example.liwinli.com.example.liwinli.bean.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class HelloSpringBootApplicationTests {
	@Autowired
	Person person;

	@Test
	void contextLoads() {
		System.out.print(person);
	}

}
