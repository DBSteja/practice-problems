package com.ProjectManagement.ProjectManagement.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name="pre_table")
public class PreEntity {
        @Id
        @Column(name = "pre_id", nullable = false)
        private Long id;
        @Column(name ="pre_title")
        private String title;
        @Column(name = "pre_release_date")
        private Date releaseDate;
        @Column(name = "pre_status")
        private String status;
        @Column(name = "pre_environment")
        private String environment;

    }
