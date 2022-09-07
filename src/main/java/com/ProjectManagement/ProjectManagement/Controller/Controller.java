package com.ProjectManagement.ProjectManagement.controller;

import com.ProjectManagement.ProjectManagement.model.EnvyDropDownDTO;
import com.ProjectManagement.ProjectManagement.service.EnvyService;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

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
