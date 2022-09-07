package com.ProjectManagement.ProjectManagement.Controller;

import com.ProjectManagement.ProjectManagement.Service.Service;
import com.ProjectManagement.ProjectManagement.entity.FormEntity;
import com.ProjectManagement.ProjectManagement.model.FormDTO;
import com.ProjectManagement.ProjectManagement.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private Service service;


    @GetMapping("/get")
    public String get(){
        return "Hello World : ";
    }

    @PostMapping("/home")
    public ResponseEntity<String>  addProject(@RequestBody FormDTO form){

        return new ResponseEntity<>(service.addProject(form),HttpStatus.OK);
    }

    @GetMapping("/home")
    public ResponseEntity<List<FormDTO>> getProject(){

        return new ResponseEntity<>(service.getProject(),HttpStatus.OK);
    }

    @GetMapping("home/{title}")
    public ResponseEntity<List<FormDTO>> getProject(@PathVariable String title){

        return new ResponseEntity<>(service.getProjectByEnv(title),HttpStatus.OK);
    }
}
