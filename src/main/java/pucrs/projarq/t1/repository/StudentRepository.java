package pucrs.projarq.t1.repository;

import org.springframework.stereotype.Component;
import pucrs.projarq.t1.domain.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Component
public class StudentRepository {

    private List<Student> repository;

    public StudentRepository(){
        repository = new ArrayList<>();
        Student s1 = new Student();
        s1.setName("Mauricio");
        s1.setCourse("Software");
        s1.setId(123);
        Student s2 = new Student();
        s2.setName("Joao");
        s2.setCourse("Informatica");
        s2.setId(1);
        repository.add(s1);
        repository.add(s2);
    }

    public boolean save(Student s)   {
        return repository.add(s);
    }

    public List<Student> all(){
        return repository;
    }

    public Student getById(int id){
        for(Student student : repository){
            if(id == student.getId()){
                return student;
            }
        }
        return null;
    }
}
