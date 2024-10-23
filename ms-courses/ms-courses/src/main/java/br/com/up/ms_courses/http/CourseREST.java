package br.com.up.ms_courses.http;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseREST {

    List<Course> courses = List.of(

            new Course(1, "ADS"),
            new Course(2, "Ciência da Computação")
    );

    @GetMapping
    public List<Course> allCourses() {
        return courses;
    }
    @GetMapping("/{id}")
    public Course findByld(@PathVariable Integer id) {
        var course = courses
                .stream()
                .filter(c -> c.getId() == id )
                .findFirst()
                .orElse(null);
        return course;
    }
}