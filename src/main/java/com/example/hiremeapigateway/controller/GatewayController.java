package com.example.hiremeapigateway.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class GatewayController {
    @GetMapping
    public String test() {
        return "Test from gateway controller";
    }
    //Handling with user



    //Handling with CV

    //test

}
