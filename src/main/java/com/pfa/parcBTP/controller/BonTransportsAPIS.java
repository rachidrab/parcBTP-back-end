package com.pfa.parcBTP.controller;


import com.pfa.parcBTP.model.BonTransport;
import com.pfa.parcBTP.model.Camion;
import com.pfa.parcBTP.repository.BonTransportsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/bons")
@RestController
public class BonTransportsAPIS {

    @Autowired
    BonTransportsRepository bonTransportsRepository;

    @GetMapping("/all")
    public Iterable<BonTransport> getAllBonsTransportAPI() {
        return bonTransportsRepository.findAll();
    }


}
