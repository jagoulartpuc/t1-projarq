package pucrs.projarq.t1.repository;

import org.springframework.stereotype.Component;
import pucrs.projarq.t1.domain.Student;
import pucrs.projarq.t1.domain.Team;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Component
public class TeamRepository {

    private List<Team> repository;

    public TeamRepository(){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();

        s1.setId(10);
        s1.setName("Lucas");
        s1.setCourse("Software");


        s2.setId(22);
        s2.setName("Carlos");
        s2.setCourse("Analise");


        s3.setId(33);
        s3.setName("Maria");
        s3.setCourse("CC");


        s4.setId(44);
        s4.setName("Carol");
        s4.setCourse("Engenharia");


        s5.setId(23);
        s5.setName("Antonio");
        s5.setCourse("EC");

        Team t1 = new Team();
        t1.setTeamId("123");
        t1.setName("Time Noturno");

        Team t2 = new Team();
        t2.setTeamId("3232");
        t2.setName("Time Criador");


        ArrayList<Student> list_1 = new ArrayList<Student>();
        list_1.add(s1);
        list_1.add(s2);
        list_1.add(s3);


        ArrayList<Student> list_2 = new ArrayList<Student>();
        list_2.add(s4);
        list_2.add(s5);

        t1.setStudents(list_1);
        t2.setStudents(list_2);

        repository = new ArrayList<Team>();

        repository.add(t1);
        repository.add(t2);
    }

    public List<Team> all() {
        return repository;
    }

    public boolean save(Team t){
        return repository.add(t);
    }

    public Team getById(String id){
        for(Team team : repository){
            if(id.equals(team.getTeamId())){
                return team;
            }
        }
            return null;
    }
}
