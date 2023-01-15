package com.smruti.demo2;

import org.springframework.stereotype.Component;

@Component("st")
public class Student {
    
    private int roll;
    
    void msg() {
        System.out.println("Hellow");
    }
}   
