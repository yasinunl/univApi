package org.example.univ.service;

import lombok.RequiredArgsConstructor;
import org.example.univ.entity.Section;
import org.example.univ.repo.SectionRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SectionService {
    private final SectionRepo sectionRepo;
    public List<Section> getAllSection(){
        return sectionRepo.findAll();
    }
}
