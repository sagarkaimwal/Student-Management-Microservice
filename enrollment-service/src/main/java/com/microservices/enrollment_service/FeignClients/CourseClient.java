package com.microservices.enrollment_service.FeignClients;

import com.microservices.enrollment_service.DTOs.CourseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="course-service")
public interface CourseClient {

    @GetMapping("/courses/{id}")
    CourseDTO getCourseById(@PathVariable Long id);
}
