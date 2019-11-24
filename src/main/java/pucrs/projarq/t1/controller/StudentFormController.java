package pucrs.projarq.t1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import pucrs.projarq.t1.domain.Student;
import pucrs.projarq.t1.domain.Team;

import java.util.ArrayList;

@Controller
public class StudentFormController {

    @Autowired
    StudentController studentController;

    @GetMapping("/student/list")
    public ModelAndView index(){
        System.out.println("Student List");
        ModelAndView mav = new ModelAndView("studentList");
        ArrayList<Student> studentList;
        studentList = (ArrayList<Student>) studentController.getAll();
        for(Student s : studentList){
            System.out.println(s);
        }
        mav.addObject("studentList", studentList);

        return mav;
    }



}
