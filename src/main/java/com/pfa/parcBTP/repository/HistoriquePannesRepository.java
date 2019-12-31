package com.pfa.parcBTP.repository;

import com.pfa.parcBTP.model.BonTransport;
import com.pfa.parcBTP.model.Camion;
import com.pfa.parcBTP.model.HistoriquePannes;
import com.pfa.parcBTP.model.ObjetMobile;
import org.springframework.data.repository.CrudRepository;

public interface HistoriquePannesRepository extends CrudRepository<com.pfa.parcBTP.model.HistoriquePannes, Integer> {


    Iterable<HistoriquePannes> getAllByObjetMobile(ObjetMobile objetMobile);
    Iterable<HistoriquePannes> getAllByObjetMobile_Id(int id);


}
