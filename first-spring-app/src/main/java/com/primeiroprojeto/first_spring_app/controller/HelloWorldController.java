package com.primeiroprojeto.first_spring_app.controller;
import com.primeiroprojeto.first_spring_app.domain.User;
import org.springframework.web.bind.annotation.*;
import service.HelloWorldService;

// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.ResponseBody;
// @Controller
// @ResponseBody
@RestController //indica que a class é um controller rest, combinando o controller com rest
@RequestMapping("/vai")
public class HelloWorldController {
    //get, post, delete, put. patch, options, head
    // GET /hello-world/get

    private HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService){
        this.helloWorldService = helloWorldService;
    }


    @GetMapping
    public String helloWorld(){
        return helloWorldService.helloWorld("EMISS");
    }


    @PostMapping("")
    public String helloWorldPost(@RequestBody User body){
        return "post ta funcionandooooooo" + body.getName();
    }
}
