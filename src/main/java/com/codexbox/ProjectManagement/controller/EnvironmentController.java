package com.codexbox.ProjectManagement.controller;

import com.codexbox.ProjectManagement.service.ProService;
import org.springframework.web.bind.annotation.RestController;
import com.codexbox.ProjectManagement.service.TestService;
import com.codexbox.ProjectManagement.model.PreModel;
import com.codexbox.ProjectManagement.model.ProModel;
import com.codexbox.ProjectManagement.model.TestModel;
import com.codexbox.ProjectManagement.service.PreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@RestController
public class EnvironmentController {
    @Autowired
    private TestService testservice;
    @Autowired
    private ProService proService;

    @Autowired
    private PreService preService;


    @GetMapping("/test1")
    public ResponseEntity<List<TestModel>> getTestData(){
        return new ResponseEntity<>(testservice.getTestDetails(), HttpStatus.OK);
    }
    @GetMapping("/pro1")
    public ResponseEntity<List<ProModel>> getProData(){
        return new ResponseEntity<>(proService.getproDetails(), HttpStatus.OK);
    }

    @GetMapping("/pre1")
    public ResponseEntity<List<PreModel>> getPreData(){
        return new ResponseEntity<>(preService.getpreDetails(), HttpStatus.OK);
    }




}
