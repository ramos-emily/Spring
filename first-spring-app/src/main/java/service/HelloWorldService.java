package service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String helloWorld(String name){
        return "pc novo heheheheheheheh" + name;
    }
}


//construtor tem q ser publico com o mesmo nome da classe
