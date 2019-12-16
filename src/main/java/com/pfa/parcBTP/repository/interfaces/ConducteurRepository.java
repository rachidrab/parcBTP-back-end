package com.pfa.parcBTP.repository.interfaces;

import com.pfa.parcBTP.model.ChefChantier;
import com.pfa.parcBTP.model.Conducteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ConducteurRepository extends CrudRepository<Conducteur, Integer> {


    Optional<Conducteur> findByUsername(String username);


}
