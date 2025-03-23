package com.uday.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class   App
{
    public static void main( String[] args )
    {
//        BeanFactory context = new ClassPathXmlApplicationContext("Spring.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

        Alien obj =   context.getBean(Alien.class);
        obj.code();
//        System.out.println(obj.getAge());
//        obj.setAge(12);
//        System.out.println(obj.getAge());
    }
}
