package pucrs.projarq.t1.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import pucrs.projarq.t1.domain.Student;
import pucrs.projarq.t1.domain.Team;

@Component
public class TeamDataBase {

    private static List<Team> teamsBase = new ArrayList<>();

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

    public Team updateTeam(Team newTeam) {
        Team team = getById(newTeam.getTeamId());
        team.setStudents(newTeam.getStudents());

        return team;
    }

    public void addParticipant(Student participant, String teamId) {
        getById(teamId).getStudents().add(participant);
    }

    public boolean removeParticipant(Student participant, String teamId) {
        return getById(teamId).getStudents().remove(participant);
    }

}
