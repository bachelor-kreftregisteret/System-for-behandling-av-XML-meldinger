package com.Kreftregisteret.KreftregisteretApp.controllers;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

    //http://localhost:8080/api/v1/hallo
    @RequestMapping(path = "api/v1/hallo")
    public String helloWorld(){
        return "heia prostata";
    }
}
