package com.pfa.parcBTP.repository;

import com.pfa.parcBTP.model.Accessoire;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AccessoireRepository extends CrudRepository<Accessoire, Integer> {

    Optional<Accessoire> findById(int id);
}
