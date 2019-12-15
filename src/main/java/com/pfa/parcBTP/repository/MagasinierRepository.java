package com.pfa.parcBTP.repository;

import com.pfa.parcBTP.model.ChefChantier;
import com.pfa.parcBTP.model.Magasinier;
import com.pfa.parcBTP.model.Transporter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MagasinierRepository extends JpaRepository<Magasinier, Integer> {

    Optional<Magasinier> findByUsername(String username);
}
