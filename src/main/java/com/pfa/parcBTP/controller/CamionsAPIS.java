package com.pfa.parcBTP.controller;


import com.pfa.parcBTP.model.Camion;
import com.pfa.parcBTP.repository.CamionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/api/camions")
@RestController
public class CamionsAPIS {

    @Autowired
    CamionRepository camionRepository;

    @GetMapping("/all")
    public Iterable<Camion> getAllCamionsAPI() {
        return camionRepository.findAll();
    }


}
