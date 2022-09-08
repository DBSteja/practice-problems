package com.codexbox.ProjectManagement.service;

import com.codexbox.ProjectManagement.entity.Entity;
import com.codexbox.ProjectManagement.entity.FormEntity;
import com.codexbox.ProjectManagement.model.FormDTO;
import com.codexbox.ProjectManagement.model.Model;
import com.codexbox.ProjectManagement.repository.FormRepo;
import com.codexbox.ProjectManagement.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    @Autowired
    private Repo repo;

    @Autowired
    private FormRepo repo1;

    @Override
    public Map<String, String> updateService(Model model, String title) {

        Map<String, String> list = new HashMap<>();

        String result = "updated successfully";

        if (model == null) {
            System.out.println("model is null");
        }
        Entity entity = repo.findByTitle(title);

        //Entity user = repo.findByTitle(model.getTitle());

        if (model.getDate().equals(null) || model.getDate().equals("")) {
            list.put("form update","update not successfull ");
            list.put("date", "date should not be empty");
        } else {
            entity.setDate(model.getDate());
        }
        if (model.getStatus().equals(null) || model.getStatus().equals("")) {
            list.put("form update","update not successfull because of empty status");
            list.put("status", "status should not be empty");
        } else {
            entity.setStatus(model.getStatus());
        }
        if (model.getEnvironment().equals(null) || model.getEnvironment().equals("")) {
            list.put("form update","update not successfull because of empty environment");
            list.put("environment", "environment should not be empty");
        } else {
            entity.setEnvironment(model.getEnvironment());
        }
        if(list.isEmpty())
        {
            list.put("form update",result);
            repo.save(entity);
        }
        return list;
    }

    @Override
    public String addProject(FormDTO form) {

        String res = "successfull";

        if (form == null) {
            System.out.println("form is cant be empty");
        }

        FormEntity entity = new FormEntity();

        entity.setDate(form.getDate());
        entity.setTitle(form.getTitle());
        entity.setStatus(form.getStatus());
        entity.setDescription(form.getDescription());
        entity.setEnvironment(form.getEnvironment());

        entity = repo1.save(entity);
        if (entity == null) {
            res = "not successfull";
        }
        return res;
    }

    @Override
    public List<FormDTO> getProject() {

        List<FormDTO> list = new LinkedList<>();

        Iterable<FormEntity> form = repo1.findAll();
        // form.forEach(e-> System.out.println(e.getDescription()));

        form.forEach(e -> list.add(new FormDTO(e))
        );

        return list;
    }

    @Override
    public List<FormDTO> getProjectByEnv(String title) {

        List<FormDTO> list = new LinkedList<>();

        Iterable<FormEntity> form = repo1.findAll();

        form.forEach(e -> {
                    if (e.getEnvironment().equalsIgnoreCase(title)) {
                        list.add(new FormDTO(e));
                    }
                }
        );

        return list;
    }
}
