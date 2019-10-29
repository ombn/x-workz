package com.xworkz.boot.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//@SpringBootConfiguration
//@EnableAutoConfiguration
@SpringBootApplication//@SpringBootConfiguration+@EnableAutoConfiguration+@ComponentScan 
public class App extends SpringBootServletInitializer
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
    }
}
