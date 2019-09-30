package pucrs.projarq.t1.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pucrs.projarq.t1.domain.Review;
import pucrs.projarq.t1.domain.Student;
import pucrs.projarq.t1.domain.Team;
import pucrs.projarq.t1.service.ReviewerService;
import pucrs.projarq.t1.service.StudentService;
import pucrs.projarq.t1.service.TeamService;

@RestController
@RequestMapping("/t1/teams")
@CrossOrigin(origins = "http://localhost:3000")
public class TeamController {

    private TeamService service;
    private ReviewerService reviewerService;
    private StudentService studentService;

    @Autowired
    public TeamController(TeamService teamService, ReviewerService reviewerService, StudentService studentService){
        this.service = teamService;
        this.reviewerService = reviewerService;
        this.studentService = studentService;
    }

    @PostMapping
    public Team postTeam(
            @RequestBody Team team
    ) {
        service.insert(team);

        return team;
    }

    @PostMapping("/team/{name}")
    public Team createTeam(@RequestBody ArrayList<Student> students, @PathVariable String name){
        System.out.println("Create team");
        System.out.println(students);
        Team team = new Team();
        ArrayList<Student> listStudents = new ArrayList<Student>();

        for(Student s : students){
            System.out.println(s.getName());
        }

        for(Student s : service.findAllStudents()){
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

        team.setName(name);
        team.setStudents(listStudents);
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
        System.out.println(service.findAllStudents());
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

    @PostMapping("/review")
    public Team putReviewToTeam(
            @RequestBody Review review,
            @RequestParam String teamId
    ) {
        reviewerService.insertReviewToTeam(teamId, review);
        return service.findById(teamId);
    }
}