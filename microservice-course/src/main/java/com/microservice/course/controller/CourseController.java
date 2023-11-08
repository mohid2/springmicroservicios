package com.microservice.course.controller;

import com.microservice.course.entity.Course;
import com.microservice.course.http.response.StudentByCourseResponse;
import com.microservice.course.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;
    @GetMapping()
    public ResponseEntity<List<Course>> getAllCourses(){
        return ResponseEntity.ok(courseService.getAllCourses());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Course> getCourse(@PathVariable Long id){
        return ResponseEntity.ok(courseService.findById(id));
    }

    @GetMapping("/search-student/{courseId}")
    public ResponseEntity<StudentByCourseResponse> findAllStudentByCourseId(@PathVariable Long courseId){
        return ResponseEntity.ok(courseService.findAllStudentByCourse(courseId));
    }

    @PostMapping()
    public ResponseEntity<Course> save(@RequestBody Course course){
        return ResponseEntity.ok(courseService.saveCourse(course));
    }
}
