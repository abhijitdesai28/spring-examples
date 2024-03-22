package com.abhi.practice;

import com.abhi.practice.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        HelloService helloService = (HelloService) context.getBean("helloService",HelloService.class);
        helloService.sayHello();
    }
}
