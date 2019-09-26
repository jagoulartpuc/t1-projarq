package pucrs.projarq.t1.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pucrs.projarq.t1.domain.Student;
import pucrs.projarq.t1.domain.Team;
import pucrs.projarq.t1.service.TeamService;

@RestController
@RequestMapping("/api")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @Autowired
    private Team team;

    @GetMapping(path = "/team", consumes = "application/json")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(List.of(new ArrayList<Team>()));
    }

    @PostMapping(path = "/team",  consumes = "application/json")
    public ResponseEntity insert(@RequestBody Team t){
        return (ResponseEntity) (teamService.insert(t) ? ResponseEntity.ok() : ResponseEntity.ok());
    }

    @GetMapping("/team/{id}")
    public ResponseEntity getById(){
        return (ResponseEntity) ResponseEntity.ok();
    }


    public Team getTeam(){return team;}

}