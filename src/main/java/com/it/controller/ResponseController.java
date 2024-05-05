package com.it.controller;

import com.it.pojo.User;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseController {
    @GetMapping ("/ajax/res4")
    @ResponseBody
    public User res4(){
        User user = new User();
        user.setUsername("haohao");
        user.setAge(19);
        return user;
    }

    @GetMapping("/res3")
    public ModelAndView res3(ModelAndView modelAndView){
        User user = new User();
        user.setUsername("haohao");
        user.setAge(19);
        modelAndView.addObject("user",user);
        modelAndView.setViewName("/index.jsp");
        return modelAndView;
    }
}
