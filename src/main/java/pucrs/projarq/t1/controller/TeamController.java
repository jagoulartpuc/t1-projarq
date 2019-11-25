package pucrs.projarq.t1.controller;

import java.util.ArrayList;
import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pucrs.projarq.t1.domain.Review;
import pucrs.projarq.t1.domain.Student;
import pucrs.projarq.t1.domain.Team;
import pucrs.projarq.t1.factory.TeamFactory;
import pucrs.projarq.t1.service.ReviewerService;
import pucrs.projarq.t1.service.StudentService;
import pucrs.projarq.t1.service.TeamService;

@RestController
@RequestMapping("/t1/teams")
@CrossOrigin(origins = "http://localhost:8080")
@RequiredArgsConstructor
public class TeamController {

    private final TeamService teamService;
    private final StudentService studentService;
    private final ReviewerService reviewerService;

    @PostMapping
    public Team postTeam(
            @RequestBody Team team
    ) {
        teamService.insert(team);

        return team;
    }

    @PostMapping("/team/{name}")
    public Team createTeam(@RequestBody ArrayList<Student> students, @PathVariable String name){
        System.out.println("Create team");
        System.out.println(students);
        ArrayList<Student> listStudents = new ArrayList<>();

        for(Student s : students){
            System.out.println(s.getName());
        }

        for(Student s : studentService.getAll()){
            for(Student aux : students){
                if(aux.getName().equals(s.getName())){
                    System.out.println("ACCCCCCCCCCCHEI");
                    listStudents.add(s);
                }
            }
        }

        System.out.println("Lista do Team");
        for(Student s : listStudents){
            System.out.println(s.getCpf());
        }

        Team team = TeamFactory.createTeam(name, listStudents);
        teamService.insert(team);
        return team;

    }

    @PostMapping("/participant")
    public String postParticipant(
            @RequestParam("cpf") String cpf,
            @RequestParam("teamId") String teamId
    ) {
       teamService.insertParticipant(cpf, teamId);

        return cpf;
    }

    @DeleteMapping("/participant")
    public String deleteParticipant(
            @RequestParam("cpf") String cpf,
            @RequestParam("teamId") String teamId
    ) {
        System.out.println("teste delete participant");
        System.out.println(cpf);
        System.out.println(teamId);
        teamService.deleteParticipant(cpf, teamId);

        return cpf;
    }



    @GetMapping
    public List<Team> getAll() {
        return teamService.findAll();
    }

    @GetMapping("/participant")
    public List<Student> getAllStudents() {
        System.out.println(studentService.getAll());
        return studentService.getAll();
    }

    @GetMapping("/{teamId}")
    public Team getTeam(
            @PathVariable("teamId") String teamId
    ) {
        return teamService.findById(teamId);
    }

    @GetMapping("/participant/{cpf}")
    public Student getParticipant(
            @PathVariable("cpf") String cpf
    ) {
        return teamService.findByCpf(cpf);
    }

    @DeleteMapping
    public Team deleteTeam(
            @RequestBody Team team
    ) {
        return teamService.delete(team);
    }

    //@DeleteMapping("/participant")
    //public boolean removeParticipant(
    //        @RequestBody Student student,
    //        @RequestParam("teamId") String teamId
    //) {
    //    return teamService.removeParticipant(student, teamId);
    //
    //}

    @PostMapping("/review")
    public Team putReviewToTeam(
            @RequestBody Review review,
            @RequestParam String teamId
    ) {
        reviewerService.insertReviewToTeam(teamId, review);
        return teamService.findById(teamId);
    }
}