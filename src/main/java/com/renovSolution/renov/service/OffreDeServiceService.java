package com.renovSolution.renov.service;
import com.renovSolution.renov.model.OffreDeService;
import com.renovSolution.renov.model.Utilisateur;
import com.renovSolution.renov.repo.OffreDeServiceRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OffreDeServiceService {
    private final OffreDeServiceRepo offreDeServiceRepo;

    @Autowired

    public OffreDeServiceService(OffreDeServiceRepo offreDeServiceRepo) {
        this.offreDeServiceRepo = offreDeServiceRepo;
    }

    public List<OffreDeService> findAllOffreDeServices(){return  offreDeServiceRepo.findAll();}
}
