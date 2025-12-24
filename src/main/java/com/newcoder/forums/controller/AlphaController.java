package com.newcoder.forums.controller;

import com.newcoder.forums.service.AlphaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/alpha")
public class AlphaController {
    @Autowired
    AlphaService alphaService;

    @RequestMapping("/data")
    @ResponseBody
    public String getAlpha() {
        return alphaService.find();
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "hello";
    }
}
