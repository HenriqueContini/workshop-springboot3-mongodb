package com.estudos.workshop_spring_mongo.services;

import com.estudos.workshop_spring_mongo.domain.User;
import com.estudos.workshop_spring_mongo.repository.UserRepository;
import com.estudos.workshop_spring_mongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id) {
        Optional<User> user = repository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
