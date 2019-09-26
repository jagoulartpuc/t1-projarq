package pucrs.projarq.t1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pucrs.projarq.t1.domain.Student;
import pucrs.projarq.t1.service.StudentService;
import pucrs.projarq.t1.service.TeamService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(path ="/student",  consumes = "application/json")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(studentService.findAll());
    }

    @GetMapping(path = "/student/{id}", consumes = "application/json")
    public Student getStudentById(String id){
        return new Student();
    }

    @PostMapping(path = "/student",  consumes = "application/json")
    public boolean postStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

}