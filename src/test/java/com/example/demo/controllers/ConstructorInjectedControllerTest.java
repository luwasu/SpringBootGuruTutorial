package com.example.demo.controllers;

import com.example.demo.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Luis Santana-Holmes on 2/4/24
 */


class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
//        controller = new ConstructorInjectedController(null);
    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}