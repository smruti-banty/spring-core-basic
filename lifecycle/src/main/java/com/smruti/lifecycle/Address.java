package com.smruti.lifecycle;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Address {

    private String city;

    Address() {
        System.out.println("Address class constructor called");
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        System.out.println("setter method called");
        this.city = city;
    }

    @PostConstruct
    void init() {
        System.out.println("Address class init method callled");
    }

    @PreDestroy
    void destroy() {
        System.out.println("Address class destroy method callled");
    }
}
