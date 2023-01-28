package com.smruti.rest1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * StudentService
 */
@Service
public class StudentService {
    private List<Student> students = new ArrayList<>();

    public void add(Student student) {
        students.add(student);
    }

    public List<Student> allStudent() {
        return students;
    }

    public Student findByRoll(int roll) {
        return students.stream().filter(student -> student.getRoll() == roll).findFirst().get();
    }
}