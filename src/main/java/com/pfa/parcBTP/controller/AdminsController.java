package com.pfa.parcBTP.controller;

import com.pfa.parcBTP.model.Admin;
import com.pfa.parcBTP.model.ChefChantier;
import com.pfa.parcBTP.model.Role;
import com.pfa.parcBTP.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Set;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/admins")
public class AdminsController {

    @Autowired
    AdminRepository adminRepository;


    @GetMapping("/all")
    public Iterable<Admin> getAllAdminsAPI() {
        return adminRepository.findAll();
    }


    @GetMapping("/{id}")
    public Optional<Admin> getAdminById(@PathVariable int id)
    {
        return adminRepository.findById(id);
    }



    @PostMapping("/add")
    Admin addAdmin(@RequestBody Admin admin) {

        return adminRepository.save(admin);
    }




}

