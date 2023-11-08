package com.microservice.course.service;

import com.microservice.course.entity.Course;
import com.microservice.course.http.response.StudentByCourseResponse;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourses();
    Course findById(Long id);
    Course saveCourse(Course course);
    StudentByCourseResponse findAllStudentByCourse(Long courseId);
}
