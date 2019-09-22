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
import pucrs.projarq.t1.json.ReviewJSON;
import pucrs.projarq.t1.json.StudentJSON;
import pucrs.projarq.t1.json.TeamJSON;
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
    public TeamJSON postTeam(
            @RequestBody TeamJSON teamJSON
    ) {
        Team team = TeamJSON.from(teamJSON);
        service.insert(team);

        return TeamJSON.toJson(team);
    }

    @PostMapping("/participant")
    public StudentJSON postParticipant(
            @RequestBody StudentJSON participantJSON,
            @RequestParam("teamId") String teamId
    ) {
        Student participant = StudentJSON.from(participantJSON);
        service.insertParticipant(participant, teamId);

        return StudentJSON.toJson(participant);
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

    @PutMapping()
    public TeamJSON editTeam(
            @RequestBody TeamJSON teamJSON
    ) {
        Team team = TeamJSON.from(teamJSON);

        return TeamJSON.toJson(team);
    }

    @DeleteMapping("/{teamId}")
    public Team deleteTeam(
            @PathVariable("teamId") String teamId
    ) {

        return service.delete(service.findById(teamId));
    }

    @DeleteMapping
    public boolean removeParticipant(
            @RequestBody Student participant,
            @PathVariable("teamId") String teamId
    ) {
        return service.removeParticipant(participant, teamId);

    }

    @PutMapping("/review")
    public TeamJSON putReviewToTeam(
            @RequestBody ReviewJSON reviewJSON,
            @RequestParam String teamId
    ) {
        Review review = ReviewJSON.from(reviewJSON);
        reviewerService.insertReviewToTeam(teamId, review);
        return TeamJSON.toJson(service.findById(teamId));
    }
}
