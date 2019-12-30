package com.pfa.parcBTP.repository;

import com.pfa.parcBTP.model.ConducteurEngin;
import org.springframework.data.repository.CrudRepository;

public interface ConducteurEnginRepository extends CrudRepository<ConducteurEngin, Integer> {

    Iterable<ConducteurEngin> findAllByEngin_Id(int id);

}
