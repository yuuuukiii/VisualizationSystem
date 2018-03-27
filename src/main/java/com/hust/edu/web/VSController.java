package com.hust.edu.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class VSController {


    @RequestMapping("/")
    public String index(){
        return "main";
    }
}