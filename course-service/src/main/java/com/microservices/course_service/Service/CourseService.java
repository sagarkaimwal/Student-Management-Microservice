package com.microservices.course_service.Service;

import com.microservices.course_service.Entity.Course;
import com.microservices.course_service.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository repository;
    public Course saveCourse(Course course){
        return repository.save(course);
    }
    public List<Course> getAllCourses(){
        return repository.findAll();
    }
    public Course getCourseById(Long id){
        return repository.findById(id).orElseThrow(()->new RuntimeException("Course not found"));
    }
    public void deleteCourse(Long id){
        repository.deleteById(id);
    }
}
