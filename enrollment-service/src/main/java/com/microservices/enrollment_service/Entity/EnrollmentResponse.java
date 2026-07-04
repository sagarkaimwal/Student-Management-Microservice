package com.microservices.enrollment_service.Entity;

import com.microservices.enrollment_service.DTOs.CourseDTO;
import com.microservices.enrollment_service.DTOs.StudentDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnrollmentResponse {
    private Long id;
    private StudentDTO student;
    private CourseDTO course;
}
