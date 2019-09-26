package pucrs.projarq.t1.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pucrs.projarq.t1.domain.Team;
import pucrs.projarq.t1.repository.TeamRepository;

@Service
public class TeamService {

    @Autowired
    TeamRepository teamRepository;

    public boolean save(Team team) {
        return teamRepository.save(team);
    }

    public List<Team> all(){
        return teamRepository.all();
    }

    public Team getById(int id){
        return teamRepository.getById(id);
    }
}
