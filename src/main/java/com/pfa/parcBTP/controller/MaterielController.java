package com.pfa.parcBTP.controller;

import com.pfa.parcBTP.model.*;
import com.pfa.parcBTP.repository.MaterielRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/materiels")
@RestController
public class MaterielController {

    @Autowired
    MaterielRepository materielRepository;


    @GetMapping("/all")
    public Iterable<Materiel> getAllMateriels() {
        return materielRepository.findAll();
    }


    @GetMapping("{id}")
    public Optional<Materiel> getMaterielById(@PathVariable int id)
    {
        return materielRepository.findById(id);
    }


    @PostMapping("/add")
    Materiel addMateriel(@RequestBody Materiel materiel) {
        return materielRepository.save(materiel);
    }





}
