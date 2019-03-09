package com.learn;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Praveen on 09/03/19.
 */

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        BeanLifeCycle obj = (BeanLifeCycle) context.getBean("beanLifeCycle");
        obj.getMessage();
        context.registerShutdownHook();
    }

}
