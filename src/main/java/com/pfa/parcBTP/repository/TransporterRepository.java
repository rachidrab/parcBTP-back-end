package com.pfa.parcBTP.repository;

import com.pfa.parcBTP.model.Transporter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TransporterRepository extends CrudRepository<Transporter, Integer> {

    Optional<Transporter> findByUsername(String username);
    Optional<Transporter> findByLastName(String lastName);
    Optional<Transporter> findById(int id);


}
