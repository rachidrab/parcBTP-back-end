package com.pfa.parcBTP.controller;

import com.pfa.parcBTP.model.Magasinier;
import com.pfa.parcBTP.model.Transporter;
import com.pfa.parcBTP.repository.MagasinierRepository;
import com.pfa.parcBTP.repository.TransporterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/magasiniers")
public class MagasinierController {

    @Autowired
    MagasinierRepository magasinierRepository;


    @GetMapping("/all")
    public Iterable<Magasinier> getAllMagasiniersAPI() {
        return magasinierRepository.findAll();
    }


    @GetMapping("/{id}")
    public Optional<Magasinier> getMagasinierById(@PathVariable int id)
    {
        return magasinierRepository.findById(id);
    }



    @PostMapping("/add")
    Magasinier addMagasinier(@RequestBody Magasinier magasinier) {
        return magasinierRepository.save(magasinier);
    }
}
