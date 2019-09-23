package pucrs.projarq.t1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pucrs.projarq.t1.domain.Student;
import pucrs.projarq.t1.service.StudentService;
import pucrs.projarq.t1.service.TeamService;

import java.util.List;

@Controller
@RequestMapping("/t1")
public class StudentController {

    @Autowired
    private StudentService studentService;

    public List<Student> findAll(){
        return studentService.findAll();
    }

    @PostMapping(path = "/student",  consumes = "application/json")
    public boolean addStudent(Student student){
        return studentService.addStudent(student);
    }


}