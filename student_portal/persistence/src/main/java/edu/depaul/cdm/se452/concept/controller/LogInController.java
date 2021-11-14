package edu.depaul.cdm.se452.concept.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogInController {
    @Value( "${spring.profiles.active}" )
    private String login;

    @GetMapping("/login")
    public ModelAndView showGreeting() {
        //uses the name of the HTML file for MV
        ModelAndView mv = new ModelAndView("login");
        mv.addObject("name" , "Welcome to the Student Portal for SE452 group 7. Please log in below");
        return mv;

    }

}