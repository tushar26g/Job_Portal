package com.example.demo.Controller;

import com.example.demo.entity.Post;
import com.example.demo.repo.PostRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class postController {
    @Autowired
    PostRepo postRepo;
    @GetMapping("/allPosts")
    public List<Post> getAllPosts()
    {
        return postRepo.findAll();
    }
}
