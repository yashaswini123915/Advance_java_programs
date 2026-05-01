package com.nipuna;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "registration-form";
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute("student") Student student) {
        return "success";
    }
}


