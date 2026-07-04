package com.microservices.student_service.Repository;

import com.microservices.student_service.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
