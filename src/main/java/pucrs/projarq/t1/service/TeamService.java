package pucrs.projarq.t1.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pucrs.projarq.t1.domain.Student;
import pucrs.projarq.t1.domain.Team;
import pucrs.projarq.t1.repository.DataBase;

@Service
public class TeamService {

    @Autowired
    private DataBase dataBase;

    public void insert(Team team) {
        if (validateTeam(team)) {
            dataBase.addTeam(team);
        }

        throw new RuntimeException();
    }

    private boolean validateTeam(Team team) {
        int countES = 0, countCC = 0, countEC = 0, countSI = 0;
        for (Student student: team.getStudents()) {
            if (student.getCourse().equals("Engenharia de Software")) {
                countES++;
            } else if (student.getCourse().equals("Ciência da Computação")) {
                countCC++;
            } else if (student.getCourse().equals("Engenharia da Computação")) {
                countEC++;
            } else if (student.getCourse().equals("Sistemas de Informação")) {
                countSI++;
            }
        }

        return (countES < team.getStudents().size() || countCC < team.getStudents().size() ||
                countEC < team.getStudents().size() || countSI < team.getStudents().size());


    }

    public List<Team> findAll() {
        return dataBase.getTeamsBase();
    }

    public Team update(Team team) {
        return dataBase.updateTeam(team);
    }

    public Team findById(String id) {
        return dataBase.getById(id);
    }

    public Team delete(Team team) {
        return dataBase.deleteTeam(team);
    }
}
