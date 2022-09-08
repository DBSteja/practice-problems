package com.ProjectManagement.ProjectManagement.Service;

import com.ProjectManagement.ProjectManagement.entity.Entity;
import com.ProjectManagement.ProjectManagement.entity.FormEntity;
import com.ProjectManagement.ProjectManagement.model.FormDTO;
import com.ProjectManagement.ProjectManagement.model.Model;
import com.ProjectManagement.ProjectManagement.repository.FormRepo;
import com.ProjectManagement.ProjectManagement.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
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
    public List<String> updateService(Model model,String title) {

        List<String> list=new LinkedList<>();

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

        return list;
    }

    @Override
    public String addProject(FormDTO form) {

        String res="successfull";

        if(form==null)
        {
            System.out.println("form is cant be empty");
        }

        FormEntity entity=new FormEntity();

        entity.setDate(form.getDate());
        entity.setTitle(form.getTitle());
        entity.setStatus(form.getStatus());
        entity.setDescription(form.getDescription());
        entity.setEnvironment(form.getEnvironment());

          entity=repo1.save(entity);
          if(entity==null)
          {
              res="not successfull";
          }
          return res;
    }

    @Override
    public List<FormDTO> getProject() {

        List<FormDTO> list=new LinkedList<>();

        Iterable<FormEntity> form=repo1.findAll();
      // form.forEach(e-> System.out.println(e.getDescription()));

        form.forEach(e -> list.add(new FormDTO(e))
        );

        return list;
    }

    @Override
    public List<FormDTO> getProjectByEnv(String title) {

        List<FormDTO> list=new LinkedList<>();

        Iterable<FormEntity> form=repo1.findAll();

        form.forEach(e->{
            if (e.getEnvironment().equalsIgnoreCase(title))
             {
                list.add(new FormDTO(e));
            }}
        );
        return list;
    }
}
