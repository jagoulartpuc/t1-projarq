package pucrs.projarq.t1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pucrs.projarq.t1.domain.Student;
import pucrs.projarq.t1.repository.StudentDataBase;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentDataBase studentDataBase;


    public List<Student> findAll(){return studentDataBase.getAll();}

    public boolean addStudent(Student student){
        return studentDataBase.addStudent(student);
    }



}