package com.smruti.rest1;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/student")
public class StudentController {

    @GetMapping
    Student getStudent() {
        return new Student("bastia", 101);
    }
}
