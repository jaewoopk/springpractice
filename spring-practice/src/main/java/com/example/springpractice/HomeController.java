package com.example.springpractice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/mainpage")
    public String mainpage(Model model) {
        model.addAttribute("message", "Hello, Spring Boot!");
        return "mainpage";
    }

}

