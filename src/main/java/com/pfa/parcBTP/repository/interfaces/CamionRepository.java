package com.pfa.parcBTP.repository.interfaces;

import com.pfa.parcBTP.model.Camion;
import com.pfa.parcBTP.model.Engin;
import com.pfa.parcBTP.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CamionRepository extends CrudRepository<Camion, Integer> {

    Optional<Camion> findByMarque(String marque);



}
