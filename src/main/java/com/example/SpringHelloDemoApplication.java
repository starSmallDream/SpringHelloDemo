package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringHelloDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringHelloDemoApplication.class, args);
    }

    @GetMapping(value = "/hi")
    public String hello(){
        return "Hello World!!!";
    }

}
