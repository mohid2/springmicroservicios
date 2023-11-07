package com.microservice.course.service.impl;

import com.microservice.course.entity.Course;
import com.microservice.course.repository.CourseRepository;
import com.microservice.course.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;
    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll() ;
    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id).orElseThrow(() -> new RuntimeException("El curso no existe"));
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }
}
