package com.microservice.student.service.impl;

import com.microservice.student.entity.Student;
import com.microservice.student.repository.StudentRepository;
import com.microservice.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    public List<Student> getAllByCourseId(Long courseId) {
        return studentRepository.findAllByCourseId(courseId);
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("El estudiante no existe"));
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
