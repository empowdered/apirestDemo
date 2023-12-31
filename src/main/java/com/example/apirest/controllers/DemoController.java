package com.example.apirest.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="api/v1/demo")
public class DemoController {

    @GetMapping("/demoWelcome")
    public String demoWelcome(){
        return "Demo Welcome!!!";
    }
}
