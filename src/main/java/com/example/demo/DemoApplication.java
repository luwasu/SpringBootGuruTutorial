package com.example.demo;

import com.example.demo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
       ApplicationContext appCxt = SpringApplication.run(DemoApplication.class, args);

        System.out.println("In main method!");
        MyController controller = appCxt.getBean(MyController.class);
        System.out.println(controller.sayHello());
    }
}
