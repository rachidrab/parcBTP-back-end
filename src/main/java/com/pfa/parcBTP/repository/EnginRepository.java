package com.pfa.parcBTP.repository;

import com.pfa.parcBTP.model.Accessoire;
import com.pfa.parcBTP.model.Conducteur;
import com.pfa.parcBTP.model.Engin;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EnginRepository extends CrudRepository<Engin, Integer> {

    Optional<Engin> findByCarburant(String carburant);

    Iterable<Engin> findAllByAccessoiresIsNotNull();


}
