package com.mycompany.app;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Hello world!
 */
public class App extends SpringBootServletInitialize{

    private static final String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
    }
}
