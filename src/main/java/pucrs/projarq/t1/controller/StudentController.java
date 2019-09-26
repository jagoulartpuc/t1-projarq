package pucrs.projarq.t1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pucrs.projarq.t1.domain.Student;
import pucrs.projarq.t1.service.StudentService;
import pucrs.projarq.t1.service.TeamService;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @GetMapping(path = "/student/{id}")
    public ResponseEntity getById(@PathVariable("id") int id) {
        Student student = studentService.getById(id);
        return student != null ? ResponseEntity.ok(student) :
                new ResponseEntity<>("Erro ao buscar Student.", HttpStatus.BAD_REQUEST);
    }

    @GetMapping(path = "/student", produces = "application/json")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(studentService.all());
    }

    @PostMapping(path = "/student", consumes = "application/json")
    public ResponseEntity postStudent(@RequestBody Student student) {
        return studentService.save(student) ? ResponseEntity.ok(student) :
                new ResponseEntity<>("Erro ao criar Student.", HttpStatus.BAD_REQUEST);
    }

}