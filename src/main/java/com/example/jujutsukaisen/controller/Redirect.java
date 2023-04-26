package com.example.jujutsukaisen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Redirect {
    @RequestMapping("/")
    public String index() {
        return "redirect:swagger-ui.html";
    }
}
