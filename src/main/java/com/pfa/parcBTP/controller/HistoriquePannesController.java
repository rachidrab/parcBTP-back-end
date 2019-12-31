package com.pfa.parcBTP.controller;

import com.pfa.parcBTP.model.ConducteurEngin;
import com.pfa.parcBTP.model.HistoriquePannes;
import com.pfa.parcBTP.repository.ConducteurEnginRepository;
import com.pfa.parcBTP.repository.EnginRepository;
import com.pfa.parcBTP.repository.HistoriquePannesRepository;
import com.pfa.parcBTP.repository.ObjetMobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("historiquePannes")
public class HistoriquePannesController  {


    @Autowired
    HistoriquePannesRepository historiquePannesRepository;


    @Autowired
    ObjetMobileRepository objetMobileRepository;

    @GetMapping("/all")
    public Iterable<HistoriquePannes> getAllHistoriquesPannes() {
        return historiquePannesRepository.findAll();
    }

    @GetMapping("/objet/{id}")
    public Iterable<HistoriquePannes> getHistoriqueObjetMobileById(@PathVariable int id)
    {
        return historiquePannesRepository.getAllByObjetMobile_Id(id);
    }






}
