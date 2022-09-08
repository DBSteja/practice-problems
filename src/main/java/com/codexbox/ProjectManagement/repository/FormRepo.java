package com.codexbox.ProjectManagement.repository;

import com.codexbox.ProjectManagement.entity.FormEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepo extends CrudRepository<FormEntity,String> {


}
