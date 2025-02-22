package com.example.demo.controller;
import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public String sayHello(){return "Hello from BridgeLabz";}
    @GetMapping("/query")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    @GetMapping("/param/{name}")
    public String print(@PathVariable("name") String name ){
        return "Hello "+name;
    }
    @PostMapping("/post")
    public String sayHello(@RequestBody User user){
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable("firstName") String firstName, @RequestParam("lastName") String lastName){
        return "Hello "+firstName+" "+lastName;
    }
}