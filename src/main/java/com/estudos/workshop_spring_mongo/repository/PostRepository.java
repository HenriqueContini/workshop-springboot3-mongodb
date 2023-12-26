package com.estudos.workshop_spring_mongo.repository;

import com.estudos.workshop_spring_mongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}