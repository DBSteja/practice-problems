package com.codexbox.ProjectManagement.model;

import com.codexbox.ProjectManagement.entity.FormEntity;
import lombok.Data;

import java.util.Date;

@Data
public class FormDTO {

    private String title;

    private Date date;

    private String status;

    private String environment;

    private String description;

    public FormDTO()
    {

    }


    public FormDTO(FormEntity e) {
        this.title =e.getTitle();
        this.date = e.getDate();
        this.status =e.getStatus();
        this.environment = e.getEnvironment();
        this.description = e.getDescription();
    }
}
