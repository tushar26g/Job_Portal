package com.example.demo.service;

import com.example.demo.entity.Post;

import java.util.List;

public interface JobService {
    public List<Post> findByText(String text);
}
