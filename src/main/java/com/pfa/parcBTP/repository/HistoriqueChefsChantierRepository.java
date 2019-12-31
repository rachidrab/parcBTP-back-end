package com.pfa.parcBTP.repository;

import com.pfa.parcBTP.model.PiloteChantier;
import org.springframework.data.repository.CrudRepository;

public interface HistoriqueChefsChantierRepository extends CrudRepository<PiloteChantier, Integer> {


    Iterable<PiloteChantier> findAllByChantier_Id(int id);


}
