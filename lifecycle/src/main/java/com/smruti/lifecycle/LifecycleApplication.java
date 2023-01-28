package com.smruti.lifecycle;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LifecycleApplication implements CommandLineRunner{

	public static void main(String[] args) {
		System.out.println("main execution starts");
		
		ConfigurableApplicationContext run = SpringApplication.run(LifecycleApplication.class, args);
		
		System.out.println("main execution end");

		run.close();

		System.out.println("main still executing ");

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("run method called");
	}	

}
