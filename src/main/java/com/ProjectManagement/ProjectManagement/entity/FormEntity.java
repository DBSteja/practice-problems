package com.ProjectManagement.ProjectManagement.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Data
@javax.persistence.Entity
@Table(name = "home")
public class FormEntity {

    @Id
    @Column(name = "title")
    private String title;

    @Column(name = "date")
    private Date date;

    @Column(name = "status")
    private String status;

    @Column(name = "environment")
    private String environment;

    @Column(name = "description")
    private String description;
}
