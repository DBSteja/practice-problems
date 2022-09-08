package com.codexbox.ProjectManagement.model;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class EnvyDropDownDTO {
    private  Integer envId;
    private String envName;
}
