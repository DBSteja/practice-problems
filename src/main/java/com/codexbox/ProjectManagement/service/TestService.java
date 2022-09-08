package com.codexbox.ProjectManagement.service;

import com.codexbox.ProjectManagement.entity.TestEntity;
import com.codexbox.ProjectManagement.model.TestModel;
import com.codexbox.ProjectManagement.repository.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class TestService {
        @Autowired
        private TestRepo testRepo;

        public List<TestModel> getTestDetails() {
            List<TestEntity> entityList = (List<TestEntity>) testRepo.findAll();
            List<TestModel> testModelslist = new ArrayList<>();
            entityList.forEach(entity -> {
                TestModel testModel = new TestModel();
                MapModelToBillingStatusEntity(entity,  testModel);
                testModelslist.add(testModel);
            });
            return testModelslist;
        }
        private void MapModelToBillingStatusEntity(TestEntity testEntity, TestModel testModel) {
            testModel.setId(testEntity.getId());
            testModel.setTitle(testEntity.getTitle());
            testModel.setReleaseDate(testEntity.getReleaseDate());
            testModel.setEnvironment(testEntity.getEnvironment());
            testModel.setStatus(testEntity.getStatus());
        }
    }

