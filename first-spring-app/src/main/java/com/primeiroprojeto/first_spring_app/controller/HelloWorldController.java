package com.primeiroprojeto.first_spring_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RestController //indica que a class é um controller rest, combinando o controller com rest
@ResponseBody
public class HelloWorldController {

}
