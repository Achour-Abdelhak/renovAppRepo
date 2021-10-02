package com.renovSolution.renov.service;

import com.renovSolution.renov.model.Client;
import com.renovSolution.renov.model.Contracteur;
import com.renovSolution.renov.model.Utilisateur;
import com.renovSolution.renov.repo.ClientRepo;
import com.renovSolution.renov.repo.ContracteurRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ContracteurService {
    private final ContracteurRepo contracteurRepo;


    @Autowired
    public ContracteurService(ContracteurRepo contracteurRepo) {
        this.contracteurRepo = contracteurRepo;
    }

    public List<Contracteur> findAllContracteurs(){
        return  contracteurRepo.findAll();
    }

}
