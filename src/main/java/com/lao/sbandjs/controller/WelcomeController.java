package com.lao.sbandjs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
    @RequestMapping("/welcome")
    public String loginMessage(){
        return "welcome";
    }

    @RequestMapping(path = {"/index", ""})
    public String getIndex(){
        return "index";
    }

    @GetMapping(path = {"/redirect"})
    public String redirect(){
        return "thymeleaf/redirect";
    }
}