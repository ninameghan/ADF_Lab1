package org.example;

import org.example.entities.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.setProperty("spring.profiles.active", "eu,af,sa");

        // Beans created using XML
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.config.xml");
        System.out.println();
        System.out.println(applicationContext.getMessage("xmlHeading", null, Locale.getDefault()));
        System.out.println("====================");
        applicationContext.getBeansOfType(Country.class)
                .forEach((key, value) -> System.out.println(key + ": " + value));

        // Beans created using Java
        ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(Beans.class);
        System.out.println();
        System.out.println(applicationContext.getMessage("javaHeading", null, Locale.FRENCH));
        System.out.println("====================");
        applicationContext1.getBeansOfType(Country.class)
                .forEach((key, value) -> System.out.println(key + ": " + value));
    }
}