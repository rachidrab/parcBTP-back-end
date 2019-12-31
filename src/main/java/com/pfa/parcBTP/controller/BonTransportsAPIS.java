package com.pfa.parcBTP.controller;


import com.pfa.parcBTP.model.BonTransport;
import com.pfa.parcBTP.model.Camion;
import com.pfa.parcBTP.repository.BonTransportsRepository;
import com.pfa.parcBTP.repository.CamionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/bonsTransport")
@RestController
public class BonTransportsAPIS {

    @Autowired
    BonTransportsRepository bonTransportsRepository;

    @Autowired
    CamionRepository camionRepository;


    @GetMapping("/all")
    public Iterable<BonTransport> getAllBonsTransportAPI() {
        return bonTransportsRepository.findAll();
    }



    @GetMapping("/camions/{marque}")
    public Iterable<BonTransport> getAllBonsByCamion(@PathVariable String marque) {


        return bonTransportsRepository.getAllByCamion(camionRepository.findByMarque(marque));
    }

    @GetMapping("/camion/{id}")
    public Iterable<BonTransport> getBonTransportByCamionId(@PathVariable int id) {
        return bonTransportsRepository.getAllByCamion_Id(id);
    }


    @PostMapping("/add")
    BonTransport addBonTransport(@RequestBody BonTransport bonTransport) {

        return bonTransportsRepository.save(bonTransport);
    }








}
