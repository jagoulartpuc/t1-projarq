package pucrs.projarq.t1.repository;

import pucrs.projarq.t1.domain.Student;

import java.util.ArrayList;

public class StudentDataBase {

    private ArrayList<Student> studentBase = new ArrayList<Student>();

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