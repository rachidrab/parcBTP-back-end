package com.pfa.parcBTP.repository;

import com.pfa.parcBTP.model.BonTransport;
import com.pfa.parcBTP.model.Camion;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BonTransportsRepository extends CrudRepository<BonTransport, Integer> {


    Iterable<BonTransport> getAllByCamion(Camion camion);
    Iterable<BonTransport> getAllByCamion_Id(int id);


}
