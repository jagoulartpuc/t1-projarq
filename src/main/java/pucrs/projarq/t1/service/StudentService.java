package pucrs.projarq.t1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pucrs.projarq.t1.domain.Student;
import pucrs.projarq.t1.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> all(){
        return studentRepository.all();
    }

    public boolean save(Student student){
        return studentRepository.save(student);
    }

    public Student getById(int id){
        return studentRepository.getById(id);
    }


}