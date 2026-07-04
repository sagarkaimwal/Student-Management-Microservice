package com.microservices.enrollment_service.Controller;

import com.microservices.enrollment_service.Entity.EnrollmentResponse;
import com.microservices.enrollment_service.Service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {
    @Autowired
    private EnrollmentService service;

    @PostMapping
    public EnrollmentResponse enroll(@RequestParam Long studentId,@RequestParam Long courseId){
        return service.enroll(studentId,courseId);
    }
}
