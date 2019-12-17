package com.pfa.parcBTP.resource;


import com.pfa.parcBTP.model.Engin;
import com.pfa.parcBTP.model.Transporter;
import com.pfa.parcBTP.repository.interfaces.EnginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/engins")
@RestController
public class EnginAPIS {

    @Autowired
    EnginRepository enginRepository;


    @GetMapping("/all")
    public Iterable<Engin> getAllEnginsAPI() {
        return enginRepository.findAll();
    }

    @PostMapping("/add")
    Engin addEngin(@RequestBody Engin engin) {
        return enginRepository.save(engin);
    }




}
