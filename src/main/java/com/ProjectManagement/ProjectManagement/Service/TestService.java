package com.ProjectManagement.ProjectManagement.service;

import com.ProjectManagement.ProjectManagement.entity.TestEntity;
import com.ProjectManagement.ProjectManagement.model.TestModel;
import com.ProjectManagement.ProjectManagement.repository.TestRepo;
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
            testModel.setReleaseData(testEntity.getReleaseData());
            testModel.setEnvironment(testEntity.getEnvironment());
        }
    }

