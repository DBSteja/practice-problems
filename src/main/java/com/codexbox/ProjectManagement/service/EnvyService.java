package com.codexbox.ProjectManagement.service;

import com.codexbox.ProjectManagement.entity.EnvyEntity;
import com.codexbox.ProjectManagement.model.EnvyDropDownDTO;
import com.codexbox.ProjectManagement.repository.EnvyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EnvyService {
    @Autowired
    private EnvyRepo envyRepo;

    public List<EnvyDropDownDTO> getEnvironmentDropDown(){
        List<EnvyDropDownDTO> envyModelList = new ArrayList<>();
        List<EnvyEntity> entityList = (List<EnvyEntity>) envyRepo.findAll();
        entityList.forEach(envy -> {
            EnvyDropDownDTO envyDTO = new EnvyDropDownDTO();
            mapEntityToModel(envy, envyDTO);
            envyModelList.add(envyDTO);
        });
        return envyModelList;
    }

    private void mapEntityToModel(EnvyEntity envyEntity,EnvyDropDownDTO envyDropDownDTO){
        envyDropDownDTO.setEnvId(envyEntity.getEnvId());
        envyDropDownDTO.setEnvName(envyEntity.getEnvName());
    }

    }
