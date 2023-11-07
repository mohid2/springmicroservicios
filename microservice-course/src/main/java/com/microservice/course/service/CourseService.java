package com.microservice.course.service;

import com.microservice.course.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourses();
    Course findById(Long id);

    Course saveCourse(Course course);
}
