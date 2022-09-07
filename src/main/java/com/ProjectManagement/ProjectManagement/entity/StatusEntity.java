package com.ProjectManagement.ProjectManagement.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "projectstatus")
public class StatusEntity {
    @Id
    @Column(name = "statusId")
    private Integer statusId;

    @Column(name = "StatusName")
    private  String  statusName;



}
