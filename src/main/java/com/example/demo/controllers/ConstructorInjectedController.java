package com.example.demo.controllers;

import com.example.demo.services.GreetingService;
import com.example.demo.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

/**
 * @author Luis Santana-Holmes on 2/4/24
 */

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        // Made it null safe for fun
        if (greetingService == null) {
            System.out.println("Your obj is null!!!");
            this.greetingService = new GreetingServiceImpl();

        } else {
            this.greetingService = greetingService;
        }
    }

    public synchronized String sayHello() {
        return greetingService.sayGreeting();
    }
}
