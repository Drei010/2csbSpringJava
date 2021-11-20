package com.example.controller;

import com.example.computations.Computation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greet")
@CrossOrigin("*") 
public class Greet {

    @RequestMapping("/plus")
    public String hello(){
        return  "ten plus five!" + Computation.Addition();
    }
    @RequestMapping("/hi")
    public String hi(){
        return  "hi mundo!";
    }
    @RequestMapping("/pasko")
    public String hi(){
        return  "Merry Christmas!";
    }
}
