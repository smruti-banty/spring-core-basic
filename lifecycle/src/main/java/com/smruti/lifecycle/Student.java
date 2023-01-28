package com.smruti.lifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Student {
    @Autowired
    private Address address;

    Student() {
        System.out.println("Student class Constructor called");
    }

    @PostConstruct
    void init() {
        System.out.println("student class init method callled");
    }

    @PostConstruct
    void init1() {
        System.out.println("student class init1 method callled");
    }

    @PreDestroy
    void destroy() {
        System.out.println("student class destroy method callled");
    }
}
