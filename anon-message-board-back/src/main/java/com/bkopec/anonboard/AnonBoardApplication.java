package com.bkopec.anonboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing; // Make sure this import is here

@SpringBootApplication
@EnableJpaAuditing
public class AnonBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnonBoardApplication.class, args);
    }
}