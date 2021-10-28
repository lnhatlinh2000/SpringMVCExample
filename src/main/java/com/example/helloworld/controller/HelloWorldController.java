package com.example.helloworld.controller;

import com.example.helloworld.model.HelloWorld;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
public class HelloWorldController {

    @RequestMapping("/helloworld")
    public String handler(Model model) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello world Example");
        helloWorld.setDateTime(LocalDateTime.now().toString());
        model.addAttribute("helloWorld", helloWorld);
        return "helloworld";

    }
}
