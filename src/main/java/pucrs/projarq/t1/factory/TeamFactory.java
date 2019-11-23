package pucrs.projarq.t1.factory;

import org.springframework.stereotype.Component;
import pucrs.projarq.t1.domain.Student;
import pucrs.projarq.t1.domain.Team;

import java.util.List;

@Component
public class TeamFactory {

    public static Team createTeam(String name, List<Student> students) {
        return new Team(name, students);
    }
}
