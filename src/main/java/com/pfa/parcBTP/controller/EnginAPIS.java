package com.pfa.parcBTP.controller;


import com.pfa.parcBTP.model.Accessoire;
import com.pfa.parcBTP.model.Engin;
import com.pfa.parcBTP.model.Status;
import com.pfa.parcBTP.repository.EnginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/engins")
@RestController
public class EnginAPIS {

    @Autowired
    EnginRepository enginRepository;


    @GetMapping("/all")
    public Iterable<Engin> getAllEnginsAPI() {
        return enginRepository.findAll();
    }


    @GetMapping("{id}")
    public Optional<Engin> getEnginById(@PathVariable int id)
    {
        return enginRepository.findById(id);
    }





    @PostMapping("/add")
    Engin addEngin(@RequestBody Engin engin) {
        // FAUT CREER UNE CLASSE D'ASSOCIATION ENTRE STATUS ET OBJET MOBILE POUR SAVOIR QUAND EST CE QUE L OBJET
        // EST TOMBE EN PANNE/A MARCHE
        return enginRepository.save(engin);
    }




}
