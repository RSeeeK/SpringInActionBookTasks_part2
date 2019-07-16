package com.agr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception{
//        ApplicationContext ctx =
//                new ClassPathXmlApplicationContext(
//                        "springinaction_part2.xml");

//        Performer performer = (Performer) ctx.getBean("kenny");
//        performer.perform();

        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.agr");
    }
}
