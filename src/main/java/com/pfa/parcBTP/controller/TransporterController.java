package com.pfa.parcBTP.controller;


import com.pfa.parcBTP.model.Transporter;
import com.pfa.parcBTP.repository.TransporterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/transporteurs")
public class TransporterController {

    @Autowired
    TransporterRepository transporterRepository;


    @GetMapping("/all")
    public Iterable<Transporter> getAllTransportersAPI() {
        return transporterRepository.findAll();
    }


    @GetMapping("/{id}")
    public Optional<Transporter> getTransporterById(@PathVariable int id)
    {
        return transporterRepository.findById(id);
    }



    @PostMapping("/add")
    Transporter addTransporter(@RequestBody Transporter transporter) {
        return transporterRepository.save(transporter);
    }

}
