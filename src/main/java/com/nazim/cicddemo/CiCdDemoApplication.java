package com.nazim.cicddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CiCdDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CiCdDemoApplication.class, args);
    }

    @RestController
    class HelloController {
        @GetMapping("/hello")
        public String sayHello() {
            return "Hello, CI/CD Pipeline!";
        }
    }

}
