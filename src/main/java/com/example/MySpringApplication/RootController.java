package com.example.MySpringApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }
}
