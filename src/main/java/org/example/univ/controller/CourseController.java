package org.example.univ.controller;

import lombok.RequiredArgsConstructor;
import org.example.univ.entity.Course;
import org.example.univ.service.CourseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/course")
public class CourseController {
    private final CourseService courseService;
    @GetMapping
    ResponseEntity<List<Course>> getAll(){
        return ResponseEntity.ok(courseService.getAllCourses());
    }
    @PostMapping
    ResponseEntity<String> addCourse(@RequestBody Course course){
        return ResponseEntity.ok(courseService.addCourse(course));
    }
    @DeleteMapping("/{id}")
    ResponseEntity<String> deleteCourse(@PathVariable int id){
        return ResponseEntity.ok(courseService.deleteCourse(id));
    }
    @PutMapping
    ResponseEntity<String> updateCourse(@RequestBody Course course){
        return ResponseEntity.ok(courseService.updateCourse(course));
    }
}
