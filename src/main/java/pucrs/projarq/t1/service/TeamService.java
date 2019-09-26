package pucrs.projarq.t1.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pucrs.projarq.t1.domain.Student;
import pucrs.projarq.t1.domain.Team;
import pucrs.projarq.t1.exception.NotAValidTeamException;
import pucrs.projarq.t1.repository.TeamDataBase;

@Service
public class TeamService {

    @Autowired
    private TeamDataBase teamDataBase;

    public boolean insert(Team team) {
        return teamDataBase.addTeam(team);
    }

    public List<Team> getAll(){
        return teamDataBase.getAll();
    }

    public TeamDataBase getTeamDataBase() {
        return teamDataBase;
    }
}
