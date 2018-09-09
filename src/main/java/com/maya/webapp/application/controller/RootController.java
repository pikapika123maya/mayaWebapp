package com.maya.webapp.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RootController {
    @Autowired
    String biuString;

    @GetMapping("/hello")
    public ModelAndView hello(@RequestParam(name="name", required=false, defaultValue="world") String name) {
        ModelAndView mav = new ModelAndView("hello");

        mav.addObject("name", biuString);
        System.out.println("in controller");
        return mav; // returns a view call "hello"
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
