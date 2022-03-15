package com.xzy.spring;

import com.xzy.spring.lifecycle.LifeCycleBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
//        Student stu = (Student) context.getBean("stu01");
//        System.out.println(stu);
//
//        Object boss = context.getBean("boss");
//        System.out.println(boss);
//
//        Waiter waiter = context.getBean(Waiter.class);
//        waiter.greetTo("xzy");

        LifeCycleBean lifeCycleBean = context.getBean("lifeCycleBean", LifeCycleBean.class);
        System.out.println(lifeCycleBean.getName());

    }
}
