package com.mayank.leapsclothesrentalapplication;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class LeapsClothesRentalApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeapsClothesRentalApplication.class, args);
        log.info("Clothes rental application is running...");
    }

}
