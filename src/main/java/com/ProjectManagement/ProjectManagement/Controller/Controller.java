package com.ProjectManagement.ProjectManagement.Controller;

import com.ProjectManagement.ProjectManagement.model.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {


    @GetMapping("/get")
    public String get(){
        return "Hello World : ";
    }


}
