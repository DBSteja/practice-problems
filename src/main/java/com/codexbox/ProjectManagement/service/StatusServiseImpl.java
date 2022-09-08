package com.codexbox.ProjectManagement.service;

import com.codexbox.ProjectManagement.entity.StatusEntity;
import com.codexbox.ProjectManagement.model.StatusDto;
import com.codexbox.ProjectManagement.repository.StatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StatusServiseImpl {
    @Autowired
    private StatusRepo statusRepo;

    public List<StatusDto >getStatusDetails() {
        List<StatusEntity> entity = (List<StatusEntity>) statusRepo.findAll();
        List<StatusDto> model = new ArrayList<>();
        entity.forEach(entity1 -> {
            StatusDto statusModel = new StatusDto();
            mapEntitytoModel( entity1, statusModel);
            model.add(statusModel);
        });
        return  model;
    }

    private void mapEntitytoModel(StatusEntity entity1, StatusDto statusModel) {
      statusModel.setStatusId(entity1.getStatusId());
      statusModel.setStatusName(entity1.getStatusName());
    }

}
