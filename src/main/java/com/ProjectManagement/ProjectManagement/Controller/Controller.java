package com.ProjectManagement.ProjectManagement.Controller;

import com.ProjectManagement.ProjectManagement.Service.Service;
import com.ProjectManagement.ProjectManagement.entity.FormEntity;
import com.ProjectManagement.ProjectManagement.model.FormDTO;
import com.ProjectManagement.ProjectManagement.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.List;

@RestController
public class Controller {


    @GetMapping("/get")
    public String get(){
        return "Hello World : ";
    }

}
