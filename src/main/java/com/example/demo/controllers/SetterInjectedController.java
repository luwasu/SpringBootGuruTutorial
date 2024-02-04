package com.example.demo.controllers;

import com.example.demo.services.GreetingService;

/**
 * @author Luis Santana-Holmes on 2/4/24
 */


public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
