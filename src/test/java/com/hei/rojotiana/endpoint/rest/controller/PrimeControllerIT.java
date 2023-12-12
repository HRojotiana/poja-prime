package com.hei.rojotiana.endpoint.rest.controller;

import com.hei.rojotiana.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertFalse;
import static org.springframework.test.util.AssertionErrors.assertTrue;

public class PrimeControllerIT extends FacadeIT {
    @Autowired
    PrimeController primeController;

    @Test
    void ping() {
        int randomNumber =PrimeController.generateRandomNumber();

        boolean isPrime = PrimeController.isPrime(randomNumber);

    }
}
