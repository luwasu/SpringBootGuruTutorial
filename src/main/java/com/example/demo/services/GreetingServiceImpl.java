package com.example.demo.services;

import org.springframework.stereotype.Service;

/**
 * @author Luis Santana-Holmes on 2/3/24
 */

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello Everyone From the GreetingServiceImpl! ! !";
    }
}
