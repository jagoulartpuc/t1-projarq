package pucrs.projarq.t1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TeamFormController {

    @Autowired
    TeamController teamController;


    public ModelAndView teamForm(){

        teamController.tea

        ModelAndView mav = new ModelAndView("views/teamForm/teamForm.html");
        return mav;
    }


}
