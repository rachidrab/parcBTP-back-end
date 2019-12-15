package com.pfa.parcBTP.repository;

import com.pfa.parcBTP.model.ChefChantier;
import com.pfa.parcBTP.model.Transporter;
import com.pfa.parcBTP.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ChefChantierRepository extends JpaRepository<ChefChantier, Integer> {

    Optional<ChefChantier> findByUsername(String username);
}
