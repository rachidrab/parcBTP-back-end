package com.pfa.parcBTP.repository.interfaces;

import com.pfa.parcBTP.model.Conducteur;
import com.pfa.parcBTP.model.Engin;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface EnginRepository extends CrudRepository<Engin, Integer> {

    Optional<Engin> findByCarburant(String carburant);
}
