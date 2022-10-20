package com.example.boot1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ControlsCourse {
    //retrieve courses anfd give them back
    @RequestMapping("/courses")
    public List<Course> getAllCourses(){
        return Arrays.asList(new Course(1,"Learn Java","CaveOfprogramming"),
                new Course(1,"Spring Boot","in28min"),
                new Course(1,"Spring","in28min")
        );
    }


}
