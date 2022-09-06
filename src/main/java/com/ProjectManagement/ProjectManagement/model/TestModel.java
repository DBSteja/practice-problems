package com.ProjectManagement.ProjectManagement.model;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Data
@Configuration
public class TestModel {
private Long id;
private  String title;
private Date releaseData;
private String environment;
}
