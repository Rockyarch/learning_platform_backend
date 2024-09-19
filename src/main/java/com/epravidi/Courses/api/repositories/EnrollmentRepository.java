package com.epravidi.Courses.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epravidi.Courses.api.entities.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment,Long>{

}
