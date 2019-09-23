package pucrs.projarq.t1.repository;

import org.springframework.stereotype.Component;
import pucrs.projarq.t1.domain.Student;

import java.util.ArrayList;

@Component
public class StudentDataBase {

    public StudentDataBase(){studentBase.add(new Student("teste","teste","teste","teste"));}

    private static ArrayList<Student> studentBase = new ArrayList<Student>();

    public ArrayList<Student> getStudentDataBase(){
        return studentBase;
    }

    public boolean addStudent(Student student){
        return studentBase.add(student);
    }

    public ArrayList<Student> getAll(){
        return studentBase;
    }



}