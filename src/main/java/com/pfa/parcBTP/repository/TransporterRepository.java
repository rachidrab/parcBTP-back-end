package com.pfa.parcBTP.repository;

import com.pfa.parcBTP.model.Transporter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TransporterRepository extends JpaRepository<Transporter, Integer> {

    Optional<Transporter> findByUsername(String username);
    Optional<Transporter> findByLastName(String lastName);


}
