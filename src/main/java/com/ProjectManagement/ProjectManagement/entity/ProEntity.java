package com.ProjectManagement.ProjectManagement.entity;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Data
@Entity
@Table(name="Pro")
public class ProEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name ="title")
    private String title;
    @Column(name = "release_Data")
    private Date releaseData;
    @Column(name = "environment")
    private String environment;

}

