package com.smruti.demo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Demo3Application.class, args);
		
		Student student = run.getBean(Student.class);

		System.out.println(student.getName());
		System.out.println(student.getRoll());

		System.out.println("--------------");

		System.out.println(run.getBean(Employee.class));
		
	}

}
