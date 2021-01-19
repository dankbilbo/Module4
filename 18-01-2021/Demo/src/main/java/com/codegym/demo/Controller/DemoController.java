package com.codegym.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DemoController {
    @GetMapping("/home")
    public String demo(){
        return "home";
    }
    @PostMapping("/home")
    public String getValue(){
        return "redirect:/";
    }
}
