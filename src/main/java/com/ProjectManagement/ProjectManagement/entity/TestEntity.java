package com.ProjectManagement.ProjectManagement.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name="test")
public class TestEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name ="title")
    private String title;
    @Column(name = "release_Date")
    private Date releaseDate;
    @Column(name = "status")
    private String status;
    @Column(name = "environment")
    private String environment;

}
