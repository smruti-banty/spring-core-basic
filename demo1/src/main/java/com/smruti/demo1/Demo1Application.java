package com.smruti.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Demo1Application.class, args);
		System.out.println("Hello World");
		// run.close();
	}

}
