package com.microservices.enrollment_service.Service;

import com.microservices.enrollment_service.DTOs.CourseDTO;
import com.microservices.enrollment_service.DTOs.StudentDTO;
import com.microservices.enrollment_service.Entity.EnrollmentEntity;
import com.microservices.enrollment_service.Entity.EnrollmentResponse;
import com.microservices.enrollment_service.FeignClients.CourseClient;
import com.microservices.enrollment_service.FeignClients.StudentClient;
import com.microservices.enrollment_service.Repository.EnrollmentRepository;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnrollmentService {
    @Autowired
    private EnrollmentRepository repository;

    @Autowired
    private StudentClient studentClient;

    @Autowired
    private CourseClient courseClient;

    public EnrollmentResponse enroll(Long studentId,Long courseId){
        StudentDTO student=studentClient.getStudentById(studentId);
        CourseDTO course=courseClient.getCourseById(courseId);
        EnrollmentEntity enrollment=new EnrollmentEntity();
        enrollment.setStudentId(studentId);
        enrollment.setCourseId(courseId);
        EnrollmentEntity saved=repository.save(enrollment);
        return  new EnrollmentResponse(saved.getId(),student,course);
    }
}
