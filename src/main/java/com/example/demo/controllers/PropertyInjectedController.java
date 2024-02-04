package com.example.demo.controllers;

import com.example.demo.services.GreetingService;

/**
 * @author Luis Santana-Holmes on 2/4/24
 */


public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
