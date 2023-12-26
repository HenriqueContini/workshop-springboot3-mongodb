package com.estudos.workshop_spring_mongo.services;

import com.estudos.workshop_spring_mongo.domain.Post;
import com.estudos.workshop_spring_mongo.repository.PostRepository;
import com.estudos.workshop_spring_mongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository repository;

    public Post findById(String id) {
        Optional<Post> post = repository.findById(id);
        return post.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
