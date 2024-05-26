package com.example.demo.Controller;

import com.example.demo.entity.Section;
import com.example.demo.repo.SectionRepository;
import com.example.demo.service.SectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class SectionController {
    @Autowired
    private SectionService sectionService;

    @GetMapping("/sections")
    public Section getSection(@RequestParam String key) {
        System.out.println("Tushar");
        return sectionService.getSectionByKey(key);
    }
}
