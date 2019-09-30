package pucrs.projarq.t1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import pucrs.projarq.t1.domain.Team;
import pucrs.projarq.t1.repository.TeamDataBase;
import pucrs.projarq.t1.service.ReviewerService;
import pucrs.projarq.t1.service.StudentService;
import pucrs.projarq.t1.service.TeamService;

import java.util.ArrayList;

@Controller
public class TeamFormController {

    @Autowired
    TeamController teamController = new TeamController(new TeamService(new TeamDataBase()), new ReviewerService(), new StudentService());

    ArrayList<Team> teamList = new ArrayList<Team>();

    @GetMapping(value="/")
    public ModelAndView index(){
        System.out.println("Team List");
        ModelAndView mav = new ModelAndView("teamList");
        ArrayList<Team> teamList;
        teamList = (ArrayList<Team>) teamController.getAll();
        for(Team t : teamList){
            System.out.println(t);
        }
        mav.addObject("teamList", teamList);

        return mav;
    }

    @GetMapping(value="/team/{teamId}")
    public ModelAndView editTeam(@PathVariable("teamId") String teamId){
        System.out.println("Team Edit");
        System.out.println(teamId);
        ModelAndView mav = new ModelAndView("teamEdit");
        Team team = teamController.getTeam(teamId);
        mav.addObject("team", team);
        mav.addObject("students", team.getStudents());
        mav.addObject("teamReview",team.getReview());

        return mav;
    }

    @GetMapping(value="/team/review/{teamId}")
    public ModelAndView editReview(@PathVariable("teamId") String teamId){
        System.out.println("Edit Review");
        System.out.println(teamId);
        ModelAndView mav = new ModelAndView("reviewEdit");
        Team team = teamController.getTeam(teamId);
        mav.addObject("team", team);
        mav.addObject("teamReview", team.getReview());
        return mav;
    }

    @GetMapping(value="/team/create")
    public ModelAndView createTeam(){
        System.out.println("Create Team");
        ModelAndView mav = new ModelAndView("teamForm");
        mav.addObject("students", teamController.getAllStudents());
        return mav;
    }
}
