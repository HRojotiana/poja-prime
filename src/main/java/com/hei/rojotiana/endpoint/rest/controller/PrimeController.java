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

    Random random = new Random();
    int randomNumber = random.nextInt(100) + 1;

    @GetMapping("/prime")
    public boolean isPrime() {
        if (randomNumber <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(randomNumber); i++) {
            if (randomNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
