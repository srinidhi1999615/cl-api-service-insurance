package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // This annotation marks the class as a Spring Boot application
public class Main {
    public static void main(String[] args) {
        // Starts the Spring Boot application
        SpringApplication.run(Main.class, args);
    }
}