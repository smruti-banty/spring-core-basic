package com.smruti.cliargs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CliargsApplication implements CommandLineRunner {

	@Autowired
	private Demo demo;

	public static void main(String[] args) {
		System.out.println("main method");
		SpringApplication.run(CliargsApplication.class, args);
		System.out.println("main ended ");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("run method called " );
		demo.msg();
	}

}
