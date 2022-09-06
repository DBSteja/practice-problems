package com.ProjectManagement.ProjectManagement.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/get")
    public String get(){
        return "Hello World : ";
    }

}
