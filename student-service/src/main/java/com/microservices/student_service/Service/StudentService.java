package com.microservices.student_service.Service;

import com.microservices.student_service.Entity.Student;
import com.microservices.student_service.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public Student saveStudent(Student student){
        return repository.save(student);
    }
    public List<Student> getAllStudents(){
        return repository.findAll();
    }
    public Student getStudentById(Long id){
        return repository.findById(id)
                .orElseThrow(()->new RuntimeException("Student not found"));
    }
    public void deleteStudent(Long id){
        repository.deleteById(id);
    }
}
