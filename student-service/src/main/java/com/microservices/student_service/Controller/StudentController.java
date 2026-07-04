package com.microservices.student_service.Controller;

import com.microservices.student_service.Entity.Student;
import com.microservices.student_service.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService service;
    @PostMapping
    public Student saveStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }
    @GetMapping
    public List<Student> getAllStudents(){
        return service.getAllStudents();
    }
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id){
        return service.getStudentById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id){
        service.deleteStudent(id);
    }
}
