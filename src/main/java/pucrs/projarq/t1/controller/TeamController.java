package pucrs.projarq.t1.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pucrs.projarq.t1.domain.Review;
import pucrs.projarq.t1.domain.Student;
import pucrs.projarq.t1.domain.Team;
import pucrs.projarq.t1.service.ReviewerService;
import pucrs.projarq.t1.service.TeamService;

@RestController
@RequestMapping("/t1/teams")
public class TeamController {

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
    }
}
