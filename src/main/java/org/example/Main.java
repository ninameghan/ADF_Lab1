package org.example;

import org.example.entities.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.setProperty("spring.profiles.active", "eu,af,sa");

        // Beans created using XML
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.config.xml");
        System.out.println("XML Beans\n===========");
        applicationContext.getBeansOfType(Country.class)
                .forEach((key, value) -> System.out.println(key + ": " + value));

        // Beans created using Java
        ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(Beans.class);
        System.out.println("\nJava Beans\n===========");
        applicationContext1.getBeansOfType(Country.class)
                .forEach((key, value) -> System.out.println(key + ": " + value));
    }
}