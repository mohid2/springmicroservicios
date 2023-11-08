package com.microservice.student.controller;

import com.microservice.student.entity.Student;
import com.microservice.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping()
    public ResponseEntity<List<Student>> getAllStudents(){
        return ResponseEntity.ok(studentService.getAllStudents());
    }


    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable  Long id){
        return ResponseEntity.ok(studentService.findById(id));
    }
    @PostMapping()
    public ResponseEntity<Student> save(@RequestBody  Student student){
        return ResponseEntity.ok(studentService.saveStudent(student));
    }
    @GetMapping("/search-by-course/{courseId}")
    public ResponseEntity<List<Student>> getAllStudentByCourseId(@PathVariable  Long courseId){
        return ResponseEntity.ok(studentService.getAllByCourseId(courseId));
    }
}
