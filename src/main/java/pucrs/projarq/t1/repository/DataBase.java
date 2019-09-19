package pucrs.projarq.t1.repository;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import pucrs.projarq.t1.domain.Team;

@Getter
@Setter
@Component
public class DataBase {

    private List<Team> teamsBase;

    public void addTeam(Team team) {
        teamsBase.add(team);
    }

    public Team getById(String id) {
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
        for (Team team: teamsBase) {
            if (team.getTeamId().equals(newTeam.getTeamId())) {
                team.setStudents(newTeam.getStudents());
                return team;
            }
        }
        return null;
    }

}
