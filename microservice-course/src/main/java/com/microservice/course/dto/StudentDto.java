package com.microservice.course.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class StudentDto {
    private String firstname;
    private  String lastname;
    private String email;
    private Long courseId;
}
