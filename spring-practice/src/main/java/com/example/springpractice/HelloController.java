package com.example.springpractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "안녕하세요, 스프링!";
    }
    @GetMapping("/my")
    public String my() {
        return "제";
    }
    @GetMapping("/name")
    public String name() {
        return "이름은";
    }
    @GetMapping("/is")
    public String is() {
        return "박재우입니다!";
    }
}
