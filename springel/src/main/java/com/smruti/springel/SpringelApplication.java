package com.smruti.springel;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringelApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringelApplication.class, args);

		Student student = run.getBean(Student.class);

		Logger logger = Logger.getLogger("com.smruti.springel.SpringelApplication");

		logger.info(student.getName());
		logger.warning(student.getFee()+"");
		logger.severe(student.getRoll()+"");
	}

}
