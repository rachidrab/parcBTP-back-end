package com.pfa.parcBTP.repository.interfaces;

import com.pfa.parcBTP.model.ChefChantier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ChefChantierRepository extends CrudRepository<ChefChantier, Integer> {

    Optional<ChefChantier> findByUsername(String username);

}
