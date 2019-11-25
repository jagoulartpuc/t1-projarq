package pucrs.projarq.t1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pucrs.projarq.t1.domain.Student;
import pucrs.projarq.t1.service.StudentService;

@RestController
@RequestMapping("/t1/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAll() {
        return studentService.getAll();
    }
    
    @DeleteMapping
    public boolean deleteStudent(@RequestParam("cpf") String cpf){
    	return studentService.deleteStudent(cpf);
    }
}
