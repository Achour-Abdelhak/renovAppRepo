package com.renovSolution.renov.controlleur;

import com.renovSolution.renov.model.Contracteur;
import com.renovSolution.renov.service.ContracteurService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping("/contracteur")
public class ContracteurControlleur {
    private final ContracteurService contracteurService ;

    public ContracteurControlleur(ContracteurService contracteurService) {
        this.contracteurService = contracteurService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Contracteur>> getAllContracteurs(){
        List<Contracteur> contracteurs =  contracteurService.findAllContracteurs();
        return new ResponseEntity<>(contracteurs, HttpStatus.OK);
    }
}
