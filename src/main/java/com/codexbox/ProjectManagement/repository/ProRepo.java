package com.codexbox.ProjectManagement.repository;
import com.codexbox.ProjectManagement.entity.ProEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProRepo extends CrudRepository<ProEntity, Long> {
}
