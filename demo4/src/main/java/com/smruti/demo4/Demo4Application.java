package com.smruti.demo4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo4Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Demo4Application.class, args);

		Student student = run.getBean(Student.class);
		
		student.setName("bastia");
		student.setRoll(101);
		student.getAddress().setCity("bbsr");
		student.getAddress().setState("Odhisa");

		System.out.println(student.getName());
		System.out.println(student.getRoll());
		System.out.println(student.getAddress().getCity());
		System.out.println(student.getAddress().getState());

	}

}
