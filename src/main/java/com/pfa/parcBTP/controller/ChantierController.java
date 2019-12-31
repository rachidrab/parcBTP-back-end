package com.pfa.parcBTP.controller;


import com.pfa.parcBTP.model.Chantier;
import com.pfa.parcBTP.repository.ChantierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("chantiers")
@RestController
public class ChantierController {

    @Autowired
    ChantierRepository chantierRepository;


    @GetMapping("all")
    public Iterable<Chantier> getAllChantier() {
        return chantierRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Chantier> getChantierById( @PathVariable int id) {
        return chantierRepository.findById(id);
    }


}
