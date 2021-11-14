package edu.depaul.cdm.se452.concept.controller;

<<<<<<< HEAD


import org.springframework.beans.factory.annotation.Value;

=======
import org.springframework.beans.factory.annotation.Value;
>>>>>>> 6f412ba2c196414d0ac55bced96b6e07680cccde
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
<<<<<<< HEAD

import org.springframework.web.servlet.ModelAndView;



=======
import org.springframework.web.servlet.ModelAndView;

>>>>>>> 6f412ba2c196414d0ac55bced96b6e07680cccde
@Controller

public class LogInController {
    @Value( "${spring.profiles.active}" )
    private String login;

<<<<<<< HEAD
@Value( "${spring.profiles.active}" )

private String login;



@PostMapping("/login")
public String test() {
  return "studentportal_homepage";
}

}




=======
    @GetMapping("/login")
    public ModelAndView showGreeting() {
        //uses the name of the HTML file for MV
        ModelAndView mv = new ModelAndView("login");
        mv.addObject("name" , "Welcome to the Student Portal for SE452 group 7. Please log in below");
        return mv;

    }

}
>>>>>>> 6f412ba2c196414d0ac55bced96b6e07680cccde
