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
