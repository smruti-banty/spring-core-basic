package com.smruti.springel;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("${student.roll}")
    private int roll;
    @Value("#{ ${student.fee} + 200}")
    private double fee;
    @Value("${student.name}")
    private String name;

    public int getRoll() {
        Logger logger = Logger.getLogger("com.smruti.springel.Student");
        logger.info("getroll called");
        return roll;
    }

    public double getFee() {
        return fee;
    }

    public String getName() {
        return name;
    }
    
}
