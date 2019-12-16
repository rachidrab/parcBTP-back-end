package com.pfa.parcBTP.repository.interfaces;

import com.pfa.parcBTP.model.ChefChantier;
import com.pfa.parcBTP.model.Magasinier;
import com.pfa.parcBTP.model.Transporter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.Optional;

public interface MagasinierRepository extends CrudRepository<Magasinier, Integer> {

    Optional<Magasinier> findByUsername(String username);

}
