package com.pfa.parcBTP.repository;

import com.pfa.parcBTP.model.ObjetMobile;
import com.pfa.parcBTP.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ObjetMobileRepository extends CrudRepository<ObjetMobile, Integer> {

    Optional<ObjetMobile> findByPoids(double poids);
    Optional<ObjetMobile> findById(int id);
}
