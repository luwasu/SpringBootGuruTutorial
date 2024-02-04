package com.example.demo.controllers;

import com.example.demo.services.GreetingService;
import com.example.demo.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Luis Santana-Holmes on 2/3/24
 */

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    @GetMapping()
    public String sayHello(){
        System.out.println("This is my controller");

        return greetingService.sayGreeting();
    }

}
