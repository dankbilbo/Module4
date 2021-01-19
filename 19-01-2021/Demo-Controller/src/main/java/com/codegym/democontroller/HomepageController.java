package com.codegym.democontroller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomepageController {
    @GetMapping("/home")
    public String homepage(){
        return "home";
    }
    @PostMapping("/home")
    public String goToTest(){
        return "redirect:/test";
    }
    @GetMapping("/test")
    public String showTest(Model model){
        model.addAttribute("message", "hello test");
        return "test";
    }
}