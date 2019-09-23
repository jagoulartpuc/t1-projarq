package pucrs.projarq.t1.repository;

import org.springframework.stereotype.Component;
import pucrs.projarq.t1.domain.Student;

import java.util.ArrayList;

@Component
public class StudentDataBase {

    private StudentDataBase(){
        Student s1 = new Student();
        s1.setName("Mauricio");
        s1.setCourse("Software");
        studentBase.add(s1);
    }

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