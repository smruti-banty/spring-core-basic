package com.example.crudoperation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.crudoperation.model.Student;
import com.example.crudoperation.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Student add(Student student) {
        studentRepository.save(student);
        return student;
    }

    public Student findById(int roll) {
        return studentRepository.findById(roll).orElseThrow();
    }

    public void delete(Student student) {
        studentRepository.delete(student);
    }

    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

}
