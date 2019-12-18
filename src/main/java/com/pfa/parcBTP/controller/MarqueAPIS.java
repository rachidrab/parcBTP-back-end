package com.pfa.parcBTP.controller;

import com.pfa.parcBTP.model.Marque;
import com.pfa.parcBTP.model.User;
import com.pfa.parcBTP.repository.MarqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/marques")
public class MarqueAPIS {

    @Autowired
    MarqueRepository marqueRepository;

    @GetMapping("/all")
    public Iterable<Marque> getMarquesAPI() {
        return marqueRepository.findAll();
    }
}
