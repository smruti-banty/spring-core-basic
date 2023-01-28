package com.example.crudoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudoperation.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
    
}
