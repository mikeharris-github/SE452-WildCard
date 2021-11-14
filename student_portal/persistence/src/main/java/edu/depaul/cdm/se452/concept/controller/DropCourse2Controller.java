package edu.depaul.cdm.se452.concept.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DropCourse2Controller {
    @GetMapping("/dropclass2")
    public ModelAndView showGreeting() {
        ModelAndView mv = new ModelAndView("DropClass2");
        mv.addObject("name", "Hello SE352/452 from test");
        return mv;
    } 
}