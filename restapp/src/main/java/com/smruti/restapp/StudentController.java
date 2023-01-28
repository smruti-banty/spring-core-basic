package com.smruti.restapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@RestController
public class StudentController {

    private List<Student> students = new ArrayList<>();

    @PostConstruct
    void init() {
        students.addAll(
                List.of(
                        new Student(101, "smruti"),
                        new Student(102, "banty")));
    }

    @GetMapping("/students")
    List<Student> getStudent() {
        return students;
    }

    @GetMapping("/student/{roll}")
    Student getStudent(@PathVariable int roll) {
        Optional<Student> stud = students
                .stream()
                .filter(student -> student.getRoll() == roll)
                .findFirst();

        if (stud.isPresent()) {
            return stud.get();
        }

        throw new RuntimeException("Student Not Found");
    }

    @PostMapping("/student")
    Student add(@RequestBody Student student) {
        students.add(student);
        return student;
    }

    @ExceptionHandler(RuntimeException.class)
    public ProblemDetail handleException(Exception e) {
        return ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(404), e.getMessage());
    }
}
