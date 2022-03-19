package com.countries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountriesApplication {

    public static void main(String[] args) {
        System.out.print("application run");
        SpringApplication.run(CountriesApplication.class, args);
    }

}
