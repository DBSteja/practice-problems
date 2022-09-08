package com.codexbox.ProjectManagement.repository;

import com.codexbox.ProjectManagement.entity.Entity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends CrudRepository<Entity,String> {

    Entity findByTitle(String title);
}
