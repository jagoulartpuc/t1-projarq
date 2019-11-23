package pucrs.projarq.t1.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pucrs.projarq.t1.domain.Student;
import pucrs.projarq.t1.util.SingletonStudentsList;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    public List<Student> getAll(){
        return SingletonStudentsList.getInstance().getStudents();
    }

}
