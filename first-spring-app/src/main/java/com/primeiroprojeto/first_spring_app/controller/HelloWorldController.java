package com.primeiroprojeto.first_spring_app.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.ResponseBody;

// @Controller
// @ResponseBody
@RestController //indica que a class é um controller rest, combinando o controller com rest
@RequestMapping("/hello-world")
public class HelloWorldController {
    //get, post, delete, put. patch, options, head
    // GET /hello-world/get
    @GetMapping
    public String helloWorld(){
        return "funcionaporfavor";
    }
}
