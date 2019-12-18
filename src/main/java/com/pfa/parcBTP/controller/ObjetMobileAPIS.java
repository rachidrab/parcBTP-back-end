package com.pfa.parcBTP.controller;

import com.pfa.parcBTP.model.Materiel;
import com.pfa.parcBTP.model.ObjetMobile;
import com.pfa.parcBTP.repository.MaterielRepository;
import com.pfa.parcBTP.repository.ObjetMobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/api/objets")
@RestController
public class ObjetMobileAPIS {

    @Autowired
    ObjetMobileRepository objetMobileRepository;

    @Autowired
    MaterielRepository materielRepository;

    @GetMapping("/all")
    public Iterable<ObjetMobile> getAllObjetsMobilesAPI() {
        return objetMobileRepository.findAll();
    }

    @GetMapping("/materiels/all")
    public Iterable<Materiel> getAllMaterielsAPI() {
        return materielRepository.findAll();
    }
}
