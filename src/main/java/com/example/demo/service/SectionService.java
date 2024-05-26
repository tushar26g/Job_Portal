package com.example.demo.service;

import com.example.demo.entity.Section;
import com.example.demo.repo.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SectionService {

    @Autowired
    private SectionRepository sectionRepository;

    public Section getSectionByKey(String key) {
        return sectionRepository.findByKey(key);
    }
}

