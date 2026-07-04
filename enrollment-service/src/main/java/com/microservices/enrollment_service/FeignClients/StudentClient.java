package com.microservices.enrollment_service.FeignClients;

import com.microservices.enrollment_service.DTOs.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="student-service")
public interface StudentClient {

    @GetMapping("/students/{id}")
    StudentDTO getStudentById(@PathVariable Long id);

}
