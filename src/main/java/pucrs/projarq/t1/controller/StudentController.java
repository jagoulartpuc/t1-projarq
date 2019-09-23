package pucrs.projarq.t1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pucrs.projarq.t1.domain.Student;
import pucrs.projarq.t1.service.StudentService;
import pucrs.projarq.t1.service.TeamService;

import java.util.List;

@RestController
@RequestMapping("/t1")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(path ="/student",  consumes = "application/json")
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @PostMapping(path = "/student",  consumes = "application/json")
    public boolean addStudent(Student student){
        return studentService.addStudent(student);
    }
}