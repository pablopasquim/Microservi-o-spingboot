package br.com.up.ms_students.http;

import br.com.up.ms_students.config.CourseOpenFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentsREST {

    @Autowired
    CourseOpenFeign courseOpenFeign;

    List<Students> students = List.of(

            new Students(1, "Pablo"),
            new Students(1, "Raqueline")
    );

    @GetMapping
    public List<Students> allStudents(){

        List<Course> courses = courseOpenFeign.allCourses();
        System.out.println("Lista de Cursos");
        courses.forEach(c ->{
            System.out.println(c.getName());
        });
        return students;
    }

    @GetMapping("/{id}")
    public Students findByld(@PathVariable Integer id){
        return students.get(id);
    }

}
