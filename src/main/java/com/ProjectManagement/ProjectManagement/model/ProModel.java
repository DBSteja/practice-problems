package com.ProjectManagement.ProjectManagement.model;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

import javax.persistence.Column;
import java.util.Date;
@Data
@Configuration
public class ProModel {

    private Long id;
    private  String title;
    private Date releaseData;
    private String status;
    private String environment;
}

