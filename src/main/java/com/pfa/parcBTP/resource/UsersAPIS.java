package com.pfa.parcBTP.resource;


import com.pfa.parcBTP.model.*;
import com.pfa.parcBTP.repository.interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.*;

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

    @Autowired
    UsersRepository usersRepository;

    ChefChantier chefChantier;


    @GetMapping("/all")
    public Iterable<User> getAllUsersAPI() {
        return usersRepository.findAll();
    }

    // Tous Les Utilisateurs

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/magasinier/all")
    public Iterable<Magasinier> getAllMagasinierAPI() {
        return magasinierRepository.findAll();
    }

    // Tous Les Magasiniers

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/chef_chantier/all")
    public Iterable<ChefChantier> getAllChefChantierAPI() {
        return chefChantierRepository.findAll();
    }

    // Tous Les Transporteurs

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/transporteur/all")
    public Iterable<Transporter> getAllTransporteurAPI() {
        return transporterRepository.findAll();
    }

    // Tous Les Conducteurs

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/conducteur/all")
    public Iterable<Conducteur> getAllConducteurAPI() {
        return conducteurRepository.findAll();
    }




    @GetMapping("/{id}")
    public Optional<User> getUserAPI(@PathVariable long id) {
        return usersRepository.findById(id);
    }

    @GetMapping("/magasinier/{id}")
    public Optional<Magasinier> getMagasinierAPI(@PathVariable int id) {
        return magasinierRepository.findById(id);
    }


    // POST APIS
    @PostMapping("/add")
    Magasinier addMagasinier(@RequestBody Magasinier magasinier) {
        return magasinierRepository.save(magasinier);
    }



    // APIS pour tester

    @PreAuthorize("hasAnyRole('MAGASINIER','ADMIN')")
    @GetMapping("/magasinier")
    public Optional<Magasinier> magasinierAPI() {
        return magasinierRepository.findByUsername("khalidrabou");

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
