package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    //post
    //put
    //delete

    //get hhtp method
    @GetMapping("/home")
    public String home()
    {
        return "Hello World, Home Page";
    }
}
