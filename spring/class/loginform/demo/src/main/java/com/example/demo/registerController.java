package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;
import java.time.LocalTime;

@RestController // <-- Added this annotation
public class registerController { // <-- Capitalized class name

    @GetMapping("/register")
    public String registerUser(
            @RequestParam String confirmpassword,
            @RequestParam String fullname, 
            @RequestParam String mothername,
            @RequestParam String password, 
            @RequestParam String fathername, 
            @RequestParam String problem,
            @RequestParam int age,
            @RequestParam 
            @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate date,
            @RequestParam 
            @DateTimeFormat(pattern = "HH:MM a") LocalTime time) {
        
        // 1. Check for missing or empty string fields safely
        if (fullname == null || fullname.trim().isEmpty()) {
            return "Please enter your fullname";
        }
        if (mothername == null || mothername.trim().isEmpty()) {
            return "Please enter your mothername";
        }
        if (fathername == null || fathername.trim().isEmpty()) {
            return "Please enter your fathername";
        }
        if (problem == null || problem.trim().isEmpty()) {
            return "Please enter your problem";
        }
        if (password == null || password.trim().isEmpty()) {
            return "Please enter your password";
        }
        if (confirmpassword == null || confirmpassword.trim().isEmpty()) {
            return "Please enter your confirm password";
        }

        // 2. Check for numeric boundaries
        if (age <= 0) {
            return "Please enter a valid age";
        }
        if (date == null) {
            return "Please enter a valid date";
        }
        if (time == null) {
            return "Please enter a valid time";
        }

        // 3. Verify passwords match
        if (!password.equals(confirmpassword)) {
            return "Passwords do not match";
        }

        // 4. Success path
        return "User registered successfully!";
    }
}