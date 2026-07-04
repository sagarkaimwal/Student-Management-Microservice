package com.microservices.enrollment_service.Repository;

import com.microservices.enrollment_service.Entity.EnrollmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<EnrollmentEntity,Long> {
}
