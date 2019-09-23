package pucrs.projarq.t1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pucrs.projarq.t1.domain.Student;
import pucrs.projarq.t1.service.StudentService;
import pucrs.projarq.t1.service.TeamService;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    public List<Student> findAll(){
        return studentService.findAll();
    }

    public boolean addStudent(Student student){
        return studentService.addStudent(student);
    }


}