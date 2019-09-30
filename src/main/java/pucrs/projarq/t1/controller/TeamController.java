package pucrs.projarq.t1.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pucrs.projarq.t1.domain.Student;
import pucrs.projarq.t1.domain.Team;
<<<<<<< HEAD
=======
import pucrs.projarq.t1.service.ReviewerService;
>>>>>>> origin/jose
import pucrs.projarq.t1.service.TeamService;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class TeamController {

<<<<<<< HEAD
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
=======
    private TeamService service;

    private ReviewerService reviewerService;

    @Autowired
    public TeamController(TeamService teamService, ReviewerService reviewerService){
        this.service = teamService;
        this.reviewerService = reviewerService;
    }


    @PostMapping
    public Team postTeam(
            @RequestBody Team team
    ) {
        service.insert(team);

        return team;
    }

    @PostMapping("/participant")
    public Student postParticipant(
            @RequestBody Student participant,
            @RequestParam("teamId") String teamId
    ) {
        service.insertParticipant(participant, teamId);

        return participant;
    }

    @GetMapping
    public List<Team> getAll() {
        return service.findAll();
    }

    @GetMapping("/{teamId}")
    public Team getTeam(
            @PathVariable("teamId") String teamId
    ) {
        return service.findById(teamId);
    }

    @DeleteMapping("/{teamId}")
    public Team deleteTeam(
            @PathVariable("teamId") String teamId
    ) {
        Team team = service.findById(teamId);
        return service.delete(team);
    }

    @DeleteMapping("/student/{cpf}")
    public boolean removeParticipant(
            @PathVariable("cpf") String cpf,
            @RequestParam("teamId") String teamId
    ) {
        System.out.println("veja");
        return service.removeParticipant(cpf, teamId);

    }

    @PutMapping("/review")
    public Team putReviewToTeam(
            @RequestBody Review review,
            @RequestParam String teamId
    ) {
        reviewerService.insertReviewToTeam(teamId, review);
        return service.findById(teamId);
>>>>>>> origin/jose
    }
}