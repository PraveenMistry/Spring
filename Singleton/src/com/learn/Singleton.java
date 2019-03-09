package com.learn;

/**
 * Created by Praveen on 09/03/19.
 */
public class Singleton {

    private String message;

    public String getMessage() {
        System.out.println("Your Message : " + message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
