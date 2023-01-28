package com.smruti.rest1;

import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Rest1Application implements CommandLineRunner {
	@Autowired
	private StudentService studentService;

	public static void main(String[] args) {
		SpringApplication.run(Rest1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
