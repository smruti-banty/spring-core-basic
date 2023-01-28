package com.example.crudoperation.controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudoperation.model.Student;
import com.example.crudoperation.service.StudentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<Student> findAllStudent() {
        return studentService.getAllStudent();
    }

    @GetMapping("/{roll}")
    public Student getStudent(@PathVariable int roll) {
        return studentService.findById(roll);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Student addStudent(@RequestBody Student student) {
        studentService.add(student);
        return student;
    }

    @PutMapping("/{roll}")
    public Student update(@RequestBody Student student, @PathVariable int roll) {
        Student exitStudent = studentService.findById(roll);
        exitStudent.setName(student.getName());
        exitStudent.setRoll(roll);
        studentService.add(exitStudent);
        return student;
    }

    @DeleteMapping("/{roll}")
    public Student delete(@PathVariable int roll) {
        studentService.delete(studentService.findById(roll));
        return null;
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ProblemDetail noStudent(Exception e) {
        return ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(404), e.getMessage());
    }
}
