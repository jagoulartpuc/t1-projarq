package pucrs.projarq.t1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import pucrs.projarq.t1.domain.Student;
import pucrs.projarq.t1.domain.Team;

@Controller
public class TeamFormController {

    @Autowired
    TeamController teamController;

    @Autowired
    StudentController studentController;

    @GetMapping(path = "/teamForm")
    public ModelAndView teamForm(){
        ModelAndView mav = new ModelAndView("views/teamForm/teamForm.html");
        mav.addObject("studentTeamList", teamController.getTeam().getStudents());
        mav.addObject("studentList",studentController.findAll());
        return mav;
    }

}