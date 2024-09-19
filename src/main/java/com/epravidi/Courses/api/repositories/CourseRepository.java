package com.epravidi.Courses.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epravidi.Courses.api.entities.Course;

public interface CourseRepository extends JpaRepository<Course,Long>{
    
} 
