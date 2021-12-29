package com.xzy.spring;

import com.xzy.spring.custom.xml.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        Student stu = (Student) context.getBean("stu01");
        System.out.println(stu);
    
        Object boss = context.getBean("boss");
        System.out.println(boss);
        
    }
}
