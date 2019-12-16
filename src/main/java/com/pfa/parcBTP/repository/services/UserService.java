package com.pfa.parcBTP.repository.services;

import com.pfa.parcBTP.model.User;


import javax.persistence.EntityManager;
import javax.persistence.Query;

import java.util.Collection;

public class UserService {

    EntityManager em;

    public UserService(EntityManager em) {
        this.em = em;
    }


}
