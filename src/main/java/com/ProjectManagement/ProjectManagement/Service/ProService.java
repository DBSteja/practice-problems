package com.ProjectManagement.ProjectManagement.Service;
import com.ProjectManagement.ProjectManagement.entity.ProEntity;
import com.ProjectManagement.ProjectManagement.model.ProModel;
import com.ProjectManagement.ProjectManagement.repository.ProRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class ProService {
    @Autowired
    private ProRepo proRepo;

    public List<ProModel> getproDetails() {
        List<ProEntity> proEntityList = (List<ProEntity>) proRepo.findAll();
        List<ProModel> proModelslist = new ArrayList<>();
        proEntityList.forEach(entity -> {
            ProModel proModel = new ProModel();
            MapModelToBillingStatusEntity(entity,  proModel);
            proModelslist.add(proModel);
        });
        return proModelslist;
    }
    private void MapModelToBillingStatusEntity(ProEntity proEntity, ProModel proModel) {
        proModel.setId(proEntity.getId());
        proModel.setTitle(proEntity.getTitle());
        proModel.setReleaseData(proEntity.getReleaseData());
        proModel.setEnvironment(proEntity.getEnvironment());
    }
}
