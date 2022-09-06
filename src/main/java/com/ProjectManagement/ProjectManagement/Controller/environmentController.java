package com.ProjectManagement.ProjectManagement.controller;

import com.ProjectManagement.ProjectManagement.model.TestModel;
import com.ProjectManagement.ProjectManagement.service.Service;
import com.ProjectManagement.ProjectManagement.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EnvironmentController {
    @Autowired
    private TestService testservice;

    @GetMapping("/test")
    public ResponseEntity<List<TestModel>> getProjectData(){
        return new ResponseEntity<>(testservice.getTestDetails(), HttpStatus.OK);
    }

}
