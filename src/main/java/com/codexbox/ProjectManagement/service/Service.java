package com.codexbox.ProjectManagement.service;


import com.codexbox.ProjectManagement.model.FormDTO;
import com.codexbox.ProjectManagement.model.Model;

import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Service
public interface Service {

    public Map<String,String> updateService(Model model, String title);

    String addProject(FormDTO form);

     public List<FormDTO> getProject();

    List<FormDTO> getProjectByEnv(String title);
}
