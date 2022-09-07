package com.ProjectManagement.ProjectManagement.Service;


import com.ProjectManagement.ProjectManagement.entity.FormEntity;
import com.ProjectManagement.ProjectManagement.model.FormDTO;
import com.ProjectManagement.ProjectManagement.model.Model;

import java.util.List;

@org.springframework.stereotype.Service
public interface Service {

    public String updateService(Model model,String title);

    String addProject(FormDTO form);

     public List<FormDTO> getProject();

    List<FormDTO> getProjectByEnv(String title);
}
