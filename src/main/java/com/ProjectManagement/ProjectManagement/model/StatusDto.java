package com.ProjectManagement.ProjectManagement.model;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class StatusDto {
    private Integer statusId;
    private  String  statusName;


}
