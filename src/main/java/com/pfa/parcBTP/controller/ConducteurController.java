package com.pfa.parcBTP.controller;


import com.pfa.parcBTP.model.ChefChantier;
import com.pfa.parcBTP.model.Conducteur;
import com.pfa.parcBTP.repository.ConducteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/conducteurs")
public class ConducteurController {

    @Autowired
    ConducteurRepository conducteurRepository;

    @GetMapping("/all")
    public Iterable<Conducteur> getAllConducteursAPI() {
        return conducteurRepository.findAll();
    }


    @GetMapping("/{id}")
    public Optional<Conducteur> getConducteurById(@PathVariable int id)
    {
        return conducteurRepository.findById(id);
    }



    @PostMapping("/add")
    Conducteur addConducteur(@RequestBody Conducteur conducteur) {
        return conducteurRepository.save(conducteur);
    }


}
