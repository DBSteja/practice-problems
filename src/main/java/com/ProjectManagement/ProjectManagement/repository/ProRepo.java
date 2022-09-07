package com.ProjectManagement.ProjectManagement.repository;
import com.ProjectManagement.ProjectManagement.entity.ProEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProRepo extends CrudRepository<ProEntity, Long> {
}
