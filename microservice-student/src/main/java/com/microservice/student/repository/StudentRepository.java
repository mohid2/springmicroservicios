package com.microservice.student.repository;

import com.microservice.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    @Query("select s from Student s where courseId=:courseId")
    List<Student> findAllByCourse(Long courseId);
    List<Student> findAllByCourseId(Long courseId);
}
