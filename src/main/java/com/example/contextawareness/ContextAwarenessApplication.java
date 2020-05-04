package com.example.contextawareness;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ContextAwarenessApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ContextAwarenessApplication.class, args);
        //by default - we have context available within @SpringBootApplication. This is because this class
        //has "entry point" for JVM thus it must bootstrap Spring framework itself. But our custom-created
        //class can't "see" spring context by default...
        Integer res = context.getBean(MainService.class).calculate();
        System.out.println(res);

    }

}
