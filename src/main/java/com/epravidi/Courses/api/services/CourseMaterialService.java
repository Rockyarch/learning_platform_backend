package com.epravidi.Courses.api.services;

import org.springframework.stereotype.Service;

import com.epravidi.Courses.api.entities.CourseMaterial;
import com.epravidi.Courses.api.repositories.CourseMaterialRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CourseMaterialService {

    private final CourseMaterialRepository courseMaterialRepository;

    public CourseMaterialService(CourseMaterialRepository courseMaterialRepository) {
        this.courseMaterialRepository = courseMaterialRepository;
    }

    public List<CourseMaterial> getAllCourseMaterials() {
        return courseMaterialRepository.findAll();
    }

    public Optional<CourseMaterial> getCourseMaterialById(Long id) {
        return courseMaterialRepository.findById(id);
    }

    public CourseMaterial saveCourseMaterial(CourseMaterial courseMaterial) {
        return courseMaterialRepository.save(courseMaterial);
    }

    public void deleteCourseMaterial(Long id) {
        courseMaterialRepository.deleteById(id);
    }
}
