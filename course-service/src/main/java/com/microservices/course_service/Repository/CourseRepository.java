package com.microservices.course_service.Repository;

import com.microservices.course_service.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
