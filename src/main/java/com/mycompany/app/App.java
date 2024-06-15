package com.mycompany.app;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Hello world!
 */
public class App extends SpringBootServletInitializer{

    private static final String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
}
