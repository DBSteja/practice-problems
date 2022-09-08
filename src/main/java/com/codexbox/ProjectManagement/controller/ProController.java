package com.codexbox.ProjectManagement.controller;

import com.codexbox.ProjectManagement.model.FormDTO;
import com.codexbox.ProjectManagement.service.Service;
import com.codexbox.ProjectManagement.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class ProController {

    @Autowired
    private Service service;


    @GetMapping("/get")
    public String get(){
        return "Hello World : ";
    }

    @PostMapping("/home")
    public ResponseEntity<String> addProject(@RequestBody FormDTO form){

        return new ResponseEntity<>(service.addProject(form), HttpStatus.OK);
    }

    @GetMapping("/home")
    public ResponseEntity<List<FormDTO>> getProject(){

        return new ResponseEntity<>(service.getProject(),HttpStatus.OK);
    }

    @GetMapping("home/{title}")
    public ResponseEntity<List<FormDTO>> getProject(@PathVariable String title){

        if(service.getProjectByEnv(title).isEmpty())
        {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(service.getProjectByEnv(title),HttpStatus.OK);
    }

    @PutMapping("/edit/{title}")
    public ResponseEntity<Map<String,String>> updateService(@RequestBody Model model, @PathVariable String title){

        return new ResponseEntity<>(service.updateService(model,title),HttpStatus.OK);
    }
}

