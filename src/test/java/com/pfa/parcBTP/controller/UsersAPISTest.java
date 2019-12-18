package com.pfa.parcBTP.controller;

import com.pfa.parcBTP.model.User;
import com.pfa.parcBTP.repository.UsersRepository;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class UsersAPISTest {

    UsersRepository usersRepository;

    @Test
    Optional<User> getAllUsersAPI() {
        return usersRepository.findById(1);
    }

    @Test
    void getAllMagasinierAPI() {
    }

    @Test
    void getAllChefChantierAPI() {
    }

    @Test
    void getAllTransporteurAPI() {
    }

    @Test
    void getAllConducteurAPI() {
    }

    @Test
    void getUserAPI() {
    }
}