package com.ProjectManagement.ProjectManagement.Service;

import com.ProjectManagement.ProjectManagement.entity.Entity;
import com.ProjectManagement.ProjectManagement.entity.FormEntity;
import com.ProjectManagement.ProjectManagement.model.FormDTO;
import com.ProjectManagement.ProjectManagement.model.Model;
import com.ProjectManagement.ProjectManagement.repository.FormRepo;
import com.ProjectManagement.ProjectManagement.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    @Autowired
    private Repo repo;

    @Autowired
    private FormRepo repo1;

    @Override
    public String updateService(Model model,String title) {

        String result = "updated successfully";
        if (model == null) {
            System.out.println("model is null");
        }
        Entity entity = repo.findByTitle(title);

        //Entity user = repo.findByTitle(model.getTitle());

            entity.setDate(model.getDate());
            entity.setStatus(model.getStatus());
            entity.setEnvironment(model.getEnvironment());

            repo.save(entity);
import com.ProjectManagement.ProjectManagement.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;

public class ServiceImpl {

}
