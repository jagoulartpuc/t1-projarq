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

    public List<Team> getAll(){
        return teamsBase;
    }


}
