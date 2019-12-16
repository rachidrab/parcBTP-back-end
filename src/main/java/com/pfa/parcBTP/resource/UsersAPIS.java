package com.pfa.parcBTP.resource;


import com.pfa.parcBTP.model.*;
import com.pfa.parcBTP.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RequestMapping("/api/users")
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

    @Autowired
    AdminRepository adminRepository;


    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/admin")
    public Optional<Admin> adminAPI() {

        return adminRepository.findByUsername("rachidrabou");

        //return "Hello Youtube";
    }


    @PreAuthorize("hasAnyRole('MAGASINIER','ADMIN')")
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

        return transporterRepository.findByUsername("nouhailasahib");

        //return "Hello Youtube";
    }

    @PreAuthorize("hasAnyRole('CHEF_CHANTIER')")
    @GetMapping("/chef")
    public Optional<ChefChantier> chefChantierAPI() {

        return chefChantierRepository.findByUsername("asmarabou");
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
