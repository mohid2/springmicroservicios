package com.microservice.course.http.response;

import com.microservice.course.dto.StudentDto;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class StudentByCourseResponse {
    private String courseName;
    private String teacher;
    List<StudentDto> studentDtoList;

}
