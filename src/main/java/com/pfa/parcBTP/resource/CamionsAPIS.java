package com.pfa.parcBTP.resource;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pfa.parcBTP.model.Camion;
import com.pfa.parcBTP.model.Engin;
import com.pfa.parcBTP.model.User;
import com.pfa.parcBTP.repository.interfaces.CamionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/api/camions")
@RestController
public class CamionsAPIS {

    @Autowired
    CamionRepository camionRepository;

    @GetMapping("/all")
    public Iterable<Camion> getAllCamionsAPI() {
        return camionRepository.findAll();
    }


}
