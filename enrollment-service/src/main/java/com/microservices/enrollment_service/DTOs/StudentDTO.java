package com.microservices.enrollment_service.DTOs;

import lombok.Data;

@Data
public class StudentDTO {
    private Long id;
    private String name;
    private String email;
}
