package com.smruti.commandline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandlineApplication {

	public static void main(String[] args) {
		for (String string : args) {
			System.out.println(string);
		}
		SpringApplication.run(CommandlineApplication.class, args);
	}

}
