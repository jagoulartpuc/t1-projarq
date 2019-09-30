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

    @Autowired
    private TeamService service;

    @Autowired
    private ReviewerService reviewerService;

    @PostMapping
    public Team postTeam(
            @RequestBody Team team
    ) {
        service.insert(team);

        return team;
    }

    @PostMapping("/participant")
    public String postParticipant(
            @RequestParam("cpf") String cpf,
            @RequestParam("teamId") String teamId
    ) {
        service.insertParticipant(cpf, teamId);

        return cpf;
    }

    @GetMapping
    public List<Team> getAll() {
        return service.findAll();
    }

    @GetMapping("/participant")
    public List<Student> getAllStudents() {
        return service.findAllStudents();
    }

    @GetMapping("/{teamId}")
    public Team getTeam(
            @PathVariable("teamId") String teamId
    ) {
        return service.findById(teamId);
    }

    @GetMapping("/participant/{cpf}")
    public Student getParticipant(
            @PathVariable("cpf") String cpf
    ) {
        return service.findByCpf(cpf);
    }

    @DeleteMapping
    public Team deleteTeam(
            @RequestBody Team team
    ) {
        return service.delete(team);
    }

    @DeleteMapping("/participant")
    public boolean removeParticipant(
            @RequestBody Student student,
            @RequestParam("teamId") String teamId
    ) {
        return service.removeParticipant(student, teamId);

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
