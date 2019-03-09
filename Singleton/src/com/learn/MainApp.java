package com.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Praveen on 09/03/19.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Singleton s = (Singleton) context.getBean("singletonBean");
        s.getMessage();

        s.setMessage("I'm object s");
        s.getMessage();

        Singleton s1 = (Singleton) context.getBean("singletonBean");
        s1.getMessage();
        s.setMessage("I'm object s1");
        s1.getMessage();
        s.getMessage();
    }

}
