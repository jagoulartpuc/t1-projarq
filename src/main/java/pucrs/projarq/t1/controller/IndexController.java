package pucrs.projarq.t1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @Autowired
    TeamFormController teamFormController;

    @GetMapping(value="/")
    public ModelAndView index(){
        System.out.println("");
        ModelAndView mav = new ModelAndView("/views/index/index.html");
        mav.addObject("message",new String("Hackatona App"));
        return mav;
    }

    @GetMapping(value="/studentForm")
    public ModelAndView studentForm(){
        System.out.println("Student Form");
        return teamFormController.teamForm();
    }
}