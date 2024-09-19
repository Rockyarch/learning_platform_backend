package com.epravidi.Courses.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epravidi.Courses.api.entities.Assignment;

public interface AssignmentRepository extends JpaRepository<Assignment,Long>{

}
