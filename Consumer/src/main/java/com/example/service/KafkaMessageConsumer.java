package com.example.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaMessageConsumer {


    @KafkaListener(topics = "customer",groupId = "jt-group-1")
    public void consumer(String message){
        log.info("Consumer consuming the message {} ",message);
        System.out.println("Consumer consuming the message : " + message);
    }

}
