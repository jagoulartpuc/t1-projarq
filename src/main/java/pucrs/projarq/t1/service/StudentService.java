package pucrs.projarq.t1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pucrs.projarq.t1.domain.Student;
import pucrs.projarq.t1.repository.StudentDataBase;

@Service
public class StudentService {

    @Autowired
    StudentDataBase studentDataBase = new StudentDataBase();

    public StudentDataBase getAll(){
        return studentDataBase;
    }

    public Student findByName(String name){
        return studentDataBase.findByName(name);
    }
}
