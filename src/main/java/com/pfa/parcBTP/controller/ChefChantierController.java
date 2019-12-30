package com.pfa.parcBTP.controller;

import com.pfa.parcBTP.model.ChefChantier;
import com.pfa.parcBTP.model.Magasinier;
import com.pfa.parcBTP.repository.ChefChantierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/chefschantier")
public class ChefChantierController {


    @Autowired
    ChefChantierRepository chefChantierRepository;


    @GetMapping("/all")
    public Iterable<ChefChantier> getAllChefsAPI() {
        return chefChantierRepository.findAll();
    }


    @GetMapping("/{id}")
    public Optional<ChefChantier> getChefById(@PathVariable int id)
    {
        return chefChantierRepository.findById(id);
    }



    @PostMapping("/add")
    ChefChantier addChefChantier(@RequestBody ChefChantier chefChantier) {
        return chefChantierRepository.save(chefChantier);
    }


}
