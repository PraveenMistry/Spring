package com.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Praveen on 09/03/19.
 */

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld hw = (HelloWorld) context.getBean("helloWorld");
        hw.getMessage1();
        hw.getMessage2();

        HelloIndia hi = (HelloIndia) context.getBean("helloIndia");
        hi.getMessage1();
        hi.getMessage2();
        hi.getMessage3();

    }
}
