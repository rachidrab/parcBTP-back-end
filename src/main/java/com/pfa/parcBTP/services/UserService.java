package com.pfa.parcBTP.services;


import javax.persistence.EntityManager;

public class UserService {

    EntityManager em;

    public UserService(EntityManager em) {
        this.em = em;
    }


}
