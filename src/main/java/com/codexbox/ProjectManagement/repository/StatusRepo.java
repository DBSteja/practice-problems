package com.codexbox.ProjectManagement.repository;

import com.codexbox.ProjectManagement.entity.StatusEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepo  extends CrudRepository<StatusEntity, Integer> {
}
