package com.pfa.parcBTP.resource;


import com.pfa.parcBTP.model.ChefChantier;
import com.pfa.parcBTP.model.Conducteur;
import com.pfa.parcBTP.model.Magasinier;
import com.pfa.parcBTP.model.Transporter;
import com.pfa.parcBTP.repository.ChefChantierRepository;
import com.pfa.parcBTP.repository.ConducteurRepository;
import com.pfa.parcBTP.repository.MagasinierRepository;
import com.pfa.parcBTP.repository.TransporterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RequestMapping("/rest")
@RestController
public class UsersAPIS {

    @Autowired
    TransporterRepository transporterRepository;

    @Autowired
    ChefChantierRepository chefChantierRepository;

    @Autowired
    MagasinierRepository magasinierRepository;

    @Autowired
    ConducteurRepository conducteurRepository;


    @PreAuthorize("hasAnyRole('MAGASINIER')")
    @GetMapping("/magasinier")
    public Optional<Magasinier> magasinierAPI() {

        return magasinierRepository.findByUsername("khalidrabou");

        //return "Hello Youtube";
    }


    @PreAuthorize("hasAnyRole('CONDUCTEUR')")
    @GetMapping("/conducteur")
    public Optional<Conducteur> conducteurAPI() {

        return conducteurRepository.findByUsername("zakariarabou");

        //return "Hello Youtube";
    }


    @PreAuthorize("hasAnyRole('TRANSPORTEUR')")
    @GetMapping("/transporter")
    public Optional<Transporter> transporterAPI() {

        return transporterRepository.findByUsername("rachidrabou");

        //return "Hello Youtube";
    }

    @PreAuthorize("hasAnyRole('CHEF_CHANTIER')")
    @GetMapping("/chef")
    public Optional<ChefChantier> chefChantierAPI() {

        return chefChantierRepository.findByUsername("nouhailasahib");
        //return "Hello Youtube";
    }

    @PreAuthorize("hasAnyRole(' ')")
    @GetMapping("/secured/all")
    public String securedHello() {
        return "Secured Hello";
    }

    @GetMapping("/secured/alternate")
    public String alternate() {
        return "alternate";
    }
}
