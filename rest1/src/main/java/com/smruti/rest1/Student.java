package com.smruti.rest1;

public class Student {
    private String name;
    private int roll;

    public Student() {
    }

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

}
