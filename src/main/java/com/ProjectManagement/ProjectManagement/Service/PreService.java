package com.ProjectManagement.ProjectManagement.service;

import com.ProjectManagement.ProjectManagement.entity.PreEntity;
import com.ProjectManagement.ProjectManagement.model.PreModel;
import com.ProjectManagement.ProjectManagement.repository.PreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PreService {
    @Autowired
    private PreRepo preRepo;

    public List<PreModel> getpreDetails() {
        List<PreEntity> preEntityList = (List<PreEntity>) preRepo.findAll();
        List<PreModel> preModelslist = new ArrayList<>();
        preEntityList.forEach(preEnvy -> {
            PreModel preModel = new PreModel();
            MapModelToBillingStatusEntity(preEnvy,preModel);
            preModelslist.add(preModel);
        });
        return preModelslist;
    }
    private void MapModelToBillingStatusEntity(PreEntity preEntity, PreModel preModel) {
        preModel.setId(preEntity.getId());
        preModel.setTitle(preEntity.getTitle());
        preModel.setReleaseDate(preEntity.getReleaseDate());
        preModel.setEnvironment(preEntity.getEnvironment());
        preModel.setStatus(preEntity.getStatus());
    }
}
