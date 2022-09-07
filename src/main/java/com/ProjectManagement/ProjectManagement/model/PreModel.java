package com.ProjectManagement.ProjectManagement.model;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
@Data
@Configuration
public class PreModel {
    private Long id;
    private  String title;
    private Date releaseDate;
    private String status;
    private String environment;
}
