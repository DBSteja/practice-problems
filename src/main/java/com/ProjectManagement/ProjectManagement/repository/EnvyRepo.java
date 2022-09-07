package com.ProjectManagement.ProjectManagement.repository;

import com.ProjectManagement.ProjectManagement.entity.EnvyEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnvyRepo extends CrudRepository<EnvyEntity,Integer> {

}
