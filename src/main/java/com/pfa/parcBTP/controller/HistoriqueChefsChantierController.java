package com.pfa.parcBTP.controller;


import com.pfa.parcBTP.model.ConducteurEngin;
import com.pfa.parcBTP.model.PiloteChantier;
import com.pfa.parcBTP.repository.HistoriqueChefsChantierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("historiqueChefsChantier")
public class HistoriqueChefsChantierController {


    @Autowired
    HistoriqueChefsChantierRepository historiqueChefsChantierRepository;

    @GetMapping("/all")
    public Iterable<PiloteChantier> getAllHistoriques() {
        return historiqueChefsChantierRepository.findAll();
    }

    @GetMapping("/chantier/{id}")
    public Iterable<PiloteChantier> getHistoriqueChantierById(@PathVariable int id)
    {
        return historiqueChefsChantierRepository.findAllByChantier_Id(id);
    }




}
