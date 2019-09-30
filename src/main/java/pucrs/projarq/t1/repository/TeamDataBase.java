package pucrs.projarq.t1.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Component;
import pucrs.projarq.t1.domain.Student;
import pucrs.projarq.t1.domain.Team;

@Component
public class TeamDataBase {

    private List<Team> teamsBase = new ArrayList<>();

    public TeamDataBase(){
        Team t1 = new Team();
        t1.setName("Time 1");
        t1.setTeamId("1");
        Student s1 = new Student();
        s1.setName("S1 teste");
        s1.setCpf("190");
        Student s2 = new Student();
        s2.setName("s2 teste");
        s2.setCpf("20");
        s1.setCourse("Ciencia da Computação");
        s2.setCourse("Engenharia de Software");
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        t1.setStudents(students);
        teamsBase.add(t1);
    }

    public List<Team> getTeamsBase() {
        return teamsBase;
    }

    public void addTeam(Team team) {
        teamsBase.add(team);
    }

    public Team getById(String  id) {
        for (Team team: teamsBase) {
            if (team.getTeamId().equals(id)) {
                return team;
            }
        }
        return null;
    }

    public Team deleteTeam(Team team) {
        Team aux = team;
        teamsBase.remove(team);
        return aux;
    }

    public void addParticipant(Student participant, String teamId) {
        getById(teamId).getStudents().add(participant);
    }

    public boolean removeParticipant(String cpf, String teamId) {
        Optional<Student> participant = getById(teamId).getStudents()
                .stream().filter(s -> s.getCpf().equals(cpf)).findFirst();

        return getById(teamId).getStudents().remove(participant);
    }



}
