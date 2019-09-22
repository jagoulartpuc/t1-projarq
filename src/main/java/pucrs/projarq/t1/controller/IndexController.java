package pucrs.projarq.t1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping(value="/")
    public ModelAndView index(){
        System.out.println("Index");
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("message",new String("Hackatona App"));
        return mav;
    }

    @GetMapping(value="/studentForm")
    public ModelAndView studentForm(){
        System.out.println("Student Form");
        ModelAndView mav = new ModelAndView("studentForm");
        return mav;
    }

    @GetMapping(value="/teamForm")
    public ModelAndView teamForm(){
        System.out.println("Team Form");
        ModelAndView mav = new ModelAndView("teamForm");
        return mav;
    }
}