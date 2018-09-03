package com.maya.webapp.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RootController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name="name", required=false, defaultValue="world") String name, Model model) {
        model.addAttribute("name", name);
        return "hello"; // returns a view call "hello"
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
