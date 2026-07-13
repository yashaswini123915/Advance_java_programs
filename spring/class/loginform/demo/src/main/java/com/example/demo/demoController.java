package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {

    @GetMapping("/demo")
    public String getDemo(@RequestParam String name ,@RequestParam String password) {
        if(name.equals("admin") && password.equals("password")) {
            return "Login successful!";
        } else {
            return "Invalid credentials.";
        }
    }
}   