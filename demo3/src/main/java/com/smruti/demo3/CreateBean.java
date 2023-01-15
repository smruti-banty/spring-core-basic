package com.smruti.demo3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreateBean {
    
    @Bean
    public Student student()
    {
        Student student = new Student("Subham", 101);
        return student;
    }

    @Bean
    public Employee employee() 
    {
        return new Employee("Bastia", 1);
    }
}
