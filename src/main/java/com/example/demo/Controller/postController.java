package com.example.demo.Controller;

import com.example.demo.entity.Post;
import com.example.demo.repo.PostRepo;
import com.example.demo.service.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post)
    {
        return postRepo.save(post);
    }


//    @GetMapping("/posts/{text}")
//    @CrossOrigin
//    public List<Post> search(@PathVariable String text)
//    {
//        return JobService.findByText(text);
//    }
}
