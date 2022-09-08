package com.codexbox.ProjectManagement.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "environment_drop_down")
public class EnvyEntity {

    @Id
    @Column(name = "env_id")
    private  Integer envId;

    @Column(name = "env_name")
    private String envName;

}
