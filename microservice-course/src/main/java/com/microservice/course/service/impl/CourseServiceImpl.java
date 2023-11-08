package com.microservice.course.service.impl;

import com.microservice.course.client.StudentClient;
import com.microservice.course.dto.StudentDto;
import com.microservice.course.entity.Course;
import com.microservice.course.http.response.StudentByCourseResponse;
import com.microservice.course.repository.CourseRepository;
import com.microservice.course.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;
    private final StudentClient studentClient;
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

    @Override
    public StudentByCourseResponse findAllStudentByCourse(Long courseId) {
        Course course= courseRepository.findById(courseId).orElseThrow();
        List<StudentDto> studentDtoList=studentClient.findAllStudentByCourse(courseId);
        return StudentByCourseResponse.builder()
                .courseName(course.getName())
                .teacher(course.getTeacher())
                .studentDtoList(studentDtoList).build();
    }
}
