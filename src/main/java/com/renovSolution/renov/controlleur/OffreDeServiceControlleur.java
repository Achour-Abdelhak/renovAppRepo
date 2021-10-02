package com.renovSolution.renov.controlleur;
import com.renovSolution.renov.model.OffreDeService;
import com.renovSolution.renov.service.OffreDeServiceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping("/offredeservice")
public class OffreDeServiceControlleur {
    private final OffreDeServiceService offreDeServiceService;

    public OffreDeServiceControlleur(OffreDeServiceService offreDeServiceService) {
        this.offreDeServiceService = offreDeServiceService;
    }

    @GetMapping("/all")
    public  ResponseEntity<List<OffreDeService>> getAllOffreDeServices(){
        List<OffreDeService> offreDeServices = offreDeServiceService.findAllOffreDeServices();
        return new ResponseEntity<>(offreDeServices, HttpStatus.OK);
    }
}
