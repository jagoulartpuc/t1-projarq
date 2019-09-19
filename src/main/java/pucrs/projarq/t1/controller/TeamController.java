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
import org.springframework.web.bind.annotation.RestController;
import pucrs.projarq.t1.domain.Team;
import pucrs.projarq.t1.service.TeamService;

@RestController
@RequestMapping("/t1/teams")
public class TeamController {

    @Autowired
    private TeamService service;

    @PostMapping
    public Team postTeam(
            @RequestBody Team team
    ) {
        service.insert(team);

        return team;
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
    public Team editTeam(
            @RequestBody Team team
    ) {
        return service.update(team);
    }

    @DeleteMapping("/{teamId}")
    public Team deleteTeam(
            @PathVariable("teamId") String teamId
    ) {

        return service.delete(service.findById(teamId));
    }
}
