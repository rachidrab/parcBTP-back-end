package com.pfa.parcBTP.controller;


import com.pfa.parcBTP.model.Accessoire;
import com.pfa.parcBTP.model.Camion;
import com.pfa.parcBTP.model.Magasinier;
import com.pfa.parcBTP.repository.CamionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/camions")
@RestController
public class CamionsAPIS {

    Camion camion = new Camion();

    @Autowired
    CamionRepository camionRepository;

    @GetMapping("/all")
    public Iterable<Camion> getAllCamionsAPI() {
        return camionRepository.findAll();
    }



    @GetMapping("/{id}")
    public Camion getCamionById(@PathVariable int id) {
        return camionRepository.findById(id);
    }


    @PostMapping("/add")
    Camion addCamion(@RequestBody Camion camion) {

        return camionRepository.save(camion);
    }


}
