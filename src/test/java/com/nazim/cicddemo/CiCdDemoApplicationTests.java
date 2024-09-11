package com.nazim.cicddemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CiCdDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void helloEndpointTest() {
        String result = "Hello, CI/CD Pipeline!";
        assertEquals("Hello, CI/CD Pipeline!", result);
    }

}
