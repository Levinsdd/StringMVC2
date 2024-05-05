package com.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class QuickController {
    //@RequestMapping(value = {"/show","/show2"},method = RequestMethod.GET)
    @GetMapping("/show3")
    public String show(){
        System.out.println("show");
        return "/index.jsp";
    }
}
