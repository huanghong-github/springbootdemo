package com.hong;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.hong.service.StudentService;

@SpringBootTest
class DemoWebApplicationTests {
	@Autowired
	private StudentService studentService;
	@Autowired
	private ApplicationContext applicationContext;

	@Test
	void contextLoads() {
		Arrays.asList(applicationContext.getBeanDefinitionNames()).stream().forEach((String name) -> {
			System.out.println(name);
		});
	}

	@Test
	void testList() {
		studentService.list().stream().forEach((student) -> {
			System.out.println(student);
		});
	}


}
