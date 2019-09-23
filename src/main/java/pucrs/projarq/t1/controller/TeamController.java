package pucrs.projarq.t1.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pucrs.projarq.t1.domain.Student;
import pucrs.projarq.t1.domain.Team;
import pucrs.projarq.t1.service.TeamService;

@RestController
@RequestMapping("/t1")
public class TeamController {

    @Autowired
    private TeamService service;

    @Autowired
    private Team team;

    @PostMapping(path = "/team",  consumes = "application/json")
    public void insert(@RequestBody Team t){service.insert(t);}

    @GetMapping("/team")
    public List<Team> getAll(){
        return service.getAll();
    }

    @PostMapping(path = "/addAluno", consumes = "application/json")
    public void addAluno(@RequestBody Student t){
        System.out.print(t);
    }

    public Team getTeam(){return team;}

}