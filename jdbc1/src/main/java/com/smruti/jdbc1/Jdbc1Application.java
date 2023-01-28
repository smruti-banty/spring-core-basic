package com.smruti.jdbc1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Jdbc1Application implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(Jdbc1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "insert into student (name,roll,fee) values('rashmi',107,9765.89)";
		jdbcTemplate.update(sql);
	}

}
