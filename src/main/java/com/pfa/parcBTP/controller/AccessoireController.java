package com.pfa.parcBTP.controller;

import com.pfa.parcBTP.model.Accessoire;
import com.pfa.parcBTP.model.Engin;
import com.pfa.parcBTP.model.Transporter;
import com.pfa.parcBTP.model.User;
import com.pfa.parcBTP.repository.AccessoireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/accessoires")
@RestController
public class AccessoireController {

    @Autowired
    AccessoireRepository accessoireRepository;


    @GetMapping("/all")
    public Iterable<Accessoire> getAllAccessoires() {
        return accessoireRepository.findAll();
    }


    @PostMapping("/add")
    Accessoire addAccessoire(@RequestBody String  nomAccessoire) {
        Accessoire accessoire = new Accessoire();
        accessoire.setNom(nomAccessoire);
        return accessoireRepository.save(accessoire);
    }


    @GetMapping("{id}")
    public Optional<Accessoire> getAccessoireById(@PathVariable int id)
    {
        return accessoireRepository.findById(id);
    }




}
