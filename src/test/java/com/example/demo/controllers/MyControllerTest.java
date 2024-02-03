package com.example.demo.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Luis Santana-Holmes on 2/3/24
 */


class MyControllerTest {

    @Test
    void sayHello() {
        MyController myController = new MyController();
        System.out.println(myController.sayHello());
    }
}