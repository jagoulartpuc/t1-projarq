package pucrs.projarq.t1.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pucrs.projarq.t1.domain.Student;
import pucrs.projarq.t1.domain.Team;
import pucrs.projarq.t1.service.TeamService;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/api")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping(path = "/team")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(teamService.all());
    }

    @PostMapping(path = "/team",  consumes = "application/json")
    public ResponseEntity<?> postTeam(@RequestBody Team team){
       return teamService.save(team) ? ResponseEntity.ok(team) :
               new ResponseEntity<>("Erro ao criar Team.", HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/team/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") int id){
        Team team = teamService.getById(id);
        return team != null ? ResponseEntity.ok(team) :
                new ResponseEntity<>("Erro ao buscar Team.", HttpStatus.BAD_REQUEST);
    }
}