package org.example;

import org.example.entities.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Beans created using XML
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.config.xml");
        Country ireland = (Country) applicationContext.getBean("ie");
        Country spain = (Country) applicationContext.getBean("es");
        Country france = (Country) applicationContext.getBean("fr");
        Country nigeria = (Country) applicationContext.getBean("ni");
        Country egypt = (Country) applicationContext.getBean("eg");
        System.out.println(ireland);
        System.out.println(spain);
        System.out.println(france);
        System.out.println(nigeria);
        System.out.println(egypt);

        // Beans created using Java
//        ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(Beans.class);
//        Country brazil = (Country) applicationContext1.getBean("br");
//        Country peru = (Country) applicationContext1.getBean("pe");
//        Country venezuela = (Country) applicationContext1.getBean("ve");
//        System.out.println(brazil);
//        System.out.println(peru);
//        System.out.println(venezuela);
    }
}