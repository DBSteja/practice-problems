package com.ProjectManagement.ProjectManagement.Controller;

import com.ProjectManagement.ProjectManagement.Service.StatusServiseImpl;
import com.ProjectManagement.ProjectManagement.model.StatusDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StatusController {
    @Autowired
    private StatusServiseImpl statusService;

    @GetMapping("/status")
    public ResponseEntity<List<StatusDto>> getStatus() {
     return new ResponseEntity<>(statusService.getStatusDetails(), HttpStatus.OK);
    }

}
