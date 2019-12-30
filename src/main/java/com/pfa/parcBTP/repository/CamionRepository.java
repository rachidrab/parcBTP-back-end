package com.pfa.parcBTP.repository;

import com.pfa.parcBTP.model.Camion;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface CamionRepository extends CrudRepository<Camion, Integer> {

    Iterable<Camion> findAllByMarque(String marque);

    Camion findByMarque(String marque);

    Camion findById(int id);







}
