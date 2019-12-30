package com.pfa.parcBTP.controller;


import com.pfa.parcBTP.model.*;
import com.pfa.parcBTP.repository.*;
import com.pfa.parcBTP.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/users")
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


    @GetMapping("/chef_chantier/all")
    public Iterable<ChefChantier> getAllChefChantierAPI() {
        return chefChantierRepository.findAll();
    }

    // Tous Les Transporteurs


    @GetMapping("/transporteur/all")
    public Iterable<Transporter> getAllTransporteurAPI() {
        return transporterRepository.findAll();
    }

    // Tous Les Conducteurs

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
    Transporter addTransporter(@RequestBody Transporter transporter) {
        return transporterRepository.save(transporter);
    }


    @PostMapping("/admins/add")
    Admin addAdmin(@RequestBody Admin admin) {
        return adminRepository.save(admin);
    }


    // APIS pour tester


    @GetMapping("/magasinier")
    public Optional<Magasinier> magasinierAPI() {
        return magasinierRepository.findByUsername("khalidrabou");

    }


    @GetMapping("/conducteur")
    public Optional<Conducteur> conducteurAPI() {

        return conducteurRepository.findByUsername("zakariarabou");

        //return "Hello Youtube";
    }



    @GetMapping("/transporter")
    public Optional<Transporter> transporterAPI() {

        return transporterRepository.findByUsername("nouhailasahib");

        //return "Hello Youtube";
    }


    @GetMapping("/chef")
    public Optional<ChefChantier> chefChantierAPI() {

        return chefChantierRepository.findByUsername("asmarabou");
        //return "Hello Youtube";
    }


    @GetMapping("/secured/all")
    public String securedHello() {
        return "Secured Hello";
    }


    @GetMapping("/secured/alternate")
    public String alternate() {
        return "alternate";
    }
}
