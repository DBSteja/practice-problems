package com.ProjectManagement.ProjectManagement.repository;

import com.ProjectManagement.ProjectManagement.entity.Entity;
import com.ProjectManagement.ProjectManagement.entity.FormEntity;
import com.ProjectManagement.ProjectManagement.model.FormDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepo extends CrudRepository<FormEntity,String> {


}
