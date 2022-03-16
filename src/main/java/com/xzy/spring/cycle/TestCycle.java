package com.xzy.spring.cycle;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCycle {

    public static void main(String[] args) {
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\code\\read\\spring-read");

        ApplicationContext ac = new ClassPathXmlApplicationContext("cycle.xml");
        A a = ac.getBean(A.class);
        System.out.println(a.getB());
        B b = ac.getBean(B.class);
        System.out.println(b.getA());
    }
}
