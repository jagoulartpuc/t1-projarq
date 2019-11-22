package pucrs.projarq.t1.repository;

import org.springframework.stereotype.Component;
import pucrs.projarq.t1.domain.Student;

import java.util.ArrayList;

@Component
public class StudentDataBase {

    ArrayList<Student> studentDataBase = new ArrayList<>();

    public ArrayList<Student> getAll(){
        return studentDataBase;
    }

    public Student findByName(String name){
        for (Student s : studentDataBase){
            if (s.getName().equals(name)){
                return s;
            }
        }
        return null;
    }
}