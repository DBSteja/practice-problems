package com.ProjectManagement.ProjectManagement.repository;

import com.ProjectManagement.ProjectManagement.entity.Entity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends CrudRepository<Entity,String> {

    Entity findByTitle(String title);
import org.springframework.stereotype.Repository;

@Repository
public interface Repo {
}
