package com.ProjectManagement.ProjectManagement.controller;
import com.ProjectManagement.ProjectManagement.Service.ProService;
import com.ProjectManagement.ProjectManagement.Service.TestService;
import com.ProjectManagement.ProjectManagement.model.PreModel;
import com.ProjectManagement.ProjectManagement.model.ProModel;
import com.ProjectManagement.ProjectManagement.model.TestModel;
import com.ProjectManagement.ProjectManagement.service.PreService;
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
    @Autowired
    private ProService proService;

    @Autowired
    private PreService preService;


    @GetMapping("/test")
    public ResponseEntity<List<TestModel>> getTestData(){
        return new ResponseEntity<>(testservice.getTestDetails(), HttpStatus.OK);
    }
    @GetMapping("/pro")
    public ResponseEntity<List<ProModel>> getProData(){
        return new ResponseEntity<>(proService.getproDetails(), HttpStatus.OK);
    }

    @GetMapping("/pre")
    public ResponseEntity<List<PreModel>> getPreData(){
        return new ResponseEntity<>(preService.getpreDetails(), HttpStatus.OK);
    }

}
