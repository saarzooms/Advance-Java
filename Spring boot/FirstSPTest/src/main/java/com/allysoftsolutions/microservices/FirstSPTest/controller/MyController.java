package com.allysoftsolutions.microservices.FirstSPTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping(value="/{name}", method = RequestMethod.POST)
    public String sayHello(@PathVariable String name){
        return String.format("Hello %s",name);
    }
    @RequestMapping(value="/{name}", method = RequestMethod.GET)
    public String sayHi(@PathVariable String name){
        return String.format("Hello GET : %s",name);
    }
    @RequestMapping(value="/welcome/{name}", method = RequestMethod.GET)
    public String welcome(@PathVariable String name){
        return String.format("welcome  GET : %s",name);
    }
    @RequestMapping(value="/cube/{num}", method = RequestMethod.GET)
    public int cube(@PathVariable String num){
        int n = Integer.parseInt(num);
        return (n*n*n);
    }
}
