package org.example.univ.controller;

import lombok.RequiredArgsConstructor;
import org.example.univ.entity.Section;
import org.example.univ.service.SectionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/section")
public class SectionController {
    private final SectionService sectionService;

    @GetMapping
    ResponseEntity<List<Section>> getAll(){
        return ResponseEntity.ok(sectionService.getAllSection());
    }
}
