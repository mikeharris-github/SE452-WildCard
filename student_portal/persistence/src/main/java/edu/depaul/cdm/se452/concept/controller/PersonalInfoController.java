package edu.depaul.cdm.se452.concept.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonalInfoController {
    @GetMapping("/personalinfo")
    public ModelAndView showPersonalInfo() {
        ModelAndView mv = new ModelAndView("MyPersonalInfo");
        return mv;
    } 
}
