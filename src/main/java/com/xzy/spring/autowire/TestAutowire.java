package com.xzy.spring.autowire;

import com.xzy.spring.AnnotationApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class TestAutowire {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AnnotationApplication.class);

        UserService userService = ctx.getBean(UserService.class);
        System.out.println(userService.getUserDao());
    }
}
