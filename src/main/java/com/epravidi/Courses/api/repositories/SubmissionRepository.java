package com.epravidi.Courses.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epravidi.Courses.api.entities.Submission;

public interface SubmissionRepository extends JpaRepository<Submission,Long>{

}
