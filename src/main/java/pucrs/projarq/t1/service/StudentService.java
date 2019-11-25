package pucrs.projarq.t1.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pucrs.projarq.t1.domain.Student;
import pucrs.projarq.t1.util.SingletonStudentsList;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
	
	TeamService teamService = new TeamService();

    public List<Student> getAll(){
        return SingletonStudentsList.getInstance().getStudents();
    }
    
    public boolean deleteStudent(String cpf) {
    	for(Student s : SingletonStudentsList.getInstance().getStudents()) {
    		if(s.getCpf().equals(cpf)) {
    			SingletonStudentsList.getInstance().getStudents().remove(s);
    			return true;
    		}
    	}
    	return false;
    }

}
