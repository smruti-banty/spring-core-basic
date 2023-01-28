package com.smruti.dbconnection;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbconnectionApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(DbconnectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Student student = new Student(105, "smaranika", 65487.23);

		studentRepository.save(student);
		// List<Student> students = studentRepository.findAll();
		// System.out.println(students);
		// Optional<Student> stud = studentRepository.findById(101);
		// if(stud.isPresent())
		// System.out.println(stud.get());
	}

}
