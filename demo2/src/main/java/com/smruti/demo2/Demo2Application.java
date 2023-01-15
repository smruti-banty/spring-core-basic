package com.smruti.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Demo2Application.class, args);

		// run.getBean(Student.class).msg();
		// Animal animal = run.getBean(Animal.class);
		// animal.eat();

		// Object bean = run.getBean("student");
		// Student student = (Student) bean;
		// student.msg();

		Student st = run.getBean("st", Student.class);
		st.msg();

	}
}
