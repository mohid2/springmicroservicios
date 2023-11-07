package com.microservice.student.service;

import com.microservice.student.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getAllStudents();
    List<Student> getAllByCourseId(Long courseId);
    Student findById(Long id);

    Student saveStudent(Student student);
}
