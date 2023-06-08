package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/student")
    public Student getStudent(){
        return new Student("Ruta","Kulkarni");
    }
    @GetMapping("/studentslist")
    public List<Student> getStudents(){
        List<Student> students=new ArrayList<>();
        students.add(new Student("Rahul","Kulkarni"));
        students.add(new Student("Jayanti","Kulkarni"));
        return students;
    }

    @GetMapping("/student/{fname}/{lname}")
    public Student studentPathVariable(@PathVariable("fname") String fname, @PathVariable("lname") String lname)
    {
        return new Student(fname,lname);
    }

    //rest API to handle query parameters
    //http://localhost:8080/student/query?fname=Ruta&lname=Kulkarni
    @GetMapping("/student/query")
    public Student studentQueryParam(@RequestParam(name="fname") String fname, @RequestParam(name="lname") String lname)
    {
        return new Student(fname,lname);
    }

}
