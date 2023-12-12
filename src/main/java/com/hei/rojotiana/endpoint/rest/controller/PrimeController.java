package com.hei.rojotiana.endpoint.rest.controller;

import com.hei.rojotiana.endpoint.event.EventProducer;
import com.hei.rojotiana.repository.DummyRepository;
import com.hei.rojotiana.repository.DummyUuidRepository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

public class PrimeController {
    DummyRepository dummyRepository;
    DummyUuidRepository dummyUuidRepository;
    EventProducer eventProducer;
    public static int generateRandomNumber(){
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    @GetMapping("/prime")
    public boolean isPrime() {
        if (generateRandomNumber() <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(generateRandomNumber()); i++) {
            if (generateRandomNumber() % i == 0) {
                return false;
            }
        }
        return true;
    }
}
