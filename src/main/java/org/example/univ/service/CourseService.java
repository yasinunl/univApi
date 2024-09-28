package org.example.univ.service;

import lombok.RequiredArgsConstructor;
import org.example.univ.entity.Course;
import org.example.univ.entity.Section;
import org.example.univ.repo.CourseRepo;
import org.example.univ.repo.SectionRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CourseService {
    private final CourseRepo courseRepo;
    private final SectionRepo sectionRepo;
    public List<Course> getAllCourses(){
        return courseRepo.findAll();
    }
    public String addCourse(Course course){
        if(course.getName().isEmpty() || course.getLink().isEmpty() || course.getSection() == null) throw new RuntimeException();

        Section section = sectionRepo.findByNumber(course.getSection().getNumber()).orElseThrow();
        Course newCourse = new Course();
        newCourse.setName(course.getName());
        newCourse.setLink(course.getLink());
        newCourse.setSection(section);

        courseRepo.save(newCourse);
        return "successful";
    }
    public String deleteCourse(int id){
        courseRepo.findById(id).orElseThrow();
        courseRepo.deleteById(id);
        return "successful";
    }
    public String updateCourse(Course course){
        if(course.getId() == 0 || course.getLink().isEmpty() || course.getName().isEmpty()) throw new RuntimeException();
        Course newCourse = courseRepo.findById(course.getId()).orElseThrow();
        newCourse.setName(course.getName());
        newCourse.setLink(course.getLink());
        courseRepo.save(newCourse);
        return "successful";
    }
}
