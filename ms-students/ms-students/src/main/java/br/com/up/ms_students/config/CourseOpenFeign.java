package br.com.up.ms_students.config;
import br.com.up.ms_students.http.Course;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
@FeignClient(name = "ms-courses",
                url = "localhost:8082",
                path = "/course")
public interface CourseOpenFeign {

    @GetMapping
    public List<Course> allCourses();


    @GetMapping("/{id}")
    public Course findByld(@PathVariable Integer id);
}