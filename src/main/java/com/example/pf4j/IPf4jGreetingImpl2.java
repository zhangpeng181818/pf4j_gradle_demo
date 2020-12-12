package com.example.pf4j;

import org.pf4j.Extension;

@Extension(ordinal = 1)
public class IPf4jGreetingImpl2 implements IPf4jGreeting {
    @Override
    public void sayHello() {
        System.out.println("hi, mia.");
    }
}
