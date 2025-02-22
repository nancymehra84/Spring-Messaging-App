package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // GET request
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    // POST request
    @PostMapping
    public String sayHelloPost() {
        return "Hello from BridgeLabz - POST";
    }

    // PUT request
    @PutMapping
    public String sayHelloPut() {
        return "Hello from BridgeLabz - PUT";
    }

    // DELETE request
    @DeleteMapping
    public String sayHelloDelete() {
        return "Hello from BridgeLabz - DELETE";
    }
}
