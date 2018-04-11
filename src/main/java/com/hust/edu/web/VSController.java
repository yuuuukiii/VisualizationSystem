package com.hust.edu.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class VSController {


    @RequestMapping("/")
    public String index(){
        return "main";
    }
    @RequestMapping("/test")
    public String test(){
        return "test";
    }
    @RequestMapping("/bar")
    public String bar(){
        return "bar";
    }
    @RequestMapping("/route")
    public String route(){
        return "route";
    }
    @RequestMapping("/flow")
    public String flow(){
        return "StopFlow";
    }
}