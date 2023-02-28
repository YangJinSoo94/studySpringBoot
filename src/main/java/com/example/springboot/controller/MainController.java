package com.example.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {

    @GetMapping("/test")
    public String test() {
        return "Hello World!";
    }

    @GetMapping("/ma")
    public ModelAndView main() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/main/main");
        return mv;
    }
}
