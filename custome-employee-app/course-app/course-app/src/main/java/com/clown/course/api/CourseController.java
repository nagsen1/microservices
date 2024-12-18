package com.clown.course.api;

import com.clown.course.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/courses")
    public List<Course> getAllCourses(){

        return Arrays.asList(new Course(1, "Java", "1 month", 2000d));

    }

    @GetMapping("/coursesinstring")
    public String getAllCoursesInString(){

        String address = restTemplate.getForObject("http://localhost:8080/addressesinstring", String.class);

        return "1, Java, 1 month, 2000d " + address;

    }

    @GetMapping("/courses/{id}")
    public Course getCourse(int courseId){
        return new Course(courseId, "spring", "2 month", 2000d);
    }

    @PostMapping("/courses")
    public void createCourse(){

    }
}
