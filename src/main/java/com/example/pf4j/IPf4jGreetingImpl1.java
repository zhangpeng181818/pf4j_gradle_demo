package com.example.pf4j;

import org.pf4j.Extension;

@Extension(ordinal = 2)
public class IPf4jGreetingImpl1 implements IPf4jGreeting {
    @Override
    public void sayHello() {
        System.out.println("hello, world.");
    }
}