package com.microservices.course_service.Controller;

import com.microservices.course_service.Entity.Course;
import com.microservices.course_service.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseService service;

    @PostMapping
    public Course saveCourse(@RequestBody Course course){
        return service.saveCourse(course);
    }
    @GetMapping
    public List<Course> getAllCourses(){
        return service.getAllCourses();
    }
    @GetMapping("/{id}")
    public Course getCourse(@PathVariable Long id){
        return service.getCourseById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id){
        service.deleteCourse(id);
    }
}
