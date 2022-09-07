package com.ProjectManagement.ProjectManagement.model;

import lombok.Data;

import java.util.Date;

@Data
import lombok.Data;
import org.springframework.context.annotation.Configuration;


public class Model {

    private Date date;
    private String status;
    private String environment;


}
