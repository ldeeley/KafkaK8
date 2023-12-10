package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaK8ConsumerApplication {


    public static void main(String[] args) {

        SpringApplication.run(KafkaK8ConsumerApplication.class,args);
        System.out.println("Hello world!");
    }
}