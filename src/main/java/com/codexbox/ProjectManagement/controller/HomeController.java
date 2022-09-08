package com.codexbox.ProjectManagement.controller;

import com.codexbox.ProjectManagement.model.EnvyDropDownDTO;
import com.codexbox.ProjectManagement.service.EnvyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private EnvyService envyService;

    @GetMapping("/get")
    public String get(){
        return "Hello World : ";
    }


    @GetMapping("/environmentDropDown")
    public ResponseEntity<List<EnvyDropDownDTO>>getEnvyDropDown(){
        return new ResponseEntity<>(envyService.getEnvironmentDropDown(), HttpStatus.OK);
    }
}
