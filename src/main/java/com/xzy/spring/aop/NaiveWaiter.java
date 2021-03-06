package com.xzy.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class NaiveWaiter implements Waiter {

    public void greetTo(String name) {
        System.out.println("greet to "+name+"...");
    }

    public void serveTo(String name){
        System.out.println("serving "+name+"...");
    }
}