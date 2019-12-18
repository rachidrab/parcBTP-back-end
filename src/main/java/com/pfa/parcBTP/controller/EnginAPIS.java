package com.pfa.parcBTP.controller;


import com.pfa.parcBTP.model.Accessoire;
import com.pfa.parcBTP.model.Engin;
import com.pfa.parcBTP.repository.EnginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/engins")
@RestController
public class EnginAPIS {

    @Autowired
    EnginRepository enginRepository;


    @GetMapping("/all")
    public Iterable<Engin> getAllEnginsAPI() {
        return enginRepository.findAll();
    }

    @GetMapping("/accessoires")
    public Iterable<Engin> getAllEnginsByAccessoireAPI() {
        return enginRepository.findAllByAccessoiresIsNotNull();
    }





    @PostMapping("/add")
    Engin addEngin(@RequestBody Engin engin) {
        return enginRepository.save(engin);
    }




}
