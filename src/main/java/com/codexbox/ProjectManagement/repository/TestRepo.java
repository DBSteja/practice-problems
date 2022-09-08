package com.codexbox.ProjectManagement.repository;

import com.codexbox.ProjectManagement.entity.TestEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepo extends CrudRepository<TestEntity, Long> {
}
