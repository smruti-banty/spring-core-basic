package com.smruti.cliargs;

import org.springframework.stereotype.Component;

@Component
public class Demo {
    Demo() {
        System.out.println("Demo Constructor");
    }

    void msg() {
        System.out.println("msg method called");
    }
}
