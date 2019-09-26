package pucrs.projarq.t1.repository;

import org.springframework.stereotype.Component;
import pucrs.projarq.t1.domain.Team;

import java.util.ArrayList;
import java.util.List;

@Component
public class TeamRepository {

    private List<Team> repository;

    public TeamRepository(){
        repository = new ArrayList<Team>();
    }

    public List<Team> all() {
        return repository;
    }

    public boolean save(Team t){
        return repository.add(t);
    }

    public Team getById(int id){
        for(Team team : repository){
            if(id == team.getId()){
                return team;
            }
        }
            return null;
    }
}
