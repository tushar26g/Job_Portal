package com.example.demo.repo;


import com.example.demo.entity.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface PostRepo extends MongoRepository<Post,String>{

}
