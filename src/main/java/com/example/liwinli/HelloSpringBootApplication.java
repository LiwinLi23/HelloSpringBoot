package com.example.liwinli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication表明这是一个SpringBoot运用
 */
@SpringBootApplication
public class HelloSpringBootApplication {

	public static void main(String[] args) {
		// SpringApp启动起来
		SpringApplication.run(HelloSpringBootApplication.class, args);
	}

}
