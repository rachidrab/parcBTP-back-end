package com.pfa.parcBTP.repository;

import com.pfa.parcBTP.model.ChefChantier;
import com.pfa.parcBTP.model.Conducteur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ConducteurRepository extends JpaRepository<Conducteur, Integer> {


    Optional<Conducteur> findByUsername(String username);


}
