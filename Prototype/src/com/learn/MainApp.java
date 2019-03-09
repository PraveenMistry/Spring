package com.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Praveen on 09/03/19.
 */

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Prototype prototype = (Prototype) context.getBean("prototypeBean");
        prototype.getMessage();

        prototype.setMessage("I'm object prototype");
        prototype.getMessage();

        Prototype prototype1 = (Prototype) context.getBean("prototypeBean");
        prototype1.getMessage();
    }

}
