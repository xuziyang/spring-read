package com.xzy.spring;

import com.xzy.spring.aop.Waiter;
import com.xzy.spring.autowire.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class AnnotationApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AnnotationApplication.class);
//        Waiter bean = ctx.getBean(Waiter.class);
//        bean.greetTo("xzy");

        UserService userService  = ctx.getBean(UserService.class);
        System.out.println(userService.getUserDao());
    }
}
