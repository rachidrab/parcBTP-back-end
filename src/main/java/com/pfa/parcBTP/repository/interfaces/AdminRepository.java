package com.pfa.parcBTP.repository.interfaces;

import com.pfa.parcBTP.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AdminRepository extends CrudRepository<Admin, Integer> {

    Optional<Admin> findByUsername(String username);
}
