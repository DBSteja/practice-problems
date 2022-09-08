package com.codexbox.ProjectManagement.repository;

import com.codexbox.ProjectManagement.entity.PreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreRepo extends JpaRepository<PreEntity,Long> {
}
