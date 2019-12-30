package com.pfa.parcBTP.repository;

import com.pfa.parcBTP.model.Engin;
import com.pfa.parcBTP.model.Materiel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MaterielRepository extends CrudRepository<Materiel, Integer> {

    Optional<Materiel> findById(int id);

}
