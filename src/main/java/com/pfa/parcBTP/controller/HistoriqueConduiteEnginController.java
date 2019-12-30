package com.pfa.parcBTP.controller;


import com.pfa.parcBTP.model.ConducteurEngin;

import com.pfa.parcBTP.model.Engin;
import com.pfa.parcBTP.repository.ConducteurEnginRepository;
import com.pfa.parcBTP.repository.EnginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/historiqueConduiteEngin")
@RestController
public class HistoriqueConduiteEnginController {

    @Autowired
    ConducteurEnginRepository conducteurEnginRepository;


    @Autowired
    EnginRepository enginRepository;

    @GetMapping("/all")
    public Iterable<ConducteurEngin> getAllHistoriques() {
        return conducteurEnginRepository.findAll();
    }

    @GetMapping("/engin/{id}")
    public Iterable<ConducteurEngin> getHistoriqueEnginById(@PathVariable int id)
    {
        return conducteurEnginRepository.findAllByEngin_Id(id);
    }

}
